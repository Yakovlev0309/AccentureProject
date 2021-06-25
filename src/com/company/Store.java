package com.company;

import java.util.ArrayList;

public class Store extends Building{
    private ArrayList<Product> forSaleProducts;
    public Store() {
        forSaleProducts = new ArrayList<Product>();
    }
    public ArrayList<Product> ForSaleProducts() {
        return forSaleProducts;
    }
    public int CountOfProductsForSale() {
        return forSaleProducts.size();
    }
    public void TakeFromStorage(int count) {
        //1. Реализовать выкладывание товаров со склада на витрины
        //2. Поменять списки (ArrayList) на очереди (queue)
        //3. Релизовать отправку товаров со склада фабрики на склад магазина

        for (byte i = 0; i < count; i++) {
            forSaleProducts.add(Storage().Products().get(i));
        }
        for (byte i = 0; i < count; i++) {
            Storage().Products().remove(0);
        }
    }
}
