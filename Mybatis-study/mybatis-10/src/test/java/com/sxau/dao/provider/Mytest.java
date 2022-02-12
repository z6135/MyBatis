package com.sxau.dao.provider;

import com.sxau.pojo.Provider;
import com.sxau.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Mytest {
    //增加用户信息
    @Test
    public void add(){
        SqlSession sqlSession = MybatisUtils.createSqlSession();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        SimpleDateFormat df = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
        try {
            Date creationDate  = df.parse("2020-03-23 04:20:40");
            Date modifyDate1  = df.parse("2021-03-23 04:20:40");
            int add = mapper.add(new Provider("CJ_GYS001", "山西昝大姐有限公司", "长期合作伙伴，主营产品:茅台",
                    "张晟睿", "1111100000", "山西农业大学",
                    "0354-58858787", 1, creationDate, modifyDate1,1));
            System.out.println(add);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        sqlSession.close();
    }
//    通过条件查询providerList
    @Test
    public void getProviderList(){
        SqlSession sqlSession = MybatisUtils.createSqlSession();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        List<Provider> providerList = mapper.getProviderList("北京","");
        for (Provider provider : providerList) {
            System.out.println(provider);
        }
        sqlSession.close();
    }
}
