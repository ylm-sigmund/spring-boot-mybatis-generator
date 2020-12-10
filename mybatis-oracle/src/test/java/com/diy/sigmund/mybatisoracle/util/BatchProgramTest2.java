package com.diy.sigmund.mybatisoracle.util;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.diy.sigmund.mybatisoracle.entity.TestBatch;
import com.diy.sigmund.mybatisoracle.mapper.StudentMapper;
import com.diy.sigmund.mybatisoracle.mapper.TestBatchMapper;
import com.diy.sigmund.mybatisoracle.service.HelloService;

/**
 * @author ylm-sigmund
 * @since 2020/10/11 20:46
 */
// 在启动会根据主启动类上的@SpringBootApplication去扫描当前类及其子包下的类.当出现子包中相同类名时,容器失败.
@SpringBootTest
@ActiveProfiles("test1")
class BatchProgramTest2 {

    // @Autowired
    // @Qualifier("test1HelloService")
    @Resource(name = "test1HelloService")
    private HelloService helloService;

    @Resource
    private StudentMapper studentMapper;

    @Autowired
    private TestBatchMapper testBatchMapper;

    LinkedHashMap<String, String> map = new LinkedHashMap<>();

    // @Test
    // void batchExec(StringBuffer stringBuffer) {
    // final List<Student> students = studentMapper.getStudents(1, 11);
    // students.forEach(student -> student.setPhone(122L));
    // // 批处理更新return的是一个负数，这个数值等于batchNum
    // final int resultNum = BatchProgram.process(students, 5, subList -> studentMapper.updateStudents(subList));
    // System.out.println(resultNum);
    // // BatchProgram.accept(students, subList -> studentMapper.updateStudents(subList), 5);
    // // final int applyNum = BatchProgram.apply(students, subList -> studentMapper.updateStudents(subList), 5);
    // // System.out.println(applyNum);
    // }

