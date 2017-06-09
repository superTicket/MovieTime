package com.movietime.vo;

import com.movietime.entity.Movie;
import com.movietime.entity.Show;

import java.util.LinkedList;
import java.util.List;

public class Converter {
    public static MovieVO convert(Movie movie) {
        MovieVO movieVO = new MovieVO();
        movieVO.bannerPath = movie.getBannerPath();
        movieVO.castAndCrew = movie.getCastAndCrew();
        movieVO.director = movie.getDirector();
        movieVO.duration = movie.getDuration();
        movieVO.genre = movie.getGenre();
        movieVO.id = (int) movie.getId();
        movieVO.language = movie.getLanguage();
        movieVO.name = movie.getName();
        movieVO.posterPath = movie.getPosterPath();
        movieVO.releaseDate = movie.getReleaseDate();
        return movieVO;
    }

    public static List<MovieVO> convert(List<Movie> movie) {
        List<MovieVO> mfd = new LinkedList<MovieVO>();
        for (Movie aMovie : movie) mfd.add(Converter.convert(aMovie));
        return mfd;
    }

    public static ShowVO convert(Show show) {
        ShowVO showVO = new ShowVO();
        showVO.setId(show.getId());
        showVO.setMovieId(show.getMovieId());
        showVO.setPrice(show.getPrice());
        showVO.setSeatMap(show.getSeatMap().split("\\|"));
        showVO.setTheaterName(show.getTheaterName());
        showVO.setTime(show.getTime());
        return showVO;
    }
}
