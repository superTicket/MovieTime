package com.movietime.Service;

import com.movietime.DAO.TagDAO;
import com.movietime.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by yangzy on 2017/6/7.
 */
@Component
public class TagServiceImpl implements TagService {
    @Autowired
    TagDAO tagDAO;
    @Autowired
    MovieService ms;

    public List<String> getAllMovieTags() {
        return tagDAO.getAllMovieTags();
    }

    public List<Movie> getMovieByTag(String tag) {
        List<Integer> movie_idList = tagDAO.findMovieIdByTagName(tag);
        if (movie_idList == null) return null;
        List<Movie> movieList = new LinkedList<Movie>();
        for (int i = 0; i < movie_idList.size(); i++) {
            Movie movie = ms.findOne(movie_idList.get(i));
            movieList.add(movie);
        }
        return movieList;
    }
}
