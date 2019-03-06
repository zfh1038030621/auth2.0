package com.zfh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangfanghui
 * @since 2017/9/13
 */


@RestController
public class LoginController {

    @RequestMapping(value = "/eqe")
    public void test() {
       System.out.println("test方法执行了");
    }
}

