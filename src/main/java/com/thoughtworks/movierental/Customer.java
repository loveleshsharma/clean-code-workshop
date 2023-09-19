package com.thoughtworks.movierental;

public class Customer {
    private final String name;
    private final Rentals rentals;

    public Customer(String name) {
        this.name = name;
        this.rentals = new Rentals();
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String textStatement() {
        return new TextStatement(rentals, name).generate();
    }

    public String htmlStatement() {
        return new HTMLStatement(rentals, name).generate();
    }
}
