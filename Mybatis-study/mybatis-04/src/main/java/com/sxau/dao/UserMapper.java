package com.sxau.dao;

import com.sxau.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //根据ID查询用户
    User getUserById(int id);

    List<User> getUserId(Map<String ,Integer> map);

    //选择全部用户RowBounds实现分页
    List<User> getUserByRowBounds();

}
