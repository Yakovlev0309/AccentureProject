package com.company;

import java.util.ArrayList;

public class Store {
    private ArrayList<Product> forSaleProducts;
    private Storage storage;
    public Store() {
        storage = new Storage();
        forSaleProducts = new ArrayList<>();
    }
    //Склад магазина
    public Storage Storage() {
        return storage;
    }
    public ArrayList<Product> ForSaleProducts() {
        return forSaleProducts;
    }
    public int CountOfProductsForSale() {
        return forSaleProducts.size();
    }
    //Взять товары со склада
    public void TakeFromStorage(int count) {
        for (byte i = 0; i < count; i++) {
            forSaleProducts.add(Storage().Products().get(i));
        }
        for (byte i = 0; i < count; i++) {
            Storage().Products().remove(0);
        }
    }
}
