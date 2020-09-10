package com.diy.sigmund.mybatismysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan
@SpringBootApplication
public class MybatisMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisMysqlApplication.class, args);
    }

}
