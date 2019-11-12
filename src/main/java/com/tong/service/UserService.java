package com.tong.service;

import com.tong.entity.User;

/**
 * 服务层接口
 *
 * @author tongl
 * @version 1.0 10/10/2019
 */
public interface UserService {

    /**
     * 新增修改用户
     *
     * @param user 用户
     */
    void saveUser(User user);

    /**
     * 删除用户
     *
     * @param id 用户id
     */
    void deleteUser(int id);
}
