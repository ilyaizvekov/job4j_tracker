package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ItemDescByName implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return second.getName().compareTo(first.getName());
    }

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("Ivan"),
                new Item("Alex"),
                new Item("Kirill"),
                new Item("Anton")
        );
        System.out.println(items);
        Collections.sort(items, new ItemDescByName());
        System.out.println(items);
    }
}
