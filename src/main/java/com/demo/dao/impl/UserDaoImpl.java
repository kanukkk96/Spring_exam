package com.demo.dao.impl;

import com.demo.bean.User;
import com.demo.dao.UserDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao{

    @Override
    public List<User> getUserById(Integer id) {
        List<User> userList = new ArrayList<User>();
        userList.add(new User("c",14));
        userList.add(new User("kanu",26));
        return userList;
    }

}