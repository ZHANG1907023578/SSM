package com.zking.ssm.repertory.collection;

import com.zking.ssm.repertory.model.Store;
import com.zking.ssm.repertory.model.Stortdetall;
import com.zking.ssm.repertory.services.IStoreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StoreCollection {
    @Autowired
private IStoreServices iStoreServices;


    /**
     * 部门下拉查询
     * @return
     */
    @RequestMapping("/CkQuery")
    @ResponseBody
    public List<Store> bMSelect(){
        List<Store> stores = iStoreServices.queryCk();
        return stores;
    }
}
