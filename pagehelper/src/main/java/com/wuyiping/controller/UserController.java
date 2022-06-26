package com.wuyiping.controller;

import com.alibaba.fastjson.JSONObject;
import com.wuyiping.domain.User;
import com.wuyiping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping(path = "/study/pageHelper")
    public String selectUser(@RequestBody User user) {
        System.out.println(user);
        List<User> users = userService.selectUser(user);
        String[] excludeProps = {"pageSize","pageNum"};
        String usersStr = JSONObject.toJSONString(users, User.includefilter);
        return usersStr;
    }
}
