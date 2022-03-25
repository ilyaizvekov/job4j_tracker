package ru.job4j.ex;

import java.util.Objects;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (!value[i].equals(key)) {
                throw new ElementNotFoundException("Элемента нет в исключении");
            }
            rsl = i;
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] array = new String[]{"1", "2", "3", "4"};
        try {
            indexOf(array, "3");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }

}
