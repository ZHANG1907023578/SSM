package com.zking.ssm.personnel.collection;

import com.zking.ssm.personnel.model.Emp;
import com.zking.ssm.personnel.services.IEmpServices;
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
public class EmpCollection {

    @Autowired
    private IEmpServices iEmpServices;
    /**
     * 去员工页面
     * @return
     */
    @RequestMapping("/emp.sjsp")
    public String goEmp(){
        return "personnel/emp";
    }
    /**
     * 添加员工页面
     * @return
     */
    @RequestMapping("/addemp.sjsp")
    public String goaddEmp(){
        return "personnel/addemp";
    }

    /**
     * 删除部门信息
     * @param
     * @return
     */
    @RequestMapping("/delEmp")
    @ResponseBody
    public Map<String,Object> delEmp(Emp emp){
        Map<String,Object> map=new HashMap<>();

        int i = iEmpServices.delete(emp);
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
     * 添加员工
     * @param
     * @return
     */
    @RequestMapping("/addEmp")
    @ResponseBody
    public Map<String,Object> addEmp(Emp emp){
        System.out.println(emp);
        Map<String,Object> map=new HashMap<>();
        int i = 0;
        try {
            i = iEmpServices.insert(emp);
            if(i>0){
                map.put("success",true);
                map.put("message","添加成功");
            }else{
                map.put("success",false);
                map.put("message","添加失败");
            }
        } catch (Exception e) {
            map.put("success",false);
            map.put("message","登录名不能重复");
        }
        return map;
    }
    /**
     * 修改部门
     * @param
     * @return
     */
    @RequestMapping("/updataEmp")
    @ResponseBody
    public Map<String,Object> updateEmp(Emp emp){
        Map<String,Object> map=new HashMap<>();
        int i = 0;
        try {
            i = iEmpServices.update(emp);
            if(i>0){
                map.put("success",true);
                map.put("message","修改成功");
            }else{
                map.put("success",false);
                map.put("message","修改失败");
            }
        } catch (Exception e) {
            map.put("success",false);
            map.put("message","登录名不能重复");
        }
        return map;
    }


    /**
     * 员工信息
     * @param
     * @return
     */
    @RequestMapping("/queryEmpPager")
    @ResponseBody
    public Map<String,Object> queryDepPager(Emp emp, HttpServletRequest req){
        Map<String,Object> map=new HashMap<>();
        PageBean pageBeans=new PageBean();
        pageBeans.setRequest(req);
        List<Map<String, Object>> maps = iEmpServices.queryEmpPager(emp, pageBeans);
        map.put("code","0");
        map.put("data",maps);
        map.put("count",pageBeans.getTotal());
        return map;
    }


}
