package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return Calculator.sum(y) + multiply(y) + Calculator.minus(y) + divide(y);
    }

    public static void main(String[] args) {
        int resultSum = Calculator.sum(5);
        System.out.println(resultSum);
        int resultMinus = Calculator.minus(20);
        System.out.println(resultMinus);
        Calculator calculator = new Calculator();
        int rslOne = calculator.multiply(25);
        System.out.println(rslOne);
        int rslSecond = calculator.divide(20);
        System.out.println(rslSecond);
        int rslThird = calculator.sumAllOperation(5);
        System.out.println(rslThird);
    }
}
