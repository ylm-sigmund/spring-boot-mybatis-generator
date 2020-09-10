package com.diy.sigmund.mybatisoracle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.diy.sigmund.mybatisoracle.mapper")
@SpringBootApplication
public class MybatisOracleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisOracleApplication.class, args);
    }

}
