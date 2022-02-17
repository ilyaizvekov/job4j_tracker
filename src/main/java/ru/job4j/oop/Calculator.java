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

    public int sumAllOperation() {
        return Calculator.sum(10) + multiply(5) + Calculator.minus(20) + divide(5);
    }

    public static void main(String[] args) {
        int resultSum = Calculator.sum(10);
        System.out.println(resultSum);
        Calculator calculatorMultiply = new Calculator();
        int rslOne = calculatorMultiply.multiply(5);
        System.out.println(rslOne);
        int resultMinus = Calculator.minus(20);
        System.out.println(resultMinus);
        Calculator calculatorDivide = new Calculator();
        int rslSecond = calculatorDivide.divide(5);
        System.out.println(rslSecond);
        Calculator sumAll = new Calculator();
        int resultSumAll = sumAll.sumAllOperation();
        System.out.println(resultSumAll);
    }
}
