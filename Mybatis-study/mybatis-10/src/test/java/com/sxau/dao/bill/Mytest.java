package com.sxau.dao.bill;

import com.sxau.pojo.Bill;
import com.sxau.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Mytest {
    @Test
    public void getBillCountByProviderId(){
        SqlSession sqlSession = MybatisUtils.createSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        BigDecimal billCountByProviderId = mapper.getBillCountByProviderId(2);
        System.out.println(billCountByProviderId);
        sqlSession.close();
    }


    @Test
    public void add(){
        SqlSession sqlSession = MybatisUtils.createSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
//        int add = mapper.add(new Bill(19,"BILL2016_019","hh","hh","hh",1000,10000,2,1,"2021-03-23 04:20:40",1,"2021-03-23 04:20:40",2));
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
        Date creationDate = null;
        Date modifyDate = null;
        try {
            creationDate  = df.parse("2020-03-23 04:20:40");
            modifyDate  = df.parse("2021-03-23 04:20:40");
            int add = mapper.add(new Bill(20, "billCode", "productName", "productDesc", "productUnit", new BigDecimal(1000.00), new BigDecimal(1000.00), 2, 2,creationDate, 1,modifyDate,1,"大运"));
            System.out.println(add);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        sqlSession.close();
    }

    @Test
    public void getBillList(){
        SqlSession sqlSession = MybatisUtils.createSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        List<Bill> billList = mapper.getBillList("productName");
        for (Bill bill : billList) {
            System.out.println(bill);
        }
        sqlSession.close();
    }

    @Test
    public void getBillCount(){
        SqlSession sqlSession = MybatisUtils.createSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        double count = mapper.getBillCount("橄榄油", "7", "2");
        BigDecimal bigDecimal = new BigDecimal(count);
        System.out.println(bigDecimal);
        sqlSession.close();
    }



    @Test
    public void deleteBillById(){
        SqlSession sqlSession = MybatisUtils.createSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        int i = mapper.deleteBillById(19);
        sqlSession.close();
    }

    @Test
    public void getBillById(){
        SqlSession sqlSession = MybatisUtils.createSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        Bill billById = mapper.getBillById(2);
        System.out.println(billById);
        sqlSession.close();
    }

    @Test
    public void modify(){
        SqlSession sqlSession = MybatisUtils.createSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("productName","hhhh");
        map.put("productDesc","xxxxxxx");
        map.put("modifyBy",2);
        map.put("id",20);
        mapper.modify(map);
        sqlSession.close();
    }

    @Test
    public void deleteBillByProviderId(){
        SqlSession sqlSession = MybatisUtils.createSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        int i = mapper.deleteBillByProviderId(100);
        sqlSession.close();
    }
}
