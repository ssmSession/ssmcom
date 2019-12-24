package com.zking.ssm.mapper;


import com.zking.ssm.model.XReplyEntity;

import java.util.List;

public interface ReplyMapper {

    int insert(XReplyEntity record);

    List<XReplyEntity> queryReplyPager(XReplyEntity reply);

    List<XReplyEntity> queryReplyHPager(XReplyEntity reply);

    int updateReply(XReplyEntity reply);

    int deleteReply(XReplyEntity reply);
}
