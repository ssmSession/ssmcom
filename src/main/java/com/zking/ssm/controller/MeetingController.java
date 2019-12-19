package com.zking.ssm.controller;

import com.zking.ssm.model.XMeeting;
import com.zking.ssm.service.IXmeetingService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MeetingController {

    @Resource
    private IXmeetingService xmeetingService;

    public Object loadMeeting(XMeeting xMeeting){
        List<XMeeting> list = xmeetingService.getAllMeetingByType(xMeeting);
        DataProtocol data=new DataProtocol();
        data.setCode(DataProtocol.SUCCESS);
        data.setData(list);

        return data;
    }

}
