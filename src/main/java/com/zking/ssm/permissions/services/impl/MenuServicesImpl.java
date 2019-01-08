package com.zking.ssm.permissions.services.impl;

import com.zking.ssm.permissions.mapper.MenuMapper;
import com.zking.ssm.permissions.model.Menu;
import com.zking.ssm.permissions.services.IMenuServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuServicesImpl implements IMenuServices {

    @Autowired
    private MenuMapper menuMapper;
    @Override
    public List<Menu> queryIndexMenu() {
        return menuMapper.queryIndexMenu();
    }
}
