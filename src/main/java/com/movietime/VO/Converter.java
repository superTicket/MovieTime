package com.movietime.VO;

import com.movietime.entity.Movie;
import com.movietime.entity.Theater;

/**
 * Created by yangzy on 2017/6/6.
 */
public class Converter {
    public static TheaterForDisplay convert(Theater theater) {
        TheaterForDisplay theaterForDisplay = new TheaterForDisplay();
        theaterForDisplay.id = theater.id;
        theaterForDisplay.location = theater.location;
        theaterForDisplay.name = theater.name;

        return theaterForDisplay;
    }

    public static MovieforDisplay convert(Movie movie) {
        MovieforDisplay movieforDisplay = new MovieforDisplay();
        // ...
        return movieforDisplay;
    }
}
