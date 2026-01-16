/*
Problem Statement:
Create a Product class with instance variables productName, price
and class variable totalProducts.
*/

class ProductDetails {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    public ProductDetails(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println(productName + " - ₹" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

public class Product {
    public static void main(String[] args) {
        new ProductDetails("Pen", 10);
        new ProductDetails("Book", 50);

        ProductDetails.displayTotalProducts();
    }
}
