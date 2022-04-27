package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель пользователя банка
 * @author ILYA IZVEKOV
 * @version 1.0
 */
public class User {
    /**
     * Поле номер паспорта
     */
    private String passport;
    /**
     * Поле ФИО
     */
    private String username;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param passport - номер паспорта
     * @param username - ФИО
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Функция получения значения поля {@link User#passport}
     * @return возращает номер паспорта
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Функция определения номера паспорта
     * @param passport - паспорт
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Функция получения значения поля {@link User#username}
     * @return возращает ФИО
     */
    public String getUsername() {
        return username;
    }

    /**
     * Функция определения ФИО
     * @param username - ФИО
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}