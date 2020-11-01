package com.diy.sigmund.mybatisoracle.service.impl.test2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.diy.sigmund.mybatisoracle.service.HelloService;

/**
 * @author ylm-sigmund
 * @since 2020/11/1 21:21
 */
@Service
public class Test2HelloService implements HelloService {

    private static final Logger LOGGER = LoggerFactory.getLogger(Test2HelloService.class);

    @Value("#{config.name}")
    private String name;

    @Override
    public void sayHello() {
        LOGGER.info("HelloService name is {}", name);
    }
}
