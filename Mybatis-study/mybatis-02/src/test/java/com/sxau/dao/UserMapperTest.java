package com.sxau.dao;

import com.sxau.pojo.User;
import com.sxau.utils.MybatisUtils1;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils1.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userLike = mapper.getUserList();
        for (User user : userLike) {
            System.out.println(user);
        }
    }
}
