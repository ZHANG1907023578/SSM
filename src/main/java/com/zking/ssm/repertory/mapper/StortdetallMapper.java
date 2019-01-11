package com.zking.ssm.repertory.mapper;

import com.zking.ssm.repertory.model.Stortdetall;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StortdetallMapper {
    int insert(Stortdetall record);

    int insertSelective(Stortdetall record);

    List<Map<String,Object>> queryStortDetallPager(Stortdetall stortdetall);

List<String> queryCkSp(String gid);
}