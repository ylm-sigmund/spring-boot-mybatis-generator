package com.diy.sigmund.mybatismysql;

import com.diy.sigmund.mybatismysql.entity.Admire;
import com.diy.sigmund.mybatismysql.mapper.AdmireMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisMysqlApplicationTests {
    @Autowired
    private AdmireMapper admireMapper;

    @Test
    void contextLoads() {
        Admire admire = admireMapper.selectByPrimaryKey(1);
        System.out.println(admire.getImage());
    }

}
