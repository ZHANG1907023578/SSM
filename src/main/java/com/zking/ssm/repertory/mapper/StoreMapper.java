package com.zking.ssm.repertory.mapper;

import com.zking.ssm.repertory.model.Store;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StoreMapper {
    int insert(Store record);

    int insertSelective(Store record);

    List<Map<String,Object>> queryStorePager(Store store);

    List<Store> queryCk();
}