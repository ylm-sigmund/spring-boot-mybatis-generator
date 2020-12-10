package com.diy.sigmund.mybatisoracle.mapper;

import com.diy.sigmund.mybatisoracle.entity.Student;
import com.diy.sigmund.mybatisoracle.entity.Teacher;
import org.springframework.stereotype.Component;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    List<Student> getWebStudent();

}