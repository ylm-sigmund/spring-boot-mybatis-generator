package com.diy.sigmund.mybatisoracle;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.diy.sigmund.mybatisoracle.entity.Student;
import com.diy.sigmund.mybatisoracle.entity.Teacher;
import com.diy.sigmund.mybatisoracle.mapper.StudentMapper;
import com.diy.sigmund.mybatisoracle.mapper.TeacherMapper;

@SpringBootTest
class MybatisOracleApplicationTests {

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

}
