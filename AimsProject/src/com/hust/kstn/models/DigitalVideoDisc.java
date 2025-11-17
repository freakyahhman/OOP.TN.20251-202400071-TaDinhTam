package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {

    private String director;
    private int length;
    private String date;

    public DigitalVideoDisc(String title, String category, double cost, String director, int length, String date) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
        this.date = date;
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

    public int getLength() {
        return this.length;
    }


    public void play() {
        if(this.length <= 0) {
            System.out.println("ERROR: DVD length is non-positive!");
            return;
        }
        System.out.println("Playing DVD: " + this.title + " - Length: " + this.length);
    }

    @Override
    public String toString() {
        return "DVD [" + getID() + "] - [" + getTitle() + "] - [" + getCategory() + "] - [" + getCost() + "] - [" + this.director + "] - [" + this.length + "] - [" + this.date + "]";
    }
}
