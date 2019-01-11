package com.zking.ssm.repertory.services;

import com.zking.ssm.repertory.model.Stortdetall;
import com.zking.ssm.util.PageBean;

import java.util.List;
import java.util.Map;

public interface IStortdetallServices {
    int insert(Stortdetall record);

    int insertSelective(Stortdetall record);

    List<Map<String,Object>> queryStortDetallPager(Stortdetall stortdetall, PageBean pageBean);

    List<String> queryCkSp(String gid);
}