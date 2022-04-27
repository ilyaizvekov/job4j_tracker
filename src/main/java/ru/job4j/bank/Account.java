package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель банковского счета
 * @author ILYA IZVEKOV
 * @version 1.0
 */
public class Account {
    /**
     * Поле реквизит аккаунта
     */
    private String requisite;
    /**
     * Поле баланс аккаунта
     */
    private double balance;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param requisite - реквизит
     * @param balance - баланс
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Функция получения значения поля {@link Account#requisite}
     * @return возращает реквизиты аккаунта
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Функция определения реквизита аккаунта
     * @param requisite - реквизит
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Функция получения значения поля {@link Account#balance}
     * @return возращает баланс аккаунта
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Функция определения баланса аккаунта
     * @param balance - баланс
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
