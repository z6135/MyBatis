package com.sxau.dao;


import com.sxau.pojo.User;
import com.sxau.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserMapperTest {

     @Test
    public void getUsers(){
         SqlSession sqlSession = MybatisUtils.getSqlSession();
           UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//         List<User> users = mapper.getUsers();
//         for (User user : users) {
//             System.out.println(user);
//         }

         User user = mapper.getUserByID(1);
         System.out.println(user);
         sqlSession.close();
     }
     @Test
    public void UpdateUser(){
         SqlSession sqlSession = MybatisUtils.getSqlSession();
         UserMapper mapper = sqlSession.getMapper(UserMapper.class);

         mapper.UpdateUser(new User(5,"heheh","123123"));
         sqlSession.close();
     }

     @Test
    public void addUser(){
         SqlSession sqlSession = MybatisUtils.getSqlSession();
         UserMapper mapper = sqlSession.getMapper(UserMapper.class);
         mapper.addUser(new User(7,"hehe","123123"));
         sqlSession.close();
     }

     @Test
    public void deleteUser(){
         SqlSession sqlSession = MybatisUtils.getSqlSession();
         UserMapper mapper = sqlSession.getMapper(UserMapper.class);
         int i = mapper.deleteUser(2);
         sqlSession.close();
     }
}
