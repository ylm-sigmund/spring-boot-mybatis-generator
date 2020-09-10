package com.diy.sigmund.mybatisoracle.mapper;

import com.diy.sigmund.mybatisoracle.entity.Student;
import org.springframework.stereotype.Component;

@Component
public interface StudentMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}