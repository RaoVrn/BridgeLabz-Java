/*
Problem Statement:
Create a Person class with a copy constructor that clones another person's attributes.
*/

class PersonDetails {
    private String name;
    private int age;

    public PersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public PersonDetails(PersonDetails p) {
        this.name = p.name;
        this.age = p.age;
    }

    public void display() {
        System.out.println(name + " - " + age);
    }
}

public class Person {
    public static void main(String[] args) {
        PersonDetails p1 = new PersonDetails("Varun", 21);
        PersonDetails p2 = new PersonDetails(p1);

        p2.display();
    }
}
