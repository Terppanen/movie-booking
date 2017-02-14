package com.example.ttm.moviebooking;

/**
 * Created by timothy on 14.2.2017.
 */

public class Film {
    private final String NAME;
    private final int DURATION;

    public Film() {
        this.NAME = "";
        this.DURATION = 0;
    }
    public Film(String name, int duration) {
        this.NAME = name;
        this.DURATION = duration;
    }
}
