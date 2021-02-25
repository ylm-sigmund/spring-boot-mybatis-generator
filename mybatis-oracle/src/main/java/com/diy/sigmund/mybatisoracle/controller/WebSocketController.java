package com.diy.sigmund.mybatisoracle.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diy.sigmund.mybatisoracle.config.websocket.OneWebSocket;

/**
 * @author ylm-sigmund
 * @since 2021/2/25 21:18
 */
@RestController
public class WebSocketController {

    @GetMapping("hello/{userId}")
    public Object hello(HttpServletRequest request, @RequestParam String msg, @PathVariable String userId) {
        OneWebSocket.sendInfo(msg, userId);
        return "hello";
    }
}
