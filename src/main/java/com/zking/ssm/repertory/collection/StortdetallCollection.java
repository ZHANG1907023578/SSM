package com.zking.ssm.repertory.collection;

import com.zking.ssm.personnel.model.Dep;
import com.zking.ssm.repertory.model.Stortdetall;
import com.zking.ssm.repertory.services.IStortdetallServices;
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
public class StortdetallCollection {

    @Autowired
    private IStortdetallServices iStortdetallServices;

    /**
     * 库存页面
     * @return
     */
    @RequestMapping("/storedetail.sjsp")
    public String toKC(){
        return "repertory/storedetail";
    }

    /**
     * 库存分页
     * @param stortdetall
     * @param req
     * @return
     */
    @RequestMapping("/queryStoredetail")
    @ResponseBody
    public Map<String,Object> queryDepPager(Stortdetall stortdetall, HttpServletRequest req){
        Map<String,Object> map=new HashMap<>();
        PageBean pageBeans=new PageBean();
        pageBeans.setRequest(req);
        List<Map<String, Object>> maps = iStortdetallServices.queryStortDetallPager(stortdetall, pageBeans);
        map.put("code","0");
        map.put("data",maps);
        map.put("count",pageBeans.getTotal());
        return map;
    }



}


