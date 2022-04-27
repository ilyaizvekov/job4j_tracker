package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает модель сервиса банка
 * @author ILYA IZVEKOV
 * @version 1.0
 */
public class BankService {
    /**
     * Поле содержит всех пользователей системы с привязанными
     * к ним счетами.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает один параметр: пользователя, т.е. объект класса User.
     * Метод putIfAbsent проводит проверку, что пользователя нет в системе.
     * @param user - пользовтель.
     */
    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет новый счет к пользователю.
     * Первоначально пользователя нужно найти по номеру паспорта, для этого нужно испльзовать
     * метод findByPassport().
     * Проверка у пользователя наличие счета.
     * После поиска по номеру паспорта - получаем список всех счетов пользователя
     * и добавляется новый счет.
     * @param passport
     * @param account
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            if (!users.get(user).contains(account)) {
                users.get(user).add(account);
            }
        }
    }

    /**
     * Метод принимает один параметр: номер паспорта.
     * @return  пользователя, найденного по номеру паспорта или null.
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет счет пользвателя по
     * @param passport номер паспорта
     * @param requisite реквизит аккаунта
     * @return счет пользователя, найденного по входным параметрам или null если нет счета
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод перечисляет деньги с одного счета на другой счет.
     * @param srcPassport - отправляющий паспорт
     * @param srcRequisite - реквизиты отправляющего
     * @param destPassport - принимающий паспорт
     * @param destRequisite - реквизиты принимающего
     * @param amount - число перевода
     * @return true если перевод прошел, или false если
     * счёт не найден или не хватает денег на счёте srcAccount (с которого переводят)
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccout = findByRequisite(srcPassport, srcRequisite);
        Account destAccout = findByRequisite(destPassport, destRequisite);
        if (srcAccout != null && destAccout != null && srcAccout.getBalance() >= amount) {
            srcAccout.setBalance(srcAccout.getBalance() - amount);
            destAccout.setBalance(destAccout.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
