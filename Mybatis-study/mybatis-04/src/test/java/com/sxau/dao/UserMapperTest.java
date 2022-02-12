package com.sxau.dao;

import com.sxau.pojo.User;
import com.sxau.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


public class UserMapperTest {

     static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        logger.info("info:进入了testlog4j");
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testlog4j(){
        logger.info("info:进入了testlog4j");
        logger.debug("debug:进入了testlog4j");
        logger.error("error:进入了testlog4j");

    }

    @Test
    public void getUserId(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("start",0);
        map.put("end",2);
        List<User> user = mapper.getUserId(map);
        for (User user1 : user) {
            System.out.println(user1);
        }
        sqlSession.close();
    }

    @Test
    public void getUserByRowBounds(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        int currentPage = 2;  //第几页
        int pageSize = 2;  //每页显示几个
        RowBounds rowBounds = new RowBounds((currentPage-1)*pageSize,pageSize);

        //通过session.**方法进行传递rowBounds，[此种方式现在已经不推荐使用了]
        List<User> users = sqlSession.selectList("com.sxau.dao.UserMapper.getUserByRowBounds", null, rowBounds);

        for (User user: users){
            System.out.println(user);
        }

        sqlSession.close();
    }
}
