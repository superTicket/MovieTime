package com.movietime.Service;

import com.movietime.VO.MovieforDisplay;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by yangzy on 2017/6/6.
 */
@Component
public class MovieServiceImp implements MovieService {
    public List<MovieforDisplay> findAll() {
        List<MovieforDisplay> movieList = new LinkedList<MovieforDisplay>();
        movieList.add(new MovieforDisplay("Guardians of the Galaxy", null, "/images/homepage/banner.jpg"));
        movieList.add(new MovieforDisplay("Transformers 4", null, "/images/homepage/banner1.jpg"));
        movieList.add(new MovieforDisplay("Game of Thrones", null, "/images/homepage/banner2.jpg"));
        return movieList;
    }

    public MovieforDisplay findOne(int id) {
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

    public List<MovieforDisplay> getMovieByTag(String tag) {
        List<MovieforDisplay> movieList = new LinkedList<MovieforDisplay>();
        if (tag.equals("Featured")) {
            movieList.add(new MovieforDisplay("God’s Compass", "/images/homepage/featureMoviesImages/m15.jpg"));
            movieList.add(new MovieforDisplay("Bad Moms", "/images/homepage/featureMoviesImages/m2.jpg"));
            movieList.add(new MovieforDisplay("Jason Bourne", "/images/homepage/featureMoviesImages/m5.jpg"));
            movieList.add(new MovieforDisplay("Rezort", "/images/homepage/featureMoviesImages/m16.jpg"));
            movieList.add(new MovieforDisplay("Peter", "/images/homepage/featureMoviesImages/m17.jpg"));
            movieList.add(new MovieforDisplay("ISRA 88", "/images/homepage/featureMoviesImages/m18.jpg"));
            movieList.add(new MovieforDisplay("WAR DOGS", "/images/homepage/featureMoviesImages/m1.jpg"));
            movieList.add(new MovieforDisplay("The Other Side", "/images/homepage/featureMoviesImages/m14.jpg"));
            movieList.add(new MovieforDisplay("Civil War", "/images/homepage/featureMoviesImages/m19.jpg"));
            movieList.add(new MovieforDisplay("The Secret Life of Pets", "/images/homepage/featureMoviesImages/m20.jpg"));
            movieList.add(new MovieforDisplay("The Jungle Book", "/images/homepage/featureMoviesImages/m21.jpg"));
            movieList.add(new MovieforDisplay("Assassin's Creed 3", "/images/homepage/featureMoviesImages/m22.jpg"));
        } else if (tag.equals("Top viewed")) {
            movieList.add(new MovieforDisplay("MovieforDisplay 3", "/images/homepage/featureMoviesImages/m3.jpg"));
            movieList.add(new MovieforDisplay("MovieforDisplay 4", "/images/homepage/featureMoviesImages/m4.jpg"));

        } else if (tag.equals("Top Rating")) {
            movieList.add(new MovieforDisplay("MovieforDisplay 5", "/images/homepage/featureMoviesImages/m5.jpg"));
            movieList.add(new MovieforDisplay("MovieforDisplay 6", "/images/homepage/featureMoviesImages/m6.jpg"));

        } else if (tag.equals("Recently Added")) {
            movieList.add(new MovieforDisplay("MovieforDisplay 7", "/images/homepage/featureMoviesImages/m7.jpg"));
            movieList.add(new MovieforDisplay("MovieforDisplay 8", "/images/homepage/featureMoviesImages/m8.jpg"));
        } else {
            movieList = null;
        }
        return movieList;
    }
}
