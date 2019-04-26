package com.yunxi.apollodemo.test.dao;

import com.yunxi.apollodemo.test.model.Customer;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-01-04
 * @Description:
 */
@Mapper
public interface CustomerDao {
    int save(Customer customer);
    Customer query(int id);
}
