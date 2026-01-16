/*
Problem Statement:
Create a Book class with attributes title, author, and price.
Provide both default and parameterized constructors.
*/

class BookDetails {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public BookDetails() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public BookDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println(title + " by " + author + " | Price: ₹" + price);
    }
}

public class Book {
    public static void main(String[] args) {
        BookDetails b1 = new BookDetails();
        BookDetails b2 = new BookDetails("Java", "James Gosling", 499);

        b1.displayDetails();
        b2.displayDetails();
    }
}
