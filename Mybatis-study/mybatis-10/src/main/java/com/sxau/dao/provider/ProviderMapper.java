package com.sxau.dao.provider;

import org.apache.ibatis.annotations.Param;
import com.sxau.pojo.Provider;

import java.util.List;

public interface ProviderMapper {
    //增加用户信息
    int add(Provider provider);

    //通过条件查询providerList
    public List<Provider> getProviderList(@Param("proName") String proName,
                                          @Param("proCode") String proCode);

    //获取供应商列表
    public List<Provider> getProList();

    //通过条件查询供应商记录数
    public int getProviderCount(@Param("proName") String proName,
                                @Param("proCode") String proCode);

    //通过供应商Id删除供应商信息
    public int deleteProviderById(@Param("id") Integer delId);

    //根据供应商Id获取供应商信息
    public Provider getProviderById(@Param("id") Integer id);

    //修改供应商
    public int modify(Provider provider);
}
