package com.zking.ssm.personnel.services.impl;

import com.zking.ssm.personnel.mapper.DepMapper;
import com.zking.ssm.personnel.model.Dep;
import com.zking.ssm.personnel.services.IDepServices;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepServicesImpl implements IDepServices {
    @Autowired
    private DepMapper depMapper;

    @Override
    public int insert(Dep record) {
        return depMapper.insert(record);
    }

    @Override
    public List<Dep> queryDepPager(Dep dep, PageBean pageBean) {
        return depMapper.queryDepPager(dep);
    }

    @Override
    public int update(Dep record) {
        return depMapper.update(record);
    }

    @Override
    public int delete(Dep record) {
        return depMapper.delete(record);
    }

    @Override
    public List<Dep> bmSelect() {
        return depMapper.bmSelect();
    }
}
