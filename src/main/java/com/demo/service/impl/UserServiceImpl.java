package com.demo.service.impl;

import com.demo.bean.User;
import com.demo.dao.UserDao;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    private Integer id;

    @Override
    public User getUserList() {
        List<User> userList =userDao.getUserById(id);

        for(int i=0;i<userList.size();i++){
            System.out.println(userList.get(i).getName());
            if(userList.get(i).getAge() == 14){
                return userList.get(i);
            }
        }

        return null;
    }

}