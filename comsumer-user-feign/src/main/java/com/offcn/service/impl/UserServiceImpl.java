package com.offcn.service.impl;

import com.offcn.dao.UserDao;
import com.offcn.pojo.Movie;
import com.offcn.pojo.User;
import com.offcn.service.MovieServiceFeign;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private MovieServiceFeign movieServiceFeign;
    //@Autowired
    //private RestTemplate restTemplate;
    @Override
    public User getUser(Integer id) {
        return userDao.getUser(id);
    }
    //购买最新的电影票
    @Override
    public Map<String, Object> buyMovie(Integer id) {
        Map<String ,Object> result=new HashMap<>();
        User user = this.getUser(id);
        result.put("user",user);
      //  Movie movie = restTemplate.getForObject("http://PROVIDEMOVIE/movie/getNewMovie", Movie.class);
        Movie movie = movieServiceFeign.getNewMovie();
        result.put("movie",movie);
        return result;
    }

}
