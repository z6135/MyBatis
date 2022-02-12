package com.sxau.dao.bill;

import com.sxau.pojo.Bill;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface BillMapper {
    //根据供应商Id查询订单数量
    BigDecimal getBillCountByProviderId(@Param("id") int id);

    //增加订单
    int add(Bill bill);

    //通过查询条件获取供应商列表-getBillList
    List<Bill> getBillList(@Param("productName") String productName);
//                                  @Param("providerId") String providerId,
//                                  @Param("isPayment") String isPayment);

    //通过条件查询，查询供货商数量
    int getBillCount(@Param("productName") String productName,
                            @Param("providerId") String providerId,
                            @Param("isPayment") String isPayment);

    //通过delId删除Bill
    public int deleteBillById(@Param("id") Integer id);

    //通过billId获取Bill
    public Bill getBillById(@Param("id") Integer id);

    //修改订单信息
    public int modify(Map map);
//            String productName, String productDesc, Integer modifyBy, Integer id

    //根据供应商Id删除订单信息
    public int deleteBillByProviderId(@Param("providerId") Integer providerId);
}
