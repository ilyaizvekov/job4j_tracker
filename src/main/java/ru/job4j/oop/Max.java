package ru.job4j.oop;

public class Max {

    public double max(double first, double second) {
        double result = first > second ? first : second;
        return result;
    }

    public double max(double first, double second, double third) {
        return max(first, max(second, third));
    }

    public double max(double first, double second, double third, double fourth) {
        return max(max(first, second), max(third, fourth));
    }
}
