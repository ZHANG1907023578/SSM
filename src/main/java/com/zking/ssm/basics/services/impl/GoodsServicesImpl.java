package com.zking.ssm.basics.services.impl;

import com.zking.ssm.basics.mapper.GoodsMapper;
import com.zking.ssm.basics.model.Goods;
import com.zking.ssm.basics.services.IGoodsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServicesImpl implements IGoodsServices {

    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public int insert(Goods record) {
        return goodsMapper.insert(record);
    }

    @Override
    public int insertSelective(Goods record) {
        return goodsMapper.insertSelective(record);
    }

    @Override
    public List<Goods> queryGodsSelect() {
        return goodsMapper.queryGodsSelect();
    }


}
