package com.hust.kstn.models;
import java.util.ArrayList;
import java.utils.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    public Store() {
    }
    public void addDVD(DigitalVideoDisc disc) {
        this.itemsInStore.add(disc);
    }
    public void removeDVD(DigitalVideoDisc disc) {
        if(this.itemsInStore.contains(disc))
            this.itemsInStore.remove(disc);
        else {
            System.out.println("Disc not found in store");
        }
    }
}
