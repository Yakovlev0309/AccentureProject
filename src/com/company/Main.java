package com.company;

public class Main {
    public static void main(String[] args) {
        //Работа с консолью для проверки
        Factory factory = new Factory();
        Store store1 = new Store();
        factory.AddProducts(10);
        factory.SendToStore(store1, 5);
        store1.TakeFromStorage(3);

        System.out.println("Товары склада:");
        for (byte i = 0; i < factory.Storage().CountOfProducts(); i++) {
            System.out.println(factory.Storage().Products().get(i).GetId());
        }
        System.out.println("Товары магазина на складе:");
        for (byte i = 0; i < store1.Storage().CountOfProducts(); i++) {
            System.out.println(store1.Storage().Products().get(i).GetId());
        }
        System.out.println("Товары магазина на витрине:");
        for (byte i = 0; i < store1.CountOfProductsForSale(); i++) {
            System.out.println(store1.ForSaleProducts().get(i).GetId());
        }
    }
}
