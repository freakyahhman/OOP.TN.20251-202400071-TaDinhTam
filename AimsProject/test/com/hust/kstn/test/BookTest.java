package com.hust.kstn.test;
import com.hust.kstn.models.Book;

public class BookTest {
    public static void main(String[] args) {
        Book.BookAuthor author1 = new Book.BookAuthor("F. Scott Fitzgerald", 1880, "American novelist");
        Book.BookAuthor author2 = new Book.BookAuthor("George Orwell",1936, "English novelist");
        Book book1 = new Book(0, "The Great Gatsby", author1, "Fiction", 10.99, 180);
        Book book2 = new Book(1, "1984", author2, "Romance", 8.99, 328);

        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}