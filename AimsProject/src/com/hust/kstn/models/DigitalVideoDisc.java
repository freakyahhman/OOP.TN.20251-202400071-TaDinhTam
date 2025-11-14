package com.hust.kstn.models;

public class DigitalVideoDisc {

    private static int nbDigitalVideoDiscs = 0;

    private String title;
    private String category;
    private String director;
    private int id;
    private int length;
    private double cost;
    private String date;

    public DigitalVideoDisc(String title, String category, String director, String date, int length, double cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.date = date;
        this.id = nbDigitalVideoDiscs++;
        this.length = length;
        this.cost = cost;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCategory() {
        return this.category;
    }

    public String getDirector() {
        return this.director;
    }

    public Integer[] getDate() {
        String[] parts = this.date.split("/");
        Integer[] datee = {
            Integer.parseInt(parts[0]),
            Integer.parseInt(parts[1]),
            Integer.parseInt(parts[2])
        };
        return datee;
    }

    public int getID() {
        return this.id;
    }

    public int getLength() {
        return this.length;
    }

    public double getCost() {
        return this.cost;
    }

    @Override
    public String toString() {
        return "- DVD [" + this.id + "] - [" + this.title + "] - [" + this.cost + "] - [" + this.length + "] - [" + this.category + "] - [" + this.director + "]";
    }
}
