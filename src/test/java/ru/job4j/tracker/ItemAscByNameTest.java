package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ItemAscByNameTest {

    @Test
    public void whenItemAscByName() {
        List<Item> items = Arrays.asList(
                new Item("Ivan"),
                new Item("Alex"),
                new Item("Kirill")
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("Alex"),
                new Item("Ivan"),
                new Item("Kirill")
        );
        assertThat(items, is(expected));
    }
}