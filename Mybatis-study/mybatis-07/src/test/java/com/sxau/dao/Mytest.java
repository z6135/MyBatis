package com.sxau.dao;

import com.sxau.pojo.Teacher;
import com.sxau.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Mytest {

//    @Test
//    public void getTercher(){
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
//        List<Teacher> teacherList = mapper.getTeacher();
//        for (Teacher teacher : teacherList) {
//            System.out.println(teacher);
//        }
//        sqlSession.close();
//    }
@Test
public void getTercher(){
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
    Teacher teacher1 = mapper.getTeacher(1);
    System.out.println(teacher1);
    sqlSession.close();
}

}
