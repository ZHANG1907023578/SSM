package com.zking.ssm.basics.collection;

import com.zking.ssm.basics.model.Goods;
import com.zking.ssm.basics.services.IGoodsServices;
import com.zking.ssm.repertory.services.IStortdetallServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GoodCollection {
    @Autowired
    private IGoodsServices iGoodsServices;

    @Autowired
    private IStortdetallServices iStortdetallServices;

    @RequestMapping("/goodsSelect")
    @ResponseBody
    public List<Goods> queryGoodsSelect(String gid){
        List<Goods> goods = iGoodsServices.queryGodsSelect();
        return goods;
    }
}
