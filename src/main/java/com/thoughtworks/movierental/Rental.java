package com.thoughtworks.movierental;

public class Rental {
    private int daysRented;
    private Movie movie;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double amount() {
        return this.movie.getPrice(this.daysRented);
    }

    public int frequentRenterPoints() {
        if (isBlueRayMovie()) return 3;
        else if (isNewMovie()) return 2;
        return 1;
    }

    private boolean isBlueRayMovie() {
        return movie.getPriceCode() == Movie.BLUERAY;
    }

    private boolean isNewMovie() {
        return (movie.getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1;
    }
}