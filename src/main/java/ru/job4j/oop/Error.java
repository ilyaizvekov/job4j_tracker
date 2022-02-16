package ru.job4j.oop;

public class Error {

    private boolean active;

    private int status;

    private String message;

    public Error(){
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error errorFirst = new Error();
        errorFirst.printInfo();
        Error errorSecond = new Error(true, 132, "Error 132");
        errorSecond.printInfo();
        Error errorThird = new Error(false, 23, "Not Error 23");
        errorThird.printInfo();
    }
}