    /**
     * 测试批量插入性能，不使用批处理，预编译时间太长，都连接超时了
     */
    // @Test
    // void testBatchInsertInto(StringBuffer stringBuffer) {
    // final List<TestBatch> one = testBatchMapper.getSome(110001, 120000);
    // final int delete = testBatchMapper.deleteSome(110001, 120000);
    //
    // final LocalDateTime start = LocalDateTime.now();
    // testBatchMapper.batchInsertTwo(one);
    // final LocalDateTime end = LocalDateTime.now();
    // System.out.println("批量insert10000条数据，使用的时间 ms : " + Duration.between(start, end).toMillis());
    // }
    /**
     * 测试各单元测试每一次执行分别打印的时间，逗号分隔，不用入库
     */
    @Test
    void testTime() {
        StringBuffer stringBuffer100 = new StringBuffer();
        StringBuffer stringBuffer200 = new StringBuffer();
        StringBuffer stringBuffer300 = new StringBuffer();
        StringBuffer stringBuffer400 = new StringBuffer();
        StringBuffer stringBuffer500 = new StringBuffer();
        StringBuffer stringBuffer600 = new StringBuffer();
        StringBuffer stringBuffer700 = new StringBuffer();
        StringBuffer stringBuffer800 = new StringBuffer();
        StringBuffer stringBuffer900 = new StringBuffer();
        StringBuffer stringBuffer5 = new StringBuffer();
        StringBuffer stringBuffer10 = new StringBuffer();
        StringBuffer stringBuffer30 = new StringBuffer();
        StringBuffer stringBuffer50 = new StringBuffer();
        StringBuffer stringBuffer70 = new StringBuffer();
        StringBuffer stringBuffer85 = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            testBatchInsertIntoFor100(stringBuffer100);
            testBatchInsertIntoFor200(stringBuffer200);
            testBatchInsertIntoFor300(stringBuffer300);
            testBatchInsertIntoFor400(stringBuffer400);
            testBatchInsertIntoFor500(stringBuffer500);
            testBatchInsertIntoFor600(stringBuffer600);
            testBatchInsertIntoFor700(stringBuffer700);
            testBatchInsertIntoFor800(stringBuffer800);
            testBatchInsertIntoFor900(stringBuffer900);
            testBatchInsertIntoFor5(stringBuffer5);
            testBatchInsertIntoFor10(stringBuffer10);
            testBatchInsertIntoFor30(stringBuffer30);
            testBatchInsertIntoFor50(stringBuffer50);
            testBatchInsertIntoFor70(stringBuffer70);
            testBatchInsertIntoFor85(stringBuffer85);
        }
        map.put("100", stringBuffer100.toString());
        map.put("200", stringBuffer200.toString());
        map.put("300", stringBuffer300.toString());
        map.put("400", stringBuffer400.toString());
        map.put("500", stringBuffer500.toString());
        map.put("600", stringBuffer600.toString());
        map.put("700", stringBuffer700.toString());
        map.put("800", stringBuffer800.toString());
        map.put("900", stringBuffer900.toString());
        map.put("5", stringBuffer5.toString());
        map.put("10", stringBuffer10.toString());
        map.put("30", stringBuffer30.toString());
        map.put("50", stringBuffer50.toString());
        map.put("70", stringBuffer70.toString());
        map.put("85", stringBuffer85.toString());
        map.forEach((key, value) -> System.out.println(key + "," + value));
    }

    void testBatchInsertIntoFor100(StringBuffer stringBuffer) {
        final List<TestBatch> one = testBatchMapper.getSome(140001, 150000);
        final int delete = testBatchMapper.deleteSome(140001, 150000);

        final LocalDateTime start = LocalDateTime.now();
        BatchProgram.apply(one, 100, list -> testBatchMapper.batchInsertTwo(list));
        final LocalDateTime end = LocalDateTime.now();
        System.out.println("批量insert10000条数据，使用的时间 ms : " + Duration.between(start, end).toMillis());
        final long millis = Duration.between(start, end).toMillis();
        stringBuffer.append(millis).append(",");
    }

    void testBatchInsertIntoFor200(StringBuffer stringBuffer) {
        final List<TestBatch> one = testBatchMapper.getSome(140001, 150000);
        final int delete = testBatchMapper.deleteSome(140001, 150000);

        final LocalDateTime start = LocalDateTime.now();
        BatchProgram.apply(one, 200, list -> testBatchMapper.batchInsertTwo(list));
        final LocalDateTime end = LocalDateTime.now();
        System.out.println("批量insert10000条数据，使用的时间 ms : " + Duration.between(start, end).toMillis());
        final long millis = Duration.between(start, end).toMillis();
        stringBuffer.append(millis).append(",");
    }

    void testBatchInsertIntoFor300(StringBuffer stringBuffer) {
        final List<TestBatch> one = testBatchMapper.getSome(140001, 150000);
        final int delete = testBatchMapper.deleteSome(140001, 150000);

        final LocalDateTime start = LocalDateTime.now();
        BatchProgram.apply(one, 300, list -> testBatchMapper.batchInsertTwo(list));
        final LocalDateTime end = LocalDateTime.now();
        System.out.println("批量insert10000条数据，使用的时间 ms : " + Duration.between(start, end).toMillis());
        final long millis = Duration.between(start, end).toMillis();
        stringBuffer.append(millis).append(",");
    }

    void testBatchInsertIntoFor400(StringBuffer stringBuffer) {
        final List<TestBatch> one = testBatchMapper.getSome(140001, 150000);
        final int delete = testBatchMapper.deleteSome(140001, 150000);

        final LocalDateTime start = LocalDateTime.now();
        BatchProgram.apply(one, 400, list -> testBatchMapper.batchInsertTwo(list));
        final LocalDateTime end = LocalDateTime.now();
        System.out.println("批量insert10000条数据，使用的时间 ms : " + Duration.between(start, end).toMillis());
        final long millis = Duration.between(start, end).toMillis();
        stringBuffer.append(millis).append(",");
    }

    void testBatchInsertIntoFor500(StringBuffer stringBuffer) {
        final List<TestBatch> one = testBatchMapper.getSome(140001, 150000);
        final int delete = testBatchMapper.deleteSome(140001, 150000);

        final LocalDateTime start = LocalDateTime.now();
        BatchProgram.apply(one, 500, list -> testBatchMapper.batchInsertTwo(list));
        final LocalDateTime end = LocalDateTime.now();
        System.out.println("批量insert10000条数据，使用的时间 ms : " + Duration.between(start, end).toMillis());
        final long millis = Duration.between(start, end).toMillis();
        stringBuffer.append(millis).append(",");
    }

    void testBatchInsertIntoFor600(StringBuffer stringBuffer) {
        final List<TestBatch> one = testBatchMapper.getSome(140001, 150000);
        final int delete = testBatchMapper.deleteSome(140001, 150000);

        final LocalDateTime start = LocalDateTime.now();
        BatchProgram.apply(one, 600, list -> testBatchMapper.batchInsertTwo(list));
        final LocalDateTime end = LocalDateTime.now();
        System.out.println("批量insert10000条数据，使用的时间 ms : " + Duration.between(start, end).toMillis());
        final long millis = Duration.between(start, end).toMillis();
        stringBuffer.append(millis).append(",");
    }

    void testBatchInsertIntoFor700(StringBuffer stringBuffer) {
        final List<TestBatch> one = testBatchMapper.getSome(140001, 150000);
        final int delete = testBatchMapper.deleteSome(140001, 150000);

        final LocalDateTime start = LocalDateTime.now();
        BatchProgram.apply(one, 700, list -> testBatchMapper.batchInsertTwo(list));
        final LocalDateTime end = LocalDateTime.now();
        System.out.println("批量insert10000条数据，使用的时间 ms : " + Duration.between(start, end).toMillis());
        final long millis = Duration.between(start, end).toMillis();
        stringBuffer.append(millis).append(",");
    }

    void testBatchInsertIntoFor800(StringBuffer stringBuffer) {
        final List<TestBatch> one = testBatchMapper.getSome(140001, 150000);
        final int delete = testBatchMapper.deleteSome(140001, 150000);

        final LocalDateTime start = LocalDateTime.now();
        BatchProgram.apply(one, 800, list -> testBatchMapper.batchInsertTwo(list));
        final LocalDateTime end = LocalDateTime.now();
        System.out.println("批量insert10000条数据，使用的时间 ms : " + Duration.between(start, end).toMillis());
        final long millis = Duration.between(start, end).toMillis();
        stringBuffer.append(millis).append(",");
    }

    void testBatchInsertIntoFor900(StringBuffer stringBuffer) {
        final List<TestBatch> one = testBatchMapper.getSome(140001, 150000);
        final int delete = testBatchMapper.deleteSome(140001, 150000);

        final LocalDateTime start = LocalDateTime.now();
        BatchProgram.apply(one, 900, list -> testBatchMapper.batchInsertTwo(list));
        final LocalDateTime end = LocalDateTime.now();
        System.out.println("批量insert10000条数据，使用的时间 ms : " + Duration.between(start, end).toMillis());
        final long millis = Duration.between(start, end).toMillis();
        stringBuffer.append(millis).append(",");
    }

    void testBatchInsertIntoFor5(StringBuffer stringBuffer) {
        final List<TestBatch> one = testBatchMapper.getSome(140001, 150000);
        final int delete = testBatchMapper.deleteSome(140001, 150000);

        final LocalDateTime start = LocalDateTime.now();
        BatchProgram.apply(one, 5, list -> testBatchMapper.batchInsertTwo(list));
        final LocalDateTime end = LocalDateTime.now();
        System.out.println("批量insert10000条数据，使用的时间 ms : " + Duration.between(start, end).toMillis());
        final long millis = Duration.between(start, end).toMillis();
        stringBuffer.append(millis).append(",");
    }

    void testBatchInsertIntoFor10(StringBuffer stringBuffer) {
        final List<TestBatch> one = testBatchMapper.getSome(140001, 150000);
        final int delete = testBatchMapper.deleteSome(140001, 150000);

        final LocalDateTime start = LocalDateTime.now();
        BatchProgram.apply(one, 10, list -> testBatchMapper.batchInsertTwo(list));
        final LocalDateTime end = LocalDateTime.now();
        System.out.println("批量insert10000条数据，使用的时间 ms : " + Duration.between(start, end).toMillis());
        final long millis = Duration.between(start, end).toMillis();
        stringBuffer.append(millis).append(",");
    }

    void testBatchInsertIntoFor30(StringBuffer stringBuffer) {
        final List<TestBatch> one = testBatchMapper.getSome(140001, 150000);
        final int delete = testBatchMapper.deleteSome(140001, 150000);

        final LocalDateTime start = LocalDateTime.now();
        BatchProgram.apply(one, 30, list -> testBatchMapper.batchInsertTwo(list));
        final LocalDateTime end = LocalDateTime.now();
        System.out.println("批量insert10000条数据，使用的时间 ms : " + Duration.between(start, end).toMillis());
        final long millis = Duration.between(start, end).toMillis();
        stringBuffer.append(millis).append(",");
    }

    void testBatchInsertIntoFor50(StringBuffer stringBuffer) {
        final List<TestBatch> one = testBatchMapper.getSome(140001, 150000);
        final int delete = testBatchMapper.deleteSome(140001, 150000);

        final LocalDateTime start = LocalDateTime.now();
        BatchProgram.apply(one, 50, list -> testBatchMapper.batchInsertTwo(list));
        final LocalDateTime end = LocalDateTime.now();
        System.out.println("批量insert10000条数据，使用的时间 ms : " + Duration.between(start, end).toMillis());
        final long millis = Duration.between(start, end).toMillis();
        stringBuffer.append(millis).append(",");
    }

    void testBatchInsertIntoFor70(StringBuffer stringBuffer) {
        final List<TestBatch> one = testBatchMapper.getSome(140001, 150000);
        final int delete = testBatchMapper.deleteSome(140001, 150000);

        final LocalDateTime start = LocalDateTime.now();
        BatchProgram.apply(one, 70, list -> testBatchMapper.batchInsertTwo(list));
        final LocalDateTime end = LocalDateTime.now();
        System.out.println("批量insert10000条数据，使用的时间 ms : " + Duration.between(start, end).toMillis());
        final long millis = Duration.between(start, end).toMillis();
        stringBuffer.append(millis).append(",");
    }

    void testBatchInsertIntoFor85(StringBuffer stringBuffer) {
        final List<TestBatch> one = testBatchMapper.getSome(140001, 150000);
        final int delete = testBatchMapper.deleteSome(140001, 150000);

        final LocalDateTime start = LocalDateTime.now();
        BatchProgram.apply(one, 85, list -> testBatchMapper.batchInsertTwo(list));
        final LocalDateTime end = LocalDateTime.now();
        System.out.println("批量insert10000条数据，使用的时间 ms : " + Duration.between(start, end).toMillis());
        final long millis = Duration.between(start, end).toMillis();
        stringBuffer.append(millis).append(",");
    }
}