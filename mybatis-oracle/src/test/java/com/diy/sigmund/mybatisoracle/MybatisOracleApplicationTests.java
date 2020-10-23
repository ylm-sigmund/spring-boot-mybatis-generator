package com.diy.sigmund.mybatisoracle;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.diy.sigmund.mybatisoracle.entity.Student;
import com.diy.sigmund.mybatisoracle.entity.Teacher;
import com.diy.sigmund.mybatisoracle.mapper.StudentMapper;
import com.diy.sigmund.mybatisoracle.mapper.TeacherMapper;

@SpringBootTest
class MybatisOracleApplicationTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(MybatisOracleApplicationTests.class);

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private TeacherMapper teacherMapper;

    @Test
    void contextLoads() {
        Student student = studentMapper.selectByPrimaryKey(1001);
        System.out.println(Optional.ofNullable(student).map(Student::getPhone).orElse(1001L));
        Teacher teacher = teacherMapper.selectByPrimaryKey(1002);
        System.out.println(Optional.ofNullable(teacher).map(Teacher::getPhone).orElse(1002L));

        // 测试mybatis-config配置全局变量
        List<Student> webStudents = teacherMapper.getWebStudent();
        System.out.println(Objects.requireNonNull(webStudents.stream().findAny().orElse(null)).toString());
    }

    /**
     * 测试 selectKey 标签
     */
    @Test
    void testSelectKey() {
        Student student = studentMapper.selectByPrimaryKey(1001);
        student.setUserid(null);
        final int i = studentMapper.insertBySelectKey(student);
        // 获取当前对象的主键userid
        LOGGER.info("当前对象的主键 {}，当前对象 {}", student.getUserid(), student.toString());
    }
}
