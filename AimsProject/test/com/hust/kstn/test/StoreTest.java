package com.hust.kstn.test;
import com.hust.kstn.models.Store;
import com.hust.kstn.models.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Movie 1", "Action", "Director 1", "01/01/2020", 120, 20.0);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Movie 2", "Comedy", "Director 2", "02/02/2021", 90, 15.0);
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.removeDVD(dvd1);
        store.removeDVD(dvd1); // Attempt to remove a disc that is not in the store
    }
}
