package com.sxau.dao;

import com.sxau.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    //插入数据
    int addBlog(Blog blog);

    //查询博客
    List<Blog> quertBlogIF(Map map);

    //更新数据
    int updateBlog(Map map);

    List<Blog> quertBlogChoose(Map map);
}
