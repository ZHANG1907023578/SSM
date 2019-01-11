package com.zking.ssm.repertory.services.impl;

import com.zking.ssm.repertory.mapper.StoreoperMapper;
import com.zking.ssm.repertory.model.Storeoper;
import com.zking.ssm.repertory.services.IStoreoperServices;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StoreoperServicesImpl implements IStoreoperServices {

    @Autowired
    private StoreoperMapper storeoperMapper;

    @Override
    public int insert(Storeoper record) {
        return 0;
    }

    @Override
    public int insertSelective(Storeoper record) {
        return 0;
    }

    @Override
    public List<Map<String, Object>> queryKcmessPager(Storeoper storeoper, PageBean pageBean) {
        return storeoperMapper.queryKcmessPager(storeoper);
    }


}
