/*
Sample Program 4: Shopping Cart System

Static:
- discount
- updateDiscount()

This:
- Initialize productName, price, quantity

Final:
- productID must be final

Instanceof:
- Validate before processing details
*/

class ProductDetails {
    static double discount = 10.0;

    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    public ProductDetails(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public void display(Object obj) {
        if (obj instanceof ProductDetails) {
            double finalPrice = price * quantity * (1 - discount / 100);
            System.out.println(productName + " | Final Price: ₹" + finalPrice);
        }
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
}

public class Product {
    public static void main(String[] args) {
        ProductDetails p = new ProductDetails("Laptop", 50000, 1, 1001);
        ProductDetails.updateDiscount(15);
        p.display(p);
    }
}
