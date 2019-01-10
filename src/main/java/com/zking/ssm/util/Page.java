package com.zking.ssm.util;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class Page {

    @Around("execution(* *..*Services.*Pager(..))")
    public Object init(ProceedingJoinPoint point) throws Throwable {
        Object[] args = point.getArgs();
        PageBean pageBean=null;
        for (Object arg : args) {
            if(arg instanceof  PageBean){
        pageBean= (PageBean) arg;
            break;
            }
        }
        if(null!=pageBean&&pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        System.out.println(pageBean.getTotal()+"pageBean总记录数");
        Object o = point.proceed(args);
        if(null!=pageBean&&pageBean.isPagination()){
            List list= (List) o;
            PageInfo pageInfo=new PageInfo(list);
            System.out.println("当前页码"+pageInfo.getPageNum());
            System.out.println("每页多少"+pageInfo.getPageSize());
            System.out.println("总记录数"+pageInfo.getTotal());
            pageBean.setTotal((int) pageInfo.getTotal());
            }
        return o;
    }
}
