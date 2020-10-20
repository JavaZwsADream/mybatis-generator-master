package com.iflytek.mapper;

import com.iflytek.entity.TProductType;
import com.iflytek.entity.TProductTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProductTypeMapper {
    int countByExample(TProductTypeExample example);

    int deleteByExample(TProductTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TProductType record);

    int insertSelective(TProductType record);

    List<TProductType> selectByExample(TProductTypeExample example);

    TProductType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TProductType record, @Param("example") TProductTypeExample example);

    int updateByExample(@Param("record") TProductType record, @Param("example") TProductTypeExample example);

    int updateByPrimaryKeySelective(TProductType record);

    int updateByPrimaryKey(TProductType record);
}