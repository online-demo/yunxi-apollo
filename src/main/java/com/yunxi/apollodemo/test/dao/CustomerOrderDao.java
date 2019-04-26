package com.yunxi.apollodemo.test.dao;

import com.yunxi.apollodemo.test.model.CustomerOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-01-04
 * @Description:
 */
@Mapper
public interface CustomerOrderDao {
    int save(CustomerOrder customer);
    CustomerOrder query(int id);
}
