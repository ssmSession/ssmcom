package com.zking.ssm.controller;

import com.zking.ssm.model.XMeeting;
import com.zking.ssm.service.IXmeetingService;
import com.zking.ssm.util.DataProtocol;
import com.zking.ssm.util.PageBean;
import org.apache.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/meet")
public class MeetingController {

    @Resource
    private IXmeetingService xmeetingService;

    @RequestMapping("/loadMeet")
    public Object loadMeeting(HttpServletRequest  request, XMeeting xMeeting, PageBean pageBean,Integer limit){
        pageBean.setRequest(request);
        pageBean.setRows(limit);
        List<XMeeting> list = xmeetingService.getAllMeetingByType(xMeeting,pageBean);
        DataProtocol data=new DataProtocol();
        data.setCode(0);
        data.setCount(pageBean.getTotal());
        data.setData(list);
        return data;
    }

    @RequestMapping("/apply")
    public Object applayName(XMeeting xMeeting){
        int i = xmeetingService.applyName(xMeeting);
        DataProtocol data=new DataProtocol();
        data.setCode(i);
        return data;
    }

    @RequestMapping("/delMeeting")
    public Object delMeeting(XMeeting xMeeting){
        DataProtocol data=new DataProtocol();
        int i = xmeetingService.delMeeting(xMeeting);
        data.setCode(i);
        return  data;
    }

    @RequestMapping("/addMeeting")
    public Object addMeeting(XMeeting xMeeting){
        DataProtocol data=new DataProtocol();
        int i = xmeetingService.addMeeting(xMeeting);
        data.setCode(i);
        return  data;
    }



}
