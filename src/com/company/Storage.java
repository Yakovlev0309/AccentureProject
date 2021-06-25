package com.company;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Product> products;
    private int idCount;
    public Storage() {
        idCount = 0;
        products = new ArrayList<>();
    }
    //Список товаров
    public ArrayList<Product> Products() {
        return products;
    }
    //Количество товаров
    public int CountOfProducts() {
        return products.size();
    }
    //Добавление товаров в список
    public void AddProducts(int count) {
        for (byte i = 0; i < count; i++) {
            idCount++;
            products.add(new Product(idCount + 1000));
        }
    }

}
