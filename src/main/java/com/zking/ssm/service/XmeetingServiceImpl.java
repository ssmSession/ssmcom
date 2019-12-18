package com.zking.ssm.service;

import com.zking.ssm.mapper.XmeetingMapper;
import com.zking.ssm.model.XMeeting;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class XmeetingServiceImpl implements IXmeetingService {

    @Resource
    private XmeetingMapper xmeetingMapper;

    @Override
    public List<XMeeting> getAllMeetingByType(XMeeting xMeeting){
        return  xmeetingMapper.getAllMeetingByType(xMeeting);
    }

}
