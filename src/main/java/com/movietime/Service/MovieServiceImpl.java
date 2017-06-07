package com.movietime.Service;

import com.movietime.DAO.MovieDAO;
import com.movietime.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yangzy on 2017/6/6.
 */
@Component
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieDAO movieDAO;

    public List<Movie> findAll() {
        return movieDAO.findAll();
    }

    public Movie findOne(long id) {
        return movieDAO.findOne(id);
    }
}
