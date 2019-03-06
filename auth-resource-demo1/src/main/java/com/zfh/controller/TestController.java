package com.zfh.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangfanghui
 * @since 2017/9/13
 */


@RestController
public class TestController {

    @RequestMapping(value = "/test")
    public void test() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
       System.out.println("test方法执行了");
    }

    @RequestMapping(value = "/test1")
    public void test1() {
        System.out.println("test1方法执行了");
    }

}

