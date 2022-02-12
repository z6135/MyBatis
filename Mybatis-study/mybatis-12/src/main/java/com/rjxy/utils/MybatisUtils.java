package com.rjxy.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try{
            String resource = "mybatis-config.xml";
            //通过类加载器加载配置资源
            InputStream inputStream = Resources.getResourceAsStream(resource);
            //构建sqlSession工厂
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static SqlSession createSession(){
        return sqlSessionFactory.openSession();
    }
}
