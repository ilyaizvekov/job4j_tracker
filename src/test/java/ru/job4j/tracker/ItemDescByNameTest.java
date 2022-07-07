package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ItemDescByNameTest {

    @Test
    public void whenItemDescByName() {
        List<Item> items = Arrays.asList(
                new Item("Ivan"),
                new Item("Alex"),
                new Item("Kirill")
        );
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item("Kirill"),
                new Item("Ivan"),
                new Item("Alex")
        );
        assertThat(items, is(expected));
    }
}