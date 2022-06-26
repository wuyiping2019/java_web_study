package com.wuyiping.service;

import com.github.pagehelper.Page;
import com.wuyiping.domain.User;

public interface UserService {

    Page<User> selectUser(User user);
}
