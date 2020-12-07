package com.offcn.service;

import com.offcn.pojo.Movie;
import com.offcn.service.impl.MovieServiceFeignImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "PROVIDEMOVIE",fallback = MovieServiceFeignImpl.class)
public interface MovieServiceFeign {
    @GetMapping("/movie/getNewMovie")
    public Movie getNewMovie();
}
