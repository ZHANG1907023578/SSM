package com.zking.ssm.repertory.services;

import com.zking.ssm.repertory.model.Storeoper;
import com.zking.ssm.util.PageBean;

import java.util.List;
import java.util.Map;

public interface IStoreoperServices {
    int insert(Storeoper record);

    int insertSelective(Storeoper record);

    List<Map<String,Object>> queryKcmessPager(Storeoper storeoper, PageBean pageBean);


}