package com.tong.dao.impl;

import com.tong.dao.UserDao;
import com.tong.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久化数据层实现
 *
 * @author tongl
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 新增用户
     *
     * @param user 用户
     */
    @Override
    public void addUser(User user) {
        jdbcTemplate.update("insert into t_user values(?,?,?,?)", user.getId(), user.getName(), user.getSex(), user.getAge());
    }

    /**
     * 根据id删除用户
     *
     * @param id id
     */
    @Override
    public void deleteUser(int id) {
        jdbcTemplate.update("delete from t_user where id = ?", id);
    }

    /**
     * 根据id查找用户
     *
     * @param id 用户id
     * @return user
     */
    @Override
    public User getUser(int id) {
        List<User> users = jdbcTemplate.query("select * from t_user where id = ?",
                new BeanPropertyRowMapper<User>(User.class), id);
        if (users != null && users.size() > 0) {
            return users.get(0);
        }
        return null;
    }

    /**
     * 更新用户
     *
     * @param user 用户
     */
    @Override
    public void updateUser(User user) {
        jdbcTemplate.update("update t_user set name = ?, age = ?, sex = ? where id = ?",
                user.getName(), user.getAge(), user.getSex(), user.getId());
    }

}
