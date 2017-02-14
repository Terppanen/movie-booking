package com.example.ttm.moviebooking;

import java.util.ArrayList;

/**
 * Created by timothy on 14.2.2017.
 */

public class Hall {
    private MovieTheater theater;
    private final int SEATS;
    private ArrayList<Show> shows;

    public Hall(MovieTheater theater, int seats) {
        this.theater = theater;
        this.SEATS = seats;
        shows = new ArrayList<>();
    }

    void addShow(Show show) {
        shows.add(show);
    }

    int getSeats() {
        return SEATS;
    }
}
