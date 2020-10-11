package com.diy.sigmund.mybatisoracle.util;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.diy.sigmund.mybatisoracle.entity.Student;
import com.diy.sigmund.mybatisoracle.mapper.StudentMapper;

/**
 * @author ylm-sigmund
 * @since 2020/10/11 20:46
 */
@SpringBootTest
class BatchProgramTest {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    void batchExec() {
        final List<Student> students = studentMapper.getStudents(1, 11);
        students.forEach(student -> student.setPhone(122L));
        // 批处理更新return的是一个负数，这个数值等于batchNum
         final int resultNum = BatchProgram.process(students, subList -> studentMapper.updateStudents(subList), 5);
         System.out.println(resultNum);
//         BatchProgram.accept(students, subList -> studentMapper.updateStudents(subList), 5);
//        final int applyNum = BatchProgram.apply(students, subList -> studentMapper.updateStudents(subList), 5);
//        System.out.println(applyNum);
    }
}