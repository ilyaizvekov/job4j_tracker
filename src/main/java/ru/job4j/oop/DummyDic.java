package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return eng;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String eng = dic.engToRus("Circumstances - обстоятельства");
        System.out.println("Неизвестное слово. " + eng);
    }
}
