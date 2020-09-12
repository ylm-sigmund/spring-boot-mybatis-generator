package com.diy.sigmund.mybatismysql;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.diy.sigmund.mybatismysql.entity.Admire;
import com.diy.sigmund.mybatismysql.mapper.AdmireMapper;

@SpringBootTest
class MybatisMysqlApplicationTests {
    Logger logger = LoggerFactory.getLogger(MybatisMysqlApplicationTests.class);

    @Autowired
    private AdmireMapper admireMapper;

    @Test
    void contextLoads() {
        Admire admire = admireMapper.selectByPrimaryKey(1);
        System.out.println(admire.getImage());

        // Admire admire1 = new Admire();
        // admire1.setAdmireid(9);
        // admireMapper.insert(admire1);
        //
        // admire1.setTel("123");
        // admireMapper.updateByPrimaryKeySelective(admire1);
        //
        // admireMapper.deleteByPrimaryKey(9);
    }





}
