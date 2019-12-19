package com.zking.ssm.mapper;

import com.zking.ssm.model.XMeeting;

import java.util.List;

public interface XmeetingMapper {

    /**
     * 根据主题，层次，承办者查询所有会议活动
     * @param xMeeting
     * @return
     */
    List<XMeeting> getAllMeetingByType(XMeeting xMeeting);
}
