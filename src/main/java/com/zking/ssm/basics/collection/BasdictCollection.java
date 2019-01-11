package com.zking.ssm.basics.collection;

import com.zking.ssm.basics.model.Basdict;
import com.zking.ssm.basics.services.IBasdictServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BasdictCollection {

    @Autowired
private IBasdictServices iBasdictServices;



    @RequestMapping("/queryBasSelect")
    @ResponseBody
    public List<Basdict> querySelect(Basdict basdict){
        System.out.println(basdict);
        List<Basdict> basdicts = iBasdictServices.querySelect(basdict);
        System.out.println(basdicts);
        return basdicts;
    }
}
