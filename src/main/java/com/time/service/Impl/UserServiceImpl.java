package com.time.service.Impl;

import com.time.dao.UserDao;
import com.time.entity.User;
import com.time.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void add(User user){
        userDao.add(user);
    }
}
