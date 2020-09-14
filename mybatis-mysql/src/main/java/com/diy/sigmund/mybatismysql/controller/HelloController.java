package com.diy.sigmund.mybatismysql.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ylm-sigmund
 * @since 2020/9/14 13:11
 */

@Controller
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private SessionRestController sessionRestController;

    @GetMapping("hello")
    public String hello(HttpServletRequest httpServletRequest) {
        logger.info(sessionRestController.getSession(httpServletRequest));
        return "hello";
    }

    @GetMapping("testJsZero")
    public String testJsZero() {
        return "testJsZero";
    }
}
