package com.diy.sigmund.mybatisoracle.controller;

import com.diy.sigmund.mybatisoracle.mapper.TestBatchMapper;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ylm-sigmund
 * @since 2021/2/23 19:08
 */
@RestController
public class HprofTestController {

  @Resource
  private TestBatchMapper testBatchMapper;

  @GetMapping("hprofTest")
  public Object getResult(@RequestParam("sql") String sql){
    final List<Map<String,Object>> result = testBatchMapper.getResult(sql);
    return result;
  }

}
