package com.zking.ssm.permissions.mapper;

import com.zking.ssm.permissions.model.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuMapper {
    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> queryIndexMenu();
}