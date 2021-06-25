package com.company;

public class Factory {
    private Storage storage;
    public Factory() {
        storage = new Storage();
    }
    //Склад завода
    public Storage Storage() {
        return storage;
    }
    //Добавление товаров на склад
    public void AddProducts(int count) {
        storage.AddProducts(count);
    }
    //Отправка товаров на склад магазина
    public void SendToStoreStorage(Store store, int count) {
        for (byte i = 0; i < count; i++) {
            store.Storage().Products().add(Storage().Products().get(i));
        }
        for (byte i = 0; i < count; i++) {
            storage.Products().remove(0);
        }
    }
}
