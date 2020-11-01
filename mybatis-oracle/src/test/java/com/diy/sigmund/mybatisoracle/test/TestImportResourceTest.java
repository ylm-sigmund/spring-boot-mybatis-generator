package com.diy.sigmund.mybatisoracle.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author ylm-sigmund
 * @since 2020/11/1 20:53
 */
@SpringBootTest
@ContextConfiguration(locations = {"classpath:config/xmlConfig/application-bean.xml"})
class TestImportResourceTest {

  @Autowired
  private TestImportResource testImportResource;

  @Test
  void getMessage() {
    testImportResource.getMessage();
  }
}