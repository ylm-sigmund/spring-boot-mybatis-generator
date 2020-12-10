package com.diy.sigmund.mybatisoracle.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.diy.sigmund.mybatisoracle.entity.TestBatch;

/**
 * @author ylm-sigmund
 * @since 2020/12/7 21:51
 */
@Repository
public interface TestBatchMapper {
    List<TestBatch> selectByPrimaryKey(Integer userid);

    List<TestBatch> getSome(@Param("beginId") Integer beginId, @Param("endId") Integer endId);

    int deleteSome(@Param("beginId") Integer beginId, @Param("endId") Integer endId);

    int batchInsertOne(@Param("list") List<TestBatch> list);

    int batchInsertTwo(@Param("list") List<TestBatch> list);
}
