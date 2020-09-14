package com.diy.sigmund.mybatismysql.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 用监听器统计网站在线人数
 * 
 * HttpSessionListener:浏览器向服务器发送一个请求会产生一个会话，针对此事件作出对应的行为
 *
 * @author ylm-sigmund
 * @since 2020/9/14 13:15
 */
@Component
@WebListener
public class SessionListener implements HttpSessionListener {

    private Logger logger = LoggerFactory.getLogger(SessionListener.class);

    public static final String COUNT = "count";
    /**
     * 记录session的数量
     */
    private int count = 0;

    /**
     * 监听session的创建
     * 
     * @param se
     *            HttpSessionEvent
     */
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        count++;
        se.getSession().setAttribute(COUNT, count);
        logger.info("sessionCreated");
    }

    /**
     * 监听session的销毁
     * 
     * @param se
     *            HttpSessionEvent
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        count--;
        se.getSession().setAttribute(COUNT, count);
        logger.info("sessionDestroyed");
    }
}
