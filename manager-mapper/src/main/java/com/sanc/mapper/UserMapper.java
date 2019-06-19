package com.sanc.mapper;

import com.sanc.pojo.User;

import java.util.List;

/**
 * @Desc:
 * @Author: JerryLi
 * @Date: 2019/6/11 6:44
 * @Version: 1.0
 */
public interface UserMapper {

    void insertUser(User user);
    List<User> selectAll();
}
