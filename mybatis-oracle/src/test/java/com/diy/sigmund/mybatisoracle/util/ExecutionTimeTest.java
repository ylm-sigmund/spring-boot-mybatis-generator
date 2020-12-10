package com.diy.sigmund.mybatisoracle.util;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * @author ylm-sigmund
 * @since 2020/12/10 19:39
 */
@SpringBootTest
@ActiveProfiles("test1")
public class ExecutionTimeTest {
    LinkedHashMap<String, String> map = new LinkedHashMap<>();

    /**
     * 测试各单元测试每一次执行分别打印的时间，逗号分隔，不用入库
     */
    @Test
    void testTime() {
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        for (int i = 0; i < 3; i++) {
            test1(stringBuffer1);
            test2(stringBuffer2);
        }
        map.put("test1", stringBuffer1.toString());
        map.put("test2", stringBuffer2.toString());
        map.forEach((key, value) -> System.out.println(key + "," + value));
    }

    void test1(StringBuffer stringBuffer) {
        final LocalDateTime start = LocalDateTime.now();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        final LocalDateTime end = LocalDateTime.now();
        final long millis = Duration.between(start, end).toMillis();
        stringBuffer.append(millis).append(",");
    }

    void test2(StringBuffer stringBuffer) {
        final LocalDateTime start = LocalDateTime.now();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        final LocalDateTime end = LocalDateTime.now();
        final long millis = Duration.between(start, end).toMillis();
        stringBuffer.append(millis).append(",");
    }
}
