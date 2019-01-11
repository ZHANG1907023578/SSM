package com.zking.ssm.repertory.services.impl;

import com.zking.ssm.repertory.mapper.StortdetallMapper;
import com.zking.ssm.repertory.model.Stortdetall;
import com.zking.ssm.repertory.services.IStortdetallServices;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StortdetallServicesImpl implements IStortdetallServices {

    @Autowired
    private StortdetallMapper stortdetallMapper;

    @Override
    public int insert(Stortdetall record) {
        return stortdetallMapper.insert(record);
    }

    @Override
    public int insertSelective(Stortdetall record) {
        return stortdetallMapper.insertSelective(record);
    }

    @Override
    public List<Map<String, Object>> queryStortDetallPager(Stortdetall stortdetall, PageBean pageBean) {
        return stortdetallMapper.queryStortDetallPager(stortdetall);
    }

    @Override
    public List<String> queryCkSp(String gid) {
        return stortdetallMapper.queryCkSp(gid);
    }


}
