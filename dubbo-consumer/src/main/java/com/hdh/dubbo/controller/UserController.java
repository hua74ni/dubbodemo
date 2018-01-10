package com.hdh.dubbo.controller;

import com.alibaba.fastjson.JSONObject;
import com.hdh.dubbo.logic.UserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by huangdonghua on 2018/1/7.
 */
@Controller
public class UserController {

    @Autowired
    private UserLogic userLogic;

    @RequestMapping("getUserInfo.do")
    public String getUserInfo(String id){
        String jsonStr = JSONObject.toJSONString(userLogic.getUser(id));
        return jsonStr;
    }

}
