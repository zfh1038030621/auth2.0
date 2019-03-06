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


@Controller
public class Test1Controller {

    @RequestMapping(value = "index")
    public String index() {
        return "index";
        //System.out.println("到本系统的登录页面了");
    }
}

