package com.zking.ssm.service;


import com.zking.ssm.model.XReplyEntity;
import com.zking.ssm.util.PageBean;

import java.util.List;

public interface ReplyService {
    int insert(XReplyEntity record);

    List<XReplyEntity> queryReplyPager(XReplyEntity reply, PageBean pageBean);

    List<XReplyEntity> queryReplyHPager(XReplyEntity reply, PageBean pageBean);

    int updateReply(XReplyEntity reply);

    int deleteReply(XReplyEntity reply);

}
