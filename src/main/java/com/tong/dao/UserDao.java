package com.tong.dao;

import com.tong.entity.User;

/**
 * 持久化数据层接口
 *
 * @author tongl
 */
public interface UserDao {


    /**
     * 新增用户
     *
     * @param user 用户
     */
    void addUser(User user);

    /**
     * 根据id删除用户
     *
     * @param id id
     */
    void deleteUser(int id);

    /**
     * 根据id查找用户
     *
     * @param id 用户id
     */
    User getUser(int id);

    /**
     * 更新用户信息
     *
     * @param user 用户
     */
    void updateUser(User user);


}
