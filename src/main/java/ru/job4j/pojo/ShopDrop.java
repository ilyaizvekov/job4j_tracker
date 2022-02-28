package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int k = index; k < products.length - 1; k++) {
            products[k] = products[k + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}
