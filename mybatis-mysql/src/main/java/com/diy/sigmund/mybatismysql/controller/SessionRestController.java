package com.diy.sigmund.mybatismysql.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diy.sigmund.mybatismysql.listener.SessionListener;

/**
 * @author ylm-sigmund
 * @since 2020/9/14 13:32
 */
@RestController
public class SessionRestController {
    @GetMapping("getSession")
    public String getSession(HttpServletRequest httpServletRequest) {
        return httpServletRequest.getSession().getAttribute(SessionListener.COUNT).toString();
    }
}
