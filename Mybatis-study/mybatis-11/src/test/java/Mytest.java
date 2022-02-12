import mapper.ClassMapper;
import mapper.ClassesMapper;
import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Class;
import pojo.Classes;
import pojo.User;
import utils.MybatisUtils;

import java.util.List;

public class Mytest {
    @Test
    public void getAll11(){
        SqlSession session = MybatisUtils.createSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.getAll();
        for (User user : users) {
            System.out.println(user);
        }
        session.close();
    }

    @Test
    public void insertUser(){

        SqlSession session=MybatisUtils.createSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User(20,"123123123123","2131");
        int i = mapper.insertUser(user);
        System.out.println(user);
        System.out.println(i);
        //session.commit(); //提交事务,重点!不写的话不会提交到数据库
        session.close();
    }

    @Test
    public void update(){
        SqlSession session = MybatisUtils.createSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User(18,"hhh","1111");
        int i = mapper.updataUser(user);
        System.out.println(i);
        session.commit();
        session.close();
    }
    @Test
    public void getAll(){
        SqlSession session = MybatisUtils.createSession();
        ClassMapper mapper = session.getMapper(ClassMapper.class);
        Class all = mapper.getAllClass(1);
        System.out.println(all);
    }

    @Test
    public void selectAll(){
        SqlSession session = MybatisUtils.createSession();
        ClassMapper mapper = session.getMapper(ClassMapper.class);
        List<Class> classes = mapper.selectAll();
        for (Class aClass : classes) {
            System.out.println(aClass);
        }
    }

    @Test
    public void getClassesByid(){
        SqlSession session = MybatisUtils.createSession();
        ClassesMapper mapper = session.getMapper(ClassesMapper.class);
        Classes classesByid = mapper.getClassesByid(1);
        System.out.println(classesByid);
        session.close();
//        List<Classes> classesByid = mapper.getClassesByid(1);
//        for (Classes classes : classesByid) {
//            System.out.println(classes);
//        }
    }

//    UPDATE students SET english = 10 WHERE `name` = '哈哈哈哈';
//    INSERT INTO students VALUES(2,'小二',12);

    @Test
    public void getClassAll(){
        SqlSession session = MybatisUtils.createSession();
        ClassesMapper mapper = session.getMapper(ClassesMapper.class);
        List<Classes> classAll = mapper.getClassAll();
        for (Classes classes : classAll) {
            System.out.println(classes);
        }
        session.close();




    }
}
