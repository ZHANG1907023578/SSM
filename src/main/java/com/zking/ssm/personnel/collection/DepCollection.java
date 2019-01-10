package com.zking.ssm.personnel.collection;

import com.zking.ssm.personnel.model.Dep;
import com.zking.ssm.personnel.services.IDepServices;
import com.zking.ssm.util.Page;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DepCollection {

    @Autowired
    private IDepServices iDepServices;

    /**
     * 部门信息
     * @param dep
     * @return
     */
    @RequestMapping("/queryDepPager")
    @ResponseBody
    public Map<String,Object> queryDepPager(Dep dep,HttpServletRequest req){
        Map<String,Object> map=new HashMap<>();
        PageBean pageBeans=new PageBean();
        pageBeans.setRequest(req);
        List<Dep> deps = iDepServices.queryDepPager(dep,pageBeans);
        map.put("code","0");
        map.put("data",deps);
        map.put("count",pageBeans.getTotal());
        return map;
    }

    /**
     * 添加部门信息页面
     * @return
     */
    @RequestMapping("/adddep.sjsp")
    public String toaddjsp(){
        return "personnel/adddep";
    }


    /**
     * 删除部门信息
     * @param dep
     * @return
     */
    @RequestMapping("/delDep")
    @ResponseBody
    public Map<String,Object> delDep(Dep dep){
        Map<String,Object> map=new HashMap<>();

            int i = iDepServices.delete(dep);
            if(i>0){
                map.put("success",true);
                map.put("message","删除成功");
            }else {
                map.put("success", false);
                map.put("message", "删除失败");
            }
        return map;
    }

    /**
     * 添加部门
     * @param dep
     * @return
     */
    @RequestMapping("/addDep")
    @ResponseBody
    public Map<String,Object> add(Dep dep){
        Map<String,Object> map=new HashMap<>();
        int i = 0;
        try {
            i = iDepServices.insert(dep);
            if(i>0){
                map.put("success",true);
                map.put("message","添加成功");
            }else{
                map.put("success",false);
                map.put("message","添加失败");
            }
        } catch (Exception e) {
            map.put("success",false);
            map.put("message","不能添加重复部门");
        }
        return map;
    }

    /**
     * 修改部门
     * @param dep
     * @return
     */
  @RequestMapping("/updataDep")
    @ResponseBody
    public Map<String,Object> update(Dep dep){
        Map<String,Object> map=new HashMap<>();
        int i = 0;
        try {
            i = iDepServices.update(dep);
            if(i>0){
                map.put("success",true);
                map.put("message","修改成功");
            }else{
                map.put("success",false);
                map.put("message","修改失败");
            }
        } catch (Exception e) {
            map.put("success",false);
            map.put("message","此部门已存在");
        }
        return map;
    }

    /**
     * 部门下拉查询
     * @return
     */
    @RequestMapping("/bMSelect")
    @ResponseBody
    public List<Dep> bMSelect(){
        List<Dep> deps = iDepServices.bmSelect();
        return deps;
    }

}
