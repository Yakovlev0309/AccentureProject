package com.company;

public class Building {
    private Storage storage;
    public Building() {
        storage = new Storage();
    }
    //Склад здания (магазина или завода)
    public Storage Storage() {
        return storage;
    }
    //Добавление товаров на склад
    public void AddProducts(int count) {
        storage.AddProducts(count);
    }
}
