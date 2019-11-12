package com.tong.service.impl;

import com.tong.dao.UserDao;
import com.tong.entity.User;
import com.tong.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 服务层实现
 *
 * @author tongl
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    /**
     * 添加修改用户
     *
     * @param user 用户
     */
    @Override
    public void saveUser(User user) {
        Integer id = user.getId();
        User u = userDao.getUser(id);
        if (u == null) {
            // 如果查询user为空，那么新增用户
            userDao.addUser(user);
            logger.info("新增用户：{}", user);
        } else {
            // 如果user不为空，那么更改用户
            userDao.updateUser(user);
            logger.info("修改用户信息：{}", user);
        }
    }

    /**
     * 删除用户
     *
     * @param id 用户id
     */
    @Override
    public void deleteUser(int id) {

        User user = userDao.getUser(id);
        userDao.deleteUser(id);

        logger.info("删除用户：{}", user);
    }

}
