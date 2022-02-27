package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Clean code", 500);
        Book second = new Book("Master and Margarita", 504);
        Book third = new Book("Crime and Punishment", 672);
        Book fourth = new Book("Hero of our time", 176);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " : " + book.getNumberOfPages());
        }
        System.out.println("___________________________");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " : " + book.getNumberOfPages());
        }
        System.out.println("_________________________");
        System.out.println("Shown only \"Clean code\"");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " : " + book.getNumberOfPages());
            }
        }
    }
}
