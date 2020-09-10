package com.diy.sigmund.mybatismysql.mapper;

import com.diy.sigmund.mybatismysql.entity.Admire;
import org.springframework.stereotype.Component;

@Component
public interface AdmireMapper {
    int deleteByPrimaryKey(Integer admireid);

    int insert(Admire record);

    int insertSelective(Admire record);

    Admire selectByPrimaryKey(Integer admireid);

    int updateByPrimaryKeySelective(Admire record);

    int updateByPrimaryKey(Admire record);
}