package com.example.ttm.moviebooking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
	private ArrayList<Film> films;
    private ArrayList<MovieTheater> theaters;
	/*
	* hehe xD
	*
	*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
