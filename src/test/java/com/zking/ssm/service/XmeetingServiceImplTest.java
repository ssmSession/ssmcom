package com.zking.ssm.service;

import com.zking.ssm.model.XMeeting;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

public class XmeetingServiceImplTest extends  BaseTest{

    @Resource
    private IXmeetingService xmeetingService;

    @Test
    public void getAllMeetingByType() {
        XMeeting xm=new XMeeting();
        xm.setMeezt("社区");
        List<XMeeting> list = xmeetingService.getAllMeetingByType(xm);
        for(XMeeting x:list){
            System.out.println(x);
        }
    }
}