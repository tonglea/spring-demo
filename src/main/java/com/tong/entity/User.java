package com.tong.entity;

/**
 * User实体类
 *
 * @author tongl
 * @version 1.0 11/11/2019
 */
public class User {
    Integer id;
    String name;
    String sex;
    Integer age;

    public User() {
    }

    public User(Integer id, String name, String sex, Integer age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + this.id + ", name='" + this.name + '\'' + ", sex='" + this.sex + '\'' + ", age=" + this.age + '}';
    }
}
