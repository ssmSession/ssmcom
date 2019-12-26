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

    /**
     * 对会议进行报名
     * @param xMeeting
     * @return
     */
    int applyName(XMeeting xMeeting);

    /**
     * 删除会议
     * @param xMeeting
     * @return
     */
    int delMeet(XMeeting xMeeting);

    /**
     * 添加会议
     * @param xMeeting
     * @return
     */
    int addMeeting(XMeeting xMeeting);
}
