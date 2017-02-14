package com.example.ttm.moviebooking;

/**
 * Created by timothy on 14.2.2017.
 */

public class Reservation {
    private int seatNumber;
    private Show show;

    String toString() {
        return "Reservation info:\nSeat number: " + seatNumber
                + "\nHall: " + show.getHall()
                + "\nFilm: " + show.getFilm();
    }
}
