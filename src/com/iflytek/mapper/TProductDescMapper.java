package com.iflytek.mapper;

import com.iflytek.entity.TProductDesc;
import com.iflytek.entity.TProductDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProductDescMapper {
    int countByExample(TProductDescExample example);

    int deleteByExample(TProductDescExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TProductDesc record);

    int insertSelective(TProductDesc record);

    List<TProductDesc> selectByExampleWithBLOBs(TProductDescExample example);

    List<TProductDesc> selectByExample(TProductDescExample example);

    TProductDesc selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TProductDesc record, @Param("example") TProductDescExample example);

    int updateByExampleWithBLOBs(@Param("record") TProductDesc record, @Param("example") TProductDescExample example);

    int updateByExample(@Param("record") TProductDesc record, @Param("example") TProductDescExample example);

    int updateByPrimaryKeySelective(TProductDesc record);

    int updateByPrimaryKeyWithBLOBs(TProductDesc record);

    int updateByPrimaryKey(TProductDesc record);
}