package com.hust.kstn.models;
import java.util.ArrayList;


public class Book  extends Media {
    public static class BookAuthor {
        private String fullName;
        private int yearOfBirth;
        private String shortBiography;
        public BookAuthor(String name, int yearOfBirth, String shortBiography) {
            this.fullName = name;
            this.yearOfBirth = yearOfBirth;
            this.shortBiography = shortBiography;
        }
        @Override
        public String toString() {
            return this.fullName + " (" + this.yearOfBirth + ", " + this.shortBiography + ")\n";
        }
    }

    private ArrayList<BookAuthor> authors;
    private int length;

    public Book(int id, String title, String category, double cost, int length, ArrayList<BookAuthor> authors) {
        super(title, category, cost);
        this.length = length;
        this.authors = authors;
    }

    public ArrayList<BookAuthor> getAuthors() {
        return this.authors;
    }
    public int getLength() {
        return this.length;
    }
    @Override
    public String toString() {
        return "Book [" + this.id + "] - [" + this.title + "] - " +" - [" + this.category + "] - [" + this.cost + "] - [" + this.length + "]" + "\nAuthors: " + this.authors.toString();
    }
}