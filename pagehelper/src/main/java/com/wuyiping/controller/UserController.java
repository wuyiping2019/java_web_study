package com.wuyiping.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.wuyiping.domain.ResponseMsg;
import com.wuyiping.domain.User;
import com.wuyiping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * springboot默认扫描 启动类所在包及其子包下的Bean
 * 因此如果想要这个Controller及其依赖的对象在其它模块中能识别 则需要与entry中启动类所在包名一致
 * */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping(path = "/study/pageHelper")
    public String selectUser(@RequestBody User user) {
        Page<User> users = userService.selectUser(user);
        ResponseMsg<User> responseMsg = new ResponseMsg<>("succeed",
                "1",
                "request succeed",
                users.getPages(),
                users.getTotal(),
                users.getResult());
//        String usersStr = JSONObject.toJSONString(responseMsg, SerializerFeature.WriteMapNullValue);
        return JSONObject.toJSONString(responseMsg); //默认空属性不输出
    }
}
