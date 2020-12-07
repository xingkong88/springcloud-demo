package com.offcn.controller;

import com.offcn.pojo.Movie;
import com.offcn.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movie")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping("getNewMovie")
    public Movie getNewMovie(){
        return movieService.getNewMovie();
    }
}
