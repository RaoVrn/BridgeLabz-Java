/*
Problem Statement:
Write a Circle class with a radius attribute.
Use constructor chaining to initialize radius with default and user-provided values.
*/

class CircleDetails {
    private double radius;

    // Default constructor
    public CircleDetails() {
        this(1.0); // Constructor chaining
    }

    // Parameterized constructor
    public CircleDetails(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Circle {
    public static void main(String[] args) {
        CircleDetails c1 = new CircleDetails();
        CircleDetails c2 = new CircleDetails(5);

        System.out.println(c1.area());
        System.out.println(c2.area());
    }
}
