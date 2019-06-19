package com.sanc.web.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.sanc.pojo.User;
import com.sanc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

import java.util.Date;
import java.util.List;

/**
 * @Desc:
 * @Author: JerryLi
 * @Date: 2019/6/15 18:44
 * @Version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    @ResponseBody
    public String addUser(User user) {
        if (StringUtils.isEmpty(user.getUsername())) {
            return "failure";
        }
        user.setUpdatedDate(new Date());
        userService.addUser(user);
        System.out.println("Add user success");
        return "success";
    }

    @RequestMapping("/listUser")
    @ResponseBody
    public String listUser() {
        List<User> data = userService.listUser();

        System.out.println("List user success");

        String result = JSONArray.toJSONString(data);

        return result;
    }
}
