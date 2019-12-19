package com.zking.ssm.service;

import com.zking.ssm.model.XMeeting;

import java.util.List;

public interface IXmeetingService {

    List<XMeeting> getAllMeetingByType(XMeeting xMeeting);
}
