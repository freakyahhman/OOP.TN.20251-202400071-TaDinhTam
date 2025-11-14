package com.hust.kstn.test;
import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class CartTest {
    Cart cart = new Cart();
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("Movie 1", "Action", "Director 1", "01/01/2020", 120, 20.0);
    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Movie 2", "Comedy", "Director 2", "02/02/2021", 90, 15.0);
    DigitalVideoDisc[] dvdArray = {
        new DigitalVideoDisc("Movie 3", "Drama", "Director 3", "03/03/2022", 110, 18.0),
        new DigitalVideoDisc("Movie 4", "Horror", "Director 4", "04/04/2023", 100, 22.0)
    };

    cart.addDVD(dvd1);
    cart.addDVD(dvd1, dvd2);
    cart.addDVD(dvdArray);
    cart.print();
    cart.updateNumberDVD(dvd1, 2);
    cart.print();
    cart.updateNumberDVD(dvd2, -20);
    cart.print();
}
