package com.movietime.vo;

import com.movietime.entity.Movie;

import java.util.LinkedList;
import java.util.List;

public class Converter {
<<<<<<< HEAD
    public static MovieVO convert(Movie movie) {
        MovieVO movieVO = new MovieVO();
        movieVO.bannerPath = movie.bannerPath;
        movieVO.castAndCrew = movie.castAndCrew;
        movieVO.director = movie.director;
        movieVO.duration = movie.duration;
        movieVO.genre = movie.genre;
        movieVO.id = (int) movie.id;
        movieVO.language = movie.language;
        movieVO.name = movie.name;
        movieVO.posterPath = movie.posterPath;
        movieVO.releaseDate = movie.releaseDate;
        return movieVO;
=======
    public static MovieforDisplay convert(Movie movie) {
        MovieforDisplay movieforDisplay = new MovieforDisplay();
        movieforDisplay.banner_path = movie.banner_path;
        movieforDisplay.cast_and_crew = movie.cast_and_crew;
        movieforDisplay.director = movie.director;
        movieforDisplay.duration = movie.duration;
        movieforDisplay.genre = movie.genre;
        movieforDisplay.id = (int) movie.id;
        movieforDisplay.language = movie.language;
        movieforDisplay.name = movie.name;
        movieforDisplay.poster_path = movie.poster_path;
        movieforDisplay.release_date = movie.release_date;
        return movieforDisplay;
>>>>>>> origin/master
    }

    public static List<MovieVO> convert(List<Movie> movie) {
        List<MovieVO> mfd = new LinkedList<MovieVO>();
        for (Movie aMovie : movie) mfd.add(Converter.convert(aMovie));
        return mfd;
    }
}
