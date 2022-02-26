package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Иванов Иван Иванович");
        student.setGroup("1-101B");
        student.setReceiptDate("1.07.2021");
        System.out.println("Студент: " + student.getFullName() + System.lineSeparator()
                + "Группа: " + student.getGroup() + System.lineSeparator()
                + "Дата поступления: " + student.getReceiptDate());
    }
}
