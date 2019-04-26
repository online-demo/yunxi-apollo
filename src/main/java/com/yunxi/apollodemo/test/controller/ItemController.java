package com.yunxi.apollodemo.test.controller;

import com.alibaba.fastjson.JSON;
import com.yunxi.apollodemo.test.dao.ItemDao;
import com.yunxi.apollodemo.test.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-04-26
 * @Description:
 */
@RestController
@RequestMapping("item")
public class ItemController {
    @Autowired
    private ItemDao itemDao;

    @RequestMapping("save")
    public void ave() {
        Item item_1 = new Item();
        item_1.setId(1);
        item_1.setValue(100);
        itemDao.save(item_1);
        Item item_2 = new Item();
        item_2.setId(2);
        item_2.setValue(200);
        itemDao.save(item_2);
        Item item_3 = new Item();
        item_3.setId(3);
        item_3.setValue(300);
        itemDao.save(item_3);
    }

    @RequestMapping("query")
    public void query() {
        System.out.println("商品1=" + JSON.toJSONString(itemDao.query(1)));
        System.out.println("商品2=" + JSON.toJSONString(itemDao.query(2)));
        System.out.println("商品3=" + JSON.toJSONString(itemDao.query(3)));
    }
}
