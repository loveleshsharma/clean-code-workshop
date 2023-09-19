package com.thoughtworks.movierental;

public class HTMLStatement {
    private Rentals rentals;
    private String customerName;

    public HTMLStatement(Rentals rentals, String customerName) {
        this.rentals = rentals;
        this.customerName = customerName;
    }

    public String generate() {
        return header() + body() + footer();
    }

    private String footer() {
        String result = "";
        result += "Amount owed is <b>" + rentals.getTotalAmount() + "</b></br>";
        result += "You earned <b>" + rentals.getFrequentRenterPoints()
                + "</b> frequent renter points";
        return result;
    }

    private String body() {
        String result = "";
        for (Rental rental : rentals) {
            double thisAmount = rental.amount();
            result += "&nbsp;" + rental.getMovie().getTitle() + "&nbsp;" +
                    thisAmount + "</br>";
        }
        return result;
    }

    private String header() {
        return "<h1>Rental Record for <b>" + customerName + "</b></h1></br>";
    }
}
