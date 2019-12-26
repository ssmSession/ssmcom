package com.zking.ssm.service;

import com.zking.ssm.model.XMeeting;
import com.zking.ssm.util.PageBean;

import java.util.List;

public interface IXmeetingService {

    /**
     * 查询所有会议
     * @param xMeeting
     * @param pageBean
     * @return
     */
    List<XMeeting> getAllMeetingByType(XMeeting xMeeting, PageBean pageBean);

    /**
     * 报名
     * @param xMeeting
     * @return
     */
    int applyName(XMeeting xMeeting);

    /**
     * 删除会议
     * @param xMeeting
     * @return
     */

    int delMeeting(XMeeting xMeeting);

    /**
     * 添加会议
     * @param xMeeting
     * @return
     */
    int addMeeting(XMeeting xMeeting);
}
