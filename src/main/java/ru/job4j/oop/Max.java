package ru.job4j.oop;

public class Max {

    public double max(double first, double second) {
        double result = first > second ? first : second;
        return result;
    }

    public double max(double first, double second, double third) {
        double tmp = max(second, third);
        return max(first, tmp);
    }

    public double max(double first, double second, double third, double fourth) {
        double tmpFirstSecond = max(first, second);
        double tmpThirdFourth = max(third, fourth);
        return max(tmpFirstSecond, tmpThirdFourth);
    }
}
