package com.zking.ssm.personnel.mapper;

import com.zking.ssm.personnel.model.Dep;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepMapper {
    int insert(Dep record);

    int insertSelective(Dep record);

    List<Dep> queryDepPager(Dep dep);

    int update(Dep record);

    int delete(Dep record);

    List<Dep> bmSelect();
}