package com.team.ten.controller;

import com.team.ten.dao.UserDao;
import com.team.ten.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //依赖注入
    @Autowired
    UserDao userMapper;

    @RequestMapping(value = "find")
    public User findUserByName() {
        //调用dao层
        User user = userMapper.selectUserByName("jay");
        return user;//返回的是Json数据，因为RestController注解中有@ResponseBody的作用
    }
}
