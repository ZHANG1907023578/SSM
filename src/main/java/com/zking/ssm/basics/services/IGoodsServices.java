package com.zking.ssm.basics.services;

import com.zking.ssm.basics.model.Goods;

import java.util.List;

public interface IGoodsServices {
    int insert(Goods record);

    int insertSelective(Goods record);


    List<Goods> queryGodsSelect();
}