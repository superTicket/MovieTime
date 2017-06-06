package com.movietime.Service;

import com.movietime.entity.Movie;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by yangzy on 2017/6/6.
 */
@Component
public class MovieServiceImp implements MovieService {
    public List<Movie> findAll() {
        List<Movie> movieList = new LinkedList<Movie>();
        movieList.add(new Movie("Guardians of the Galaxy", null, "/images/homepage/banner.jpg"));
        movieList.add(new Movie("Transformers 4", null, "/images/homepage/banner1.jpg"));
        movieList.add(new Movie("Game of Thrones", null, "/images/homepage/banner2.jpg"));
        return movieList;
    }

    public Movie findOne(int id) {
        return null;
    }

    public List<String> getAllMovieTags() {
        List<String> tagList = new LinkedList<String>();
        tagList.add("Featured");
        tagList.add("Top viewed");
        tagList.add("Top Rating");
        tagList.add("Recently Added");
        return tagList;
    }

    public List<Movie> getMovieByTag(String tag) {
        List<Movie> movieList = new LinkedList<Movie>();
        if (tag.equals("Featured")) {
            movieList.add(new Movie("God’s Compass", "/images/homepage/featureMoviesImages/m15.jpg"));
            movieList.add(new Movie("Bad Moms", "/images/homepage/featureMoviesImages/m2.jpg"));
            movieList.add(new Movie("Jason Bourne", "/images/homepage/featureMoviesImages/m5.jpg"));
            movieList.add(new Movie("Rezort", "/images/homepage/featureMoviesImages/m16.jpg"));
            movieList.add(new Movie("Peter", "/images/homepage/featureMoviesImages/m17.jpg"));
            movieList.add(new Movie("ISRA 88", "/images/homepage/featureMoviesImages/m18.jpg"));
            movieList.add(new Movie("WAR DOGS", "/images/homepage/featureMoviesImages/m1.jpg"));
            movieList.add(new Movie("The Other Side", "/images/homepage/featureMoviesImages/m14.jpg"));
            movieList.add(new Movie("Civil War", "/images/homepage/featureMoviesImages/m19.jpg"));
            movieList.add(new Movie("The Secret Life of Pets", "/images/homepage/featureMoviesImages/m20.jpg"));
            movieList.add(new Movie("The Jungle Book", "/images/homepage/featureMoviesImages/m21.jpg"));
            movieList.add(new Movie("Assassin's Creed 3", "/images/homepage/featureMoviesImages/m22.jpg"));
        } else if (tag.equals("Top viewed")) {
            movieList.add(new Movie("MovieforDisplay 3", "/images/homepage/featureMoviesImages/m3.jpg"));
            movieList.add(new Movie("MovieforDisplay 4", "/images/homepage/featureMoviesImages/m4.jpg"));

        } else if (tag.equals("Top Rating")) {
            movieList.add(new Movie("MovieforDisplay 5", "/images/homepage/featureMoviesImages/m5.jpg"));
            movieList.add(new Movie("MovieforDisplay 6", "/images/homepage/featureMoviesImages/m6.jpg"));

        } else if (tag.equals("Recently Added")) {
            movieList.add(new Movie("MovieforDisplay 7", "/images/homepage/featureMoviesImages/m7.jpg"));
            movieList.add(new Movie("MovieforDisplay 8", "/images/homepage/featureMoviesImages/m8.jpg"));
        } else {
            movieList = null;
        }
        return movieList;
    }
}
