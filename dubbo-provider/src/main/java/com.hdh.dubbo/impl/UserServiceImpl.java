package com.hdh.dubbo.impl;

import com.hdh.api.UserService;
import com.hdh.api.pojo.User;

/**
 * Created by huangdonghua on 2018/1/7.
 */
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String id) {
        User user = new User();
        user.setUserId(id);
        user.setUsername("账号");
        user.setPassword("密码");
        return user;
    }

}
