package com.wuyiping.service;

import com.wuyiping.domain.User;

import java.util.List;

public interface UserService {

    List<User> selectUser(User user);
}
