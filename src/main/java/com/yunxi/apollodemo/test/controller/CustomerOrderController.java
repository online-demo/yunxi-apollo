package com.yunxi.apollodemo.test.controller;

import com.alibaba.fastjson.JSON;
import com.yunxi.apollodemo.test.dao.CustomerOrderDao;
import com.yunxi.apollodemo.test.model.CustomerOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-04-26
 * @Description:
 */
@RestController
@RequestMapping("customerOrder")
public class CustomerOrderController {
    @Autowired
    private CustomerOrderDao customerOrderDao;

    @RequestMapping("save")
    public void save() {
        CustomerOrder customerOrder_1 = new CustomerOrder();
        customerOrder_1.setId(1);
        customerOrder_1.setAmount(100);
        customerOrderDao.save(customerOrder_1);
        CustomerOrder customerOrder_2 = new CustomerOrder();
        customerOrder_2.setId(2);
        customerOrder_2.setAmount(200);
        customerOrderDao.save(customerOrder_2);
        CustomerOrder customerOrder_3 = new CustomerOrder();
        customerOrder_3.setId(3);
        customerOrder_3.setAmount(300);
        customerOrderDao.save(customerOrder_3);
    }

    @RequestMapping("query")
    public void query() {
        System.out.println("订单1=" + JSON.toJSONString(customerOrderDao.query(1)));
        System.out.println("订单2=" + JSON.toJSONString(customerOrderDao.query(2)));
        System.out.println("订单3=" + JSON.toJSONString(customerOrderDao.query(3)));
    }
}
