package com.zfh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangfanghui
 * @since 2017/9/13
 */


@Controller
public class LoginController {

    @RequestMapping(value = "/eqe")
    public void test() {
       System.out.println("test方法执行了");
    }

    @RequestMapping(value = "index")
    public String login() {
        return "index";
        //System.out.println("到本系统的登录页面了");
    }
}

