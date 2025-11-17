import java.util.ArrayList;


public class Book {
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

    private int id;
    private String title;
    private ArrayList<BookAuthor> authors;
    private String category;
    private double cost;
    private int length;
    public Book(int id, String title, ArrayList<BookAuthor> authors, String category, double cost, int length) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.category = category;
        this.cost = cost;
        this.length = length;
    }

    public int getID() {
        return this.id;
    }
    public String getTitle() {
        return this.title;
    }
    public ArrayList<BookAuthor> getAuthors() {
        return this.authors;
    }
    public String getCategory() {
        return this.category;
    }
    public double getCost() {
        return this.cost;
    }
    public int getLength() {
        return this.length;
    }
    @Override
    public String toString() {
        return "Book [" + this.id + "] - [" + this.title + "] - " +" - [" + this.category + "] - [" + this.cost + "] - [" + this.length + "]" + "\nAuthors: " + this.authors.toString();
    }
}