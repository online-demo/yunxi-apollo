package com.yunxi.apollodemo.test.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-04-21
 * @Description:
 */
@RestController
public class HelloWorld {
    @Value("${name:无双老师}")
    private String name;
    @Value("${content:欢迎来到云析学院}")
    private String content;

    @RequestMapping("/hello")
    public String helloWorld() {
        return name + "你好！" + content;

    }
}
