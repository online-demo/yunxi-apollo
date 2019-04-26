package com.yunxi.apollodemo.test.controller;

import com.alibaba.fastjson.JSON;
import com.yunxi.apollodemo.test.dao.CustomerDao;
import com.yunxi.apollodemo.test.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-04-26
 * @Description:
 */
@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private CustomerDao customerDao;

    @RequestMapping("/save")
    public void save() {
        Customer customer_1 = new Customer();
        customer_1.setId(1);
        customer_1.setName("yunxi");
        customer_1.setPhone("3344625292");
        customerDao.save(customer_1);
        Customer customer_2 = new Customer();
        customer_2.setId(2);
        customer_2.setName("wushuang");
        customer_2.setPhone("3190976240");
        customerDao.save(customer_2);
    }

    @RequestMapping("/query")
    public void query() {
        System.out.println("用户1=" + JSON.toJSONString(customerDao.query(1)));
        System.out.println("用户2=" + JSON.toJSONString(customerDao.query(2)));
    }
}
