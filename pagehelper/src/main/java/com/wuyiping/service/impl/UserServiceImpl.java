package com.wuyiping.service.impl;


import com.wuyiping.domain.User;
import com.wuyiping.mapper.UserMapper;
import com.wuyiping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUser(User user) {
        List<User> users = userMapper.selectUser(user);
        return users;
    }
}
