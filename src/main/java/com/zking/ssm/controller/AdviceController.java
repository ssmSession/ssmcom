package com.zking.ssm.controller;

import com.zking.ssm.model.XAdvice;
import com.zking.ssm.model.XDict;
import com.zking.ssm.model.XMeeting;
import com.zking.ssm.service.IXadivesService;
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
@RequestMapping("/advice")
public class AdviceController {

    @Resource
    private IXadivesService xadivesService;

    @RequestMapping("/reloadXadvice")
    public Object reloadAdvice(XAdvice xAdvice, XMeeting xMeeting, XDict xDict, HttpServletRequest request, PageBean pageBean){
        pageBean.setRequest(request);
        Map<String,Object> map=new HashMap<>();
        map.put("meemc",xMeeting.getMeemc());
        map.put("dicname",xDict.getDicname());
        DataProtocol data=new DataProtocol();
        List<XAdvice> xAdvices = xadivesService.selectAdvice(map, pageBean);
        data.setCount(pageBean.getTotal());
        data.setCode(0);
        data.setData(xAdvices);
        return data;
    }

    @RequestMapping("/delAdvice")
    public Object delAdvice(XAdvice xAdvice){
        int i = xadivesService.delAdvice(xAdvice);
        DataProtocol data=new DataProtocol();
        data.setCode(DataProtocol.SUCCESS);
        data.setData(i);
        return data;
    }

    @RequestMapping("/updateAdvice")
    public Object updateAdvice(XAdvice xAdvice){
        int i = xadivesService.updateAdvice(xAdvice);
        DataProtocol data=new DataProtocol();
        data.setCode(DataProtocol.SUCCESS);
        data.setData(i);
        return data;
    }

}
