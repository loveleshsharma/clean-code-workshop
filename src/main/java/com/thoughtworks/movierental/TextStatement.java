package com.thoughtworks.movierental;

import java.util.List;

public class TextStatement {
    private Rentals rentals;
    private String customerName;

    public TextStatement(Rentals rentals, String customerName) {
        this.rentals = rentals;
        this.customerName = customerName;
    }

    public String generate() {
        return header() + body() + footer();
    }

    private String footer() {
        String result = "";
        result += "Amount owed is " + rentals.getTotalAmount() + "\n";
        result += "You earned " + rentals.getFrequentRenterPoints()
                + " frequent renter points";
        return result;
    }

    private String body() {
        String result = "";
        for (Rental rental : rentals) {
            double thisAmount = rental.amount();
            result += "\t" + rental.getMovie().getTitle() + "\t" +
                    thisAmount + "\n";
        }
        return result;
    }

    private String header() {
        return "Rental Record for " + customerName + "\n";
    }
}
