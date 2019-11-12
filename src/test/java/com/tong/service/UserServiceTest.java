package com.tong.service;

import com.tong.conf.DataConfig;
import com.tong.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 用户服务测试类
 * @author tongl
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataConfig.class})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    /**
     * 添加用户测试
     */
    @Test
    public void testAddUser(){
        User user = new User(1001,"张三","男",17);
        User user2 = new User(1001,"张三","男",20);
        User user3 = new User(1012,"张四","男",18);
        //System.out.println(user);
        userService.saveUser(user);
        userService.saveUser(user2);
        userService.saveUser(user3);
    }

    /**
     * 删除用户测试
     */
    @Test
    public void testDeleteUser(){

        userService.deleteUser(1001);
        userService.deleteUser(1002);
    }
}
