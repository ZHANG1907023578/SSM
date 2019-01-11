package com.zking.ssm.personnel.mapper;

import com.zking.ssm.personnel.model.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface EmpMapper {
    int insert(Emp record);

    int insertSelective(Emp record);

    int update(Emp emp);

    int delete(Emp emp);

    List<Map<String,Object>> queryEmpPager(Emp emp);

    List<Emp> querySelect();

    Emp loginUser(Emp emp);

    int UpdateMm(Emp emp);

}