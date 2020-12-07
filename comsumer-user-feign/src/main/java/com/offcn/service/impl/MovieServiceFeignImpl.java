package com.offcn.service.impl;

import com.offcn.pojo.Movie;
import com.offcn.service.MovieServiceFeign;
import org.springframework.stereotype.Component;

@Component
public class MovieServiceFeignImpl implements MovieServiceFeign {
    @Override
    public Movie getNewMovie() {
        Movie movie=new Movie();
        movie.setId(0);
        movie.setMovieName("该电影尚未上映");
        return movie;
    }
}
