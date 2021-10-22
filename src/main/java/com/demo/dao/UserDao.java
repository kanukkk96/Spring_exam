package com.demo.dao;

import com.demo.bean.User;

import java.util.List;

public interface UserDao {
    List<User> getUserById(Integer id);
}