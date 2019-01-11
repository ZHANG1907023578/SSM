package com.zking.ssm.basics.mapper;

import com.zking.ssm.basics.model.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsMapper {
    int insert(Goods record);

    int insertSelective(Goods record);


    List<Goods> queryGodsSelect();
}