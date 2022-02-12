package com.sxau.dao;

import com.sxau.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    List<User> getUserLike(String value);

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int updateUser2(Map<String,Object> map);

    int deleteUser(int id);
}
