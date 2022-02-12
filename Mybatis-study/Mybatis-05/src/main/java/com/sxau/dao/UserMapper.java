package com.sxau.dao;

import com.sxau.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

@Select("select *from user")
    List<User> getUsers();

//方法存在多个参数所有参数前面必须加上@Param("id")注解
@Select("select * from user where id = #{id}")
    User getUserByID(@Param("id") int id);

@Insert("insert into user(id,name,pwd) value (#{id},#{name},#{pwd})")
    User addUser(User user);

@Update("update user set name=#{name},pwd=#{pwd} where id=#{id}")
    User UpdateUser(User user);

@Delete("delete from user where id=#{id}")
    int deleteUser(@Param("id") int id);
}
