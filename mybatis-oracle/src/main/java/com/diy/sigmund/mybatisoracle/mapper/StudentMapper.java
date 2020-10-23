package com.diy.sigmund.mybatisoracle.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.diy.sigmund.mybatisoracle.entity.Student;

@Component
public interface StudentMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> getStudents(@Param("startUserId") int startUserId, @Param("endUserId") int endUserId);

    int updateStudents(@Param("list") List<Student> list);

    int insertBySelectKey(Student record);
}