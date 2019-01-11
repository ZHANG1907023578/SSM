package com.zking.ssm.personnel.services.impl;

import com.zking.ssm.personnel.mapper.EmpMapper;
import com.zking.ssm.personnel.model.Emp;
import com.zking.ssm.personnel.services.IEmpServices;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmpServicesImpl implements IEmpServices {

    @Autowired
    private EmpMapper empMapper;
    @Override
    public int insert(Emp record) {
        return empMapper.insert(record);
    }

    @Override
    public int insertSelective(Emp record) {
        return 0;
    }

    @Override
    public int update(Emp emp) {
        return empMapper.update(emp);
    }

    @Override
    public int delete(Emp emp) {
        return empMapper.delete(emp);
    }

    @Override
    public List<Map<String, Object>> queryEmpPager(Emp emp, PageBean pageBean) {
        return empMapper.queryEmpPager(emp);
    }

    @Override
    public List<Emp> querySelect() {
        return empMapper.querySelect();
    }

    @Override
    public Emp loginUser(Emp emp) {
        return empMapper.loginUser(emp);
    }

    @Override
    public int UpdateMm(Emp emp) {
        return empMapper.UpdateMm(emp);
    }
}
