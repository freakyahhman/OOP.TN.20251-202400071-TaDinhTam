package com.hust.kstn.models;

public class Media {
    private int id;
    private String title;
    private String category;
    private double cost;
    private static int nbMedia = 0;

    public Media (String title, String category, double cost) {
        this.id = nbMedia++;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    protected int getID() {
        return this.id;
    }
    protected String getTitle() {
        return this.title;
    }
    protected String getCategory() {
        return this.category;
    }
    protected double getCost() {
        return this.cost;
    }
    @Override
    public String toString() {
        return "Media [" + this.id + "] - [" + this.title + "] - [" + this.category + "] - [" + this.cost + "]";
    }
}