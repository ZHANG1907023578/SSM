package com.zking.ssm.personnel.services;

import com.zking.ssm.personnel.model.Emp;
import com.zking.ssm.util.PageBean;

import java.util.List;
import java.util.Map;

public interface IEmpServices {
    int insert(Emp record);

    int insertSelective(Emp record);

    int update(Emp emp);

    int delete(Emp emp);

    List<Map<String,Object>> queryEmpPager(Emp emp, PageBean pageBean);

}