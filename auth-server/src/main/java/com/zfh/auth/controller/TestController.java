package com.zfh.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @author zhangfanghui
 * @since 2017/9/13
 */


@RestController
public class TestController {

    @RequestMapping(value = "/test")
    public void test() {
       System.out.println("test方法执行了");
    }

    @RequestMapping(value = "/test1")
    public void test1() {
        System.out.println("test1方法执行了");
    }
}

