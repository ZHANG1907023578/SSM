package com.zking.ssm.personnel.services;

import com.zking.ssm.personnel.model.Dep;
import com.zking.ssm.util.PageBean;

import java.util.List;

public interface IDepServices {
    int insert(Dep record);

    List<Dep> queryDepPager(Dep dep, PageBean pageBean);

    int update(Dep record);
    int delete(Dep record);

    List<Dep> bmSelect();
}