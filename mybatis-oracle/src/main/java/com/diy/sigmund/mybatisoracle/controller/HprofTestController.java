package com.diy.sigmund.mybatisoracle.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diy.sigmund.mybatisoracle.mapper.TestBatchMapper;

/**
 * @author ylm-sigmund
 * @since 2021/2/23 19:08
 */
@RestController
public class HprofTestController {

    @Resource
    private TestBatchMapper testBatchMapper;

    /**
     * -Xmx30m -XX:+HeapDumpOnOutOfMemoryError
     * 
     * @param sql
     *            sql
     * @return Object
     */
    @GetMapping("hprofTest")
    public Object getResult(@RequestParam("sql") String sql) {
        final List<Map<String, Object>> result = testBatchMapper.getResult(sql);
        return result;
    }

}
