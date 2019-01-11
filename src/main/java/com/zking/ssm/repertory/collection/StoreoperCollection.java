package com.zking.ssm.repertory.collection;

import com.zking.ssm.repertory.model.Storeoper;
import com.zking.ssm.repertory.services.IStoreoperServices;
import com.zking.ssm.util.Page;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StoreoperCollection {

    @Autowired
    private IStoreoperServices iStoreoperServices;

    @RequestMapping("/storeoper.sjsp")
    public String tomess(){

        return "repertory/storeoper";
    }

    /**
     * 库存详细
     * @param storeoper
     * @param request
     * @return
     */
    @RequestMapping("/queryStoreopermess")
    @ResponseBody
    public Map<String,Object> queryStoreopermess(Storeoper storeoper, HttpServletRequest request){
       Map<String,Object> map=new HashMap<>();
        PageBean pageBean=new PageBean();
        pageBean.setRequest(request);
        List<Map<String, Object>> maps = iStoreoperServices.queryKcmessPager(storeoper, pageBean);
        map.put("count",pageBean.getTotal());
        map.put("code","0");
        map.put("data",maps);
        return map;
    }

    @RequestMapping("/storealert.sjsp")
    public String tostoreYj(){

        return "repertory/storealert";
    }




}
