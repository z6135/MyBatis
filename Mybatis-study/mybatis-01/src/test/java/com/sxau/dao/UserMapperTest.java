package com.sxau.dao;

import com.sxau.pojo.User;
import com.sxau.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {

    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userLike = mapper.getUserLike("%李%");
        for (User user : userLike) {
            System.out.println(user);
        }
    }
    @Test
    public void  test(){

        //第一步： 获得sqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //方式一：执行SQL语句 getmapper
//        UserDao mapper = sqlSession.getMapper(UserDao.class);
//        List<User> userList = mapper.getUserList();
        //方式二：
        List<User> userList = sqlSession.selectList("com.sxau.dao.UserDao.getUserList");
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }
    //增删改 需要提交事务
@Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(new User(4,"hahah","123123"));
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(4,"呵呵","123123"));
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(4);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String,Object> map = new HashMap<String,Object>();

        map.put("userid",4);
        map.put("password","4444");
        mapper.updateUser2(map);
        sqlSession.commit();
        sqlSession.close();
    }
}
