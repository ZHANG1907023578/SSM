package com.zking.ssm.repertory.mapper;

import com.zking.ssm.repertory.model.Storeoper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StoreoperMapper {
    int insert(Storeoper record);

    int insertSelective(Storeoper record);

    List<Map<String,Object>> queryKcmessPager(Storeoper storeoper);





}