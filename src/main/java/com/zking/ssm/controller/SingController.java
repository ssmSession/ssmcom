package com.zking.ssm.controller;

import com.github.pagehelper.Page;
import com.zking.ssm.model.XSing;
import com.zking.ssm.model.XUser;
import com.zking.ssm.service.IXsingService;
import com.zking.ssm.util.DataProtocol;
import com.zking.ssm.util.PageBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sing")
public class SingController {

    @Resource
    private IXsingService xsingService;

    @RequestMapping("/loadSing")
    public Object loadSing(XSing xSing, XUser xUser, PageBean pageBean, HttpServletRequest request){
        Map<String,Object> map=new HashMap<>();
        pageBean.setRequest(request);
        map.put("singkqqk",xSing.getSingkqqk());
        map.put("singwyzh",xSing.getSingwyzh());
        map.put("username",xUser.getUsername());
        List<XSing> list = xsingService.getUserAndSing(map, pageBean);
        DataProtocol data=new DataProtocol();
        data.setCode(0);
        data.setCount(pageBean.getTotal());
        data.setData(list);
        return data;
    }


}
