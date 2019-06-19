package com.sanc.service.impl;

import com.sanc.mapper.UserMapper;
import com.sanc.pojo.User;
import com.sanc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Desc:
 * @Author: JerryLi
 * @Date: 2019/6/15 18:47
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void addUser(User user) {
        userMapper.insertUser(user);
    }

    public List<User> listUser() {
        return userMapper.selectAll();
    }
}
