package com.bjpowernode.service.impl;

import com.bjpowernode.bean.User;
import com.bjpowernode.mapper.UserMapper;
import com.bjpowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    public User userLogin(User user) {
        return userMapper.userLogin(user);
    }
}
