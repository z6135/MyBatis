package com.sxau.dao;

import com.sxau.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    //获取所有老师
//    List<Teacher> getTeacher();
    Teacher getTeacher(@Param("tid") int id);
}
