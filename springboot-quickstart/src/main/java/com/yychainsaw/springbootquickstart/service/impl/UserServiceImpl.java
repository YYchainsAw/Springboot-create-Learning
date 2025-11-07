package com.yychainsaw.springbootquickstart.service.impl;

import com.yychainsaw.springbootquickstart.mapper.UserMapper;
import com.yychainsaw.springbootquickstart.pojo.User;
import com.yychainsaw.springbootquickstart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
}
