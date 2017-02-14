package com.example.ttm.moviebooking;

/**
 * Created by timothy on 14.2.2017.
 */

public class Show {
    private int startTime;
    private Hall hall;
    private Film film;
    private boolean[] freeSeats;

    public Show(int startTime, Hall hall, Film film) {
        this.startTime = startTime;
        this.hall = hall;
        this.film = film;
        freeSeats = new boolean[hall.getSeats()];
    }
}
