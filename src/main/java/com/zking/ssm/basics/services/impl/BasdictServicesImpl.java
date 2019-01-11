package com.zking.ssm.basics.services.impl;

import com.zking.ssm.basics.mapper.BasdictMapper;
import com.zking.ssm.basics.model.Basdict;
import com.zking.ssm.basics.services.IBasdictServices;
import org.omg.CORBA.BAD_CONTEXT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasdictServicesImpl implements IBasdictServices {
   @Autowired
    private BasdictMapper basdictMapper;

    @Override
    public List<Basdict> querySelect(Basdict basdict) {
        return basdictMapper.querySelect(basdict);
    }
}
