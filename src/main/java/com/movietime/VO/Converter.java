package com.movietime.vo;

import com.movietime.entity.Movie;

import java.util.LinkedList;
import java.util.List;

public class Converter {
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
    }

    public static List<MovieVO> convert(List<Movie> movie) {
        List<MovieVO> mfd = new LinkedList<MovieVO>();
        for (Movie aMovie : movie) mfd.add(Converter.convert(aMovie));
        return mfd;
    }
}
