package com.diy.sigmund.mybatisoracle.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author ylm-sigmund
 * @since 2020/11/1 21:27
 */
@SpringBootTest
@ContextConfiguration(locations = {"classpath:config/xmlConfig/application-bean.xml",
    "classpath:config/xmlConfig/applicationContext.xml"})
@ActiveProfiles("test2")
class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @Test
    void sayHello() {
        // 2020-11-01 21:43:44.706 INFO 5644 --- [ main] c.d.s.m.s.impl.test2.Test2HelloService : HelloService name is
        // test2
        helloService.sayHello();
    }
}