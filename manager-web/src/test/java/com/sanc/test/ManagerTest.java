package com.sanc.test;

import com.sanc.mapper.UserMapper;
import com.sanc.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.Random;

/**
 * @Desc:
 * @Author: JerryLi
 * @Date: 2019/6/11 7:28
 * @Version: 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void insertUserTest() {
        User user = new User();
        user.setUsername("孙悟空" + new Random().nextInt(100));
        user.setBirthday(new Date());
        user.setSex("F");
        user.setAddress("深圳");
        user.setUpdatedDate(new Date());
        userMapper.insertUser(user);
        System.out.println("insert user successfully");
    }
}
