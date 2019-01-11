package com.zking.ssm.util;

import com.zking.ssm.personnel.model.Emp;
import com.zking.ssm.personnel.services.IEmpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Controller
public class Login {

    @Autowired
    private IEmpServices iEmpServices;


    @RequestMapping("/loginUser")
    @ResponseBody
    public Map<String,Object> loginUser(Emp emp, HttpSession session) throws ParseException {
        Map<String,Object> map=new HashMap<>();
        Emp emp1 = iEmpServices.loginUser(emp);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(null!=emp1) {
            map.put("success", true);
            map.put("message","登录成功");
            Date date = sdf.parse(emp1.getBirthday().toString());      //将从数据库读出来的 timestamp 类型的时间转换为java的Date类型
            String s = sdf.format(date);
            emp1.setTimestamp(s);
            session.setAttribute("User",emp1);
        }else{
            map.put("success", false);
            map.put("message","账号密码错误");
        }
        return map;
    }

    @RequestMapping("/index.shtml")
    public String toindex(){
        return "index";
    }


    @RequestMapping("/updatOurUser")
    @ResponseBody
    public Map<String,Object> updateEmp(Emp emp,HttpSession session){
        Map<String,Object> map=new HashMap<>();
        int i = 0;
        Emp emp1=(Emp) session.getAttribute("User");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(emp.getUsername().equals(emp1.getUsername()))
            emp.setUsername("");
        emp.setEid(emp1.getEid());
        try {
            System.out.println(emp);
            i = iEmpServices.update(emp);
            if(i>=0){
                map.put("success",true);
                map.put("message","修改成功");
                Emp emp2 = iEmpServices.loginUser(emp1);
                Date date = sdf.parse(emp2.getBirthday().toString());      //将从数据库读出来的 timestamp 类型的时间转换为java的Date类型
                String s = sdf.format(date);
                emp2.setTimestamp(s);
                session.setAttribute("User",emp2);
            }else{
                map.put("success",false);
                map.put("message","修改失败");
            }
        } catch (Exception e) {
            map.put("success",false);
            map.put("message","此登录名已有人注册");
        }
        return map;
    }



}
