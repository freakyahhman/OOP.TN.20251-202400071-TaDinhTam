package com.hust.kstn.models;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Cart {

    private ArrayList<DigitalVideoDisc> itemsInCart = new ArrayList<>();
    private final int MAX_NUMBERS_ORDERED = 20;
    private double totalCost = 0d;
    private int numberOrdered = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (this.numberOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("Reached max number of disc in cart.");
            return;
        }
        this.itemsInCart.add(disc);
        this.totalCost += disc.getCost();
        this.numberOrdered += 1;
    }

    public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        if (this.numberOrdered + 2 > MAX_NUMBERS_ORDERED) {
            System.out.println("Reached max number of disc in cart.");
            return;
        }
        this.itemsInCart.add(disc1);
        this.itemsInCart.add(disc2);
        this.totalCost += disc1.getCost() + disc2.getCost();
        this.numberOrdered += 2;
    }
    
    public void addDVD(DigitalVideoDisc[] discList) {
        if (this.numberOrdered + discList.length > MAX_NUMBERS_ORDERED) {
            System.out.println("Reached max number of disc in cart.");
            return;
        }
        for (DigitalVideoDisc disc : discList) {
            this.itemsInCart.add(disc);
            this.totalCost += disc.getCost();
            this.numberOrdered += 1;
        }
    }

    public void print() {
        System.out.println("=================== THE CURRENT CART ===================");
        System.out.println("Total items: " + this.numberOrdered);
        for (DigitalVideoDisc disc : this.itemsInCart) {
            System.out.println(disc.toString());
        }
        System.out.println("Subtotal: " + this.totalCost);
        System.out.println("========================================================");
    }

    public static void sortByTitleThenCost(List<DigitalVideoDisc> items) {
        Collections.sort(items, (a, b) -> {
            int cmp = a.getTitle().compareToIgnoreCase(b.getTitle());
            if (cmp == 0) {
                return Double.compare(a.getCost(), b.getCost());
            }
            return cmp;
        });
    }

    public static void sortByCostThenTitle(List<DigitalVideoDisc> items) {
        Collections.sort(items, (a, b) -> {
            int cmp = -Double.compare(a.getCost(), b.getCost());
            if (cmp == 0) {
                return -a.getTitle().compareToIgnoreCase(b.getTitle());
            }
            return cmp;
        });
    }

    public void sortCartByTitle() {
        sortByTitleThenCost(this.itemsInCart);
    }

    public void sortCartByCost() {
        sortByCostThenTitle(this.itemsInCart);
    }

    public void updateNumberDVD(DigitalVideoDisc disc, int num) {
        if (num + this.numberOrdered > this.MAX_NUMBERS_ORDERED) {
            System.out.println("Cannot order more than max number");
            return;
        }
        if(num + this.numberOrdered < 0) {
            System.out.println("Cannot reduce more than current number");
            return;
        }
        if (num > 0) {
            for (int i = 0; i < num; i++) {
                this.itemsInCart.add(disc);
                this.numberOrdered += 1;
            }
        }
        for (int i = 0; i > num; i--) {
            if (this.itemsInCart.contains(disc)) {
                this.itemsInCart.remove(disc); 
                this.numberOrdered -= 1;
            }else {
                System.out.println("No more disc to remove");
                return;
            }
        }
    }

    public void findByID(int id) {
        for (DigitalVideoDisc disc : this.itemsInCart) {
            if (disc.getID() == id) {
                System.out.println("Title: " + disc.getTitle());
                System.out.println("Director: " + disc.getDirector());
                System.out.println("Length: " + disc.getLength());
                System.out.println("ID: " + disc.getID());
                System.out.println(String.format("Date added: %s/%s/%s", disc.getDate()[0], disc.getDate()[1], disc.getDate()[2]));
                System.out.println("Cost: " + disc.getCost());
                return;
            }
        }
        System.out.println("Not found");
    }

    public void findByTitle(String title) {
        for (DigitalVideoDisc disc : this.itemsInCart) {
            if (disc.getTitle().compareTo(title) == 0) {
                System.out.println("Title: " + disc.getTitle());
                System.out.println("Director: " + disc.getDirector());
                System.out.println("Length: " + disc.getLength());
                System.out.println("ID: " + disc.getID());
                System.out.println(String.format("Date added: %s/%s/%s", disc.getDate()[0], disc.getDate()[1], disc.getDate()[2]));
                System.out.println("Cost: " + disc.getCost());
                return;
            }
        }
        System.out.println("Not found");
    }

    public void placeOrder() {
        System.out.println("Order placed Successfully!");
    }

}
