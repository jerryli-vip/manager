package com.sanc.service;

import com.sanc.pojo.User;

import java.util.List;

/**
 * @Desc:
 * @Author: JerryLi
 * @Date: 2019/6/15 18:46
 * @Version: 1.0
 */
public interface UserService {

    void addUser(User user);

    List<User> listUser();
}
