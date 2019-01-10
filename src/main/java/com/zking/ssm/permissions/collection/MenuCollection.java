package com.zking.ssm.permissions.collection;

import com.zking.ssm.permissions.model.Menu;
import com.zking.ssm.permissions.services.IMenuServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MenuCollection {

    @Autowired
    private IMenuServices iMenuServices;

    @RequestMapping("/dep.sjsp")
    public String toindex(){
        return "personnel/dep";
    }

    @RequestMapping("/leftMenu")
    @ResponseBody
    public List<Map<String,Object>> leftMenu(){
        List<Menu> menus = iMenuServices.queryIndexMenu();
//        System.out.println(menus);
        List<Map<String, Object>> children = children(menus, "0");
        return children;
    }

    public List<Map<String, Object>> children(List<Menu> assetType,String st){
        if(st.equals(null)||0==assetType.size()||null==assetType)
            return null;
        List<Map<String, Object>> list=new ArrayList<>();
        Map<String, Object> map;
        for (Menu maps : assetType) {
            map=new HashMap<>();
                if(maps.getPid().equals(st)) {
                    map.put("name", maps.getMenuname());
                    map.put("id", maps.getMenuid());
                    if(null!=maps.getUrl()&&!"".equals(maps.getUrl())) {
                        map.put("moduleurl", maps.getUrl());
                    }
                    List<Map<String, Object>> list2 = children(assetType, maps.getMenuid());
                    if(0!=list2.size()&&null!=list2) {
                        map.put("children", list2);
                    }
                    list.add(map);
                }
        }
        return list;
    }



}
