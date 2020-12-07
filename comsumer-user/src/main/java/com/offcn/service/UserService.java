package com.offcn.service;

import com.offcn.pojo.User;

import java.util.Map;

public interface UserService {
    public User getUser(Integer id);
    public Map<String,Object> buyMovie(Integer id);
}
