package com.yunxi.apollodemo.test.controller;

import com.yunxi.apollodemo.test.entity.App;
import com.yunxi.apollodemo.test.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-04-21
 * @Description:
 */
@RestController
public class AppController {
    @Value("${spring.datasource.url}")
    String url;
    @Autowired
    private AppService appService;
    @RequestMapping("/app")
    public App queryById() {
        System.out.println(url);
        return appService.selectAppById(1);
    }
}
