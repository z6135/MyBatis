package com.sxau.dao;

import com.sxau.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> queryUsers();

    User queryUserID(@Param("id") int id);

    int updateUser(User user);
}
