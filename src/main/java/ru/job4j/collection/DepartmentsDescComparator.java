package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftParts = left.split("/");
        String[] rightParts = right.split("/");
        int firstPartCompare = rightParts[0].compareTo(leftParts[0]);
        if (firstPartCompare != 0) {
            return firstPartCompare;
        }
        return left.compareTo(right);
    }

}