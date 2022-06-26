package com.wuyiping.service.impl;


import com.github.pagehelper.Page;
import com.wuyiping.domain.User;
import com.wuyiping.mapper.UserMapper;
import com.wuyiping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Page<User> selectUser(User user) {
        return userMapper.selectUser(user);
    }
}
