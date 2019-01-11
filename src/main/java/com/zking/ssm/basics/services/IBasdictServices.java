package com.zking.ssm.basics.services;

import com.zking.ssm.basics.model.Basdict;

import java.util.List;


public interface IBasdictServices {


    List<Basdict> querySelect(Basdict basdict);
}