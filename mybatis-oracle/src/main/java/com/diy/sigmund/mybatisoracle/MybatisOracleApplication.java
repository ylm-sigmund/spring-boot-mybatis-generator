package com.diy.sigmund.mybatisoracle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 旧框架SSM项目移行到SpringBoot中，直接读取旧xml文件，读取xml配置bean(@ImportResource)
 * 
 * 读取xml配置bean测试类使用@ContextConfiguration
 */
@MapperScan("com.diy.sigmund.mybatisoracle.mapper")
@ImportResource(locations = {"classpath:config/xmlConfig/application-bean.xml",
    "classpath:config/xmlConfig/applicationContext.xml"})
@SpringBootApplication
public class MybatisOracleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisOracleApplication.class, args);
    }

}
