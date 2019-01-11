package com.zking.ssm.repertory.services;

import com.zking.ssm.repertory.model.Store;

import java.util.List;
import java.util.Map;

public interface IStoreServices {
    int insert(Store record);

    int insertSelective(Store record);

    List<Map<String,Object>> queryStorePager(Store store);

    List<Store> queryCk();
}