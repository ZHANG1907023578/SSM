package com.zking.ssm.repertory.services.impl;

import com.zking.ssm.repertory.mapper.StoreMapper;
import com.zking.ssm.repertory.model.Store;
import com.zking.ssm.repertory.services.IStoreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StoreServicesImpl implements IStoreServices {

    @Autowired
    private StoreMapper storeMapper;

    @Override
    public int insert(Store record) {
        return storeMapper.insert(record);
    }

    @Override
    public int insertSelective(Store record) {
        return storeMapper.insertSelective(record);
    }

    @Override
    public List<Map<String, Object>> queryStorePager(Store store) {
        return storeMapper.queryStorePager(store);
    }

    @Override
    public List<Store> queryCk() {
        return storeMapper.queryCk();
    }
}
