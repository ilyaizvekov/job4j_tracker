package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.name + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat(" - kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat(" - fish");
        black.show();
        Cat nick = new Cat();
        nick.giveNick("Tom");
        nick.eat(" - whiskas");
        nick.show();
    }
}
