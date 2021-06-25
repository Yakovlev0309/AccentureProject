package com.company;

import java.util.ArrayList;

public class Factory extends Building{
//    private ArrayList<Store> stores;
//    public Factory() {
//        stores = new ArrayList<Store>();
//    }
    public void SendToStore(Store store, int count) {
        for (byte i = 0; i < count; i++) {
            store.Storage().Products().add(Storage().Products().get(i));
        }
        for (byte i = 0; i < count; i++) {
            Storage().Products().remove(0);
        }
    }
}
