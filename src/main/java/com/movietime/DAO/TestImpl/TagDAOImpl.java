package com.movietime.DAO.TestImpl;

import com.movietime.DAO.TagDAO;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by yangzy on 2017/6/7.
 */
@Component
public class TagDAOImpl implements TagDAO {
    public List<String> getAllMovieTags() {
        List<String> tagList = new LinkedList<String>();
        tagList.add("Featured");
        tagList.add("Top viewed");
        tagList.add("Top Rating");
        tagList.add("Recently Added");
        return tagList;
    }

    public List<Integer> findMovieIdByTagName(String tag_name) {
        List<Integer> id_list = new LinkedList<Integer>();
        for (int i = 0; i < 30; i++)
            id_list.add(new Random().nextInt());
        return id_list;
    }
}
