package com.zking.ssm.basics.mapper;

import com.zking.ssm.basics.model.Basdict;

import java.util.List;

public interface BasdictMapper {
    int deleteByPrimaryKey(String dictid);

    int insert(Basdict record);

    int insertSelective(Basdict record);

    Basdict selectByPrimaryKey(String dictid);

    int updateByPrimaryKeySelective(Basdict record);

    int updateByPrimaryKey(Basdict record);

    List<Basdict> querySelect(Basdict basdict);
}