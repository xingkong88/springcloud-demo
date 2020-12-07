package com.offcn.service.impl;

import com.offcn.dao.MovieDao;
import com.offcn.pojo.Movie;
import com.offcn.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    @Value("${server.port}")
    private String port;
    @Autowired
    private MovieDao movieDao;
    @Override
    public Movie getNewMovie() {
        System.out.println("当前电影服务的端口"+port);
        return movieDao.getNewMovie();
    }
}
