package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public Predicate<Person> personPredicate(String key) {
        Predicate<Person> combineName = person -> person.getName().contains(key);
        Predicate<Person> combineSurname = person -> person.getSurname().contains(key);
        Predicate<Person> combinePhone = person -> person.getPhone().contains(key);
        Predicate<Person> combineAddress = person -> person.getAddress().contains(key);
        return combineName.or(combineSurname).or(combinePhone).or(combineAddress);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        Predicate<Person> combine = personPredicate(key);
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
