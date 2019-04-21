package com.yunxi.apollodemo.test.service;

import com.yunxi.apollodemo.test.dao.AppDao;
import com.yunxi.apollodemo.test.entity.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-04-21
 * @Description:
 */
@Service
public class AppService {
    @Autowired
    private AppDao appDao;

    public App selectAppById(int id) {
        return appDao.selectById(id);
    }

}
