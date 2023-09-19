package com.thoughtworks.movierental;

import java.util.ArrayList;
import java.util.List;

public class Rentals extends ArrayList<Rental> {
    public double getTotalAmount() {
        double totalAmount = 0;
        for (Rental rental : this) {
            totalAmount += rental.amount();
        }
        return totalAmount;
    }

    public int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : this) {
            frequentRenterPoints += rental.frequentRenterPoints();
        }
        return frequentRenterPoints;
    }
}
