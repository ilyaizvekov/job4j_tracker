package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenJobAscByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Ivan", 1),
                new Job("Gena", 3),
                new Job("Vlad", 2)
        );
        Collections.sort(jobs, new JobAscByName());
        List<Job> expected = Arrays.asList(
                new Job("Gena", 3),
                new Job("Ivan", 1),
                new Job("Vlad", 2)
        );
        assertThat(jobs, is(expected));
    }

    @Test
    public void whenJobDescByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Ivan", 1),
                new Job("Gena", 3),
                new Job("Vlad", 2)
        );
        Collections.sort(jobs, new JobDescByName());
        List<Job> expected = Arrays.asList(
                new Job("Vlad", 2),
                new Job("Ivan", 1),
                new Job("Gena", 3)
        );
        assertThat(jobs, is(expected));
    }

    @Test
    public void whenAscByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Ivan", 1),
                new Job("Gena", 3),
                new Job("Vlad", 2)
        );
        Collections.sort(jobs, new JobAscByPriority());
        List<Job> expected = Arrays.asList(
                new Job("Ivan", 1),
                new Job("Vlad", 2),
                new Job("Gena", 3)
        );
        assertThat(jobs, is(expected));
    }

    @Test
    public void whenDescByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Ivan", 1),
                new Job("Gena", 3),
                new Job("Vlad", 2)
        );
        Collections.sort(jobs, new JobDescByPriority());
        List<Job> expected = Arrays.asList(
                new Job("Gena", 3),
                new Job("Vlad", 2),
                new Job("Ivan", 1)
        );
        assertThat(jobs, is(expected));
    }

    @Test
    public void whenCompatorByPriorityAndName() {
        Comparator<Job> cmpPriorityName = new JobAscByPriority().thenComparing(new JobAscByName());
        int rsl = cmpPriorityName.compare(
                new Job("Alex", 0),
                new Job("Max", 0)
        );
        assertThat(rsl, lessThan(1));
    }

    @Test
    public void whenCompatorByNameAndPriority() {
        Comparator<Job> cmpNameAndPriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNameAndPriority.compare(
                new Job("Alex", 1),
                new Job("Max", 2)
        );
        assertThat(rsl, lessThan(1));
    }
}