package com.zking.ssm.service.imp;

import com.zking.ssm.mapper.ReplyMapper;
import com.zking.ssm.model.XReplyEntity;
import com.zking.ssm.service.ReplyService;
import com.zking.ssm.util.PageBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service
public class ReplyServiceImpl implements ReplyService {

    @Resource
    private ReplyMapper replyMapper;

    @Override
    public int insert(XReplyEntity record) {

        return replyMapper.insert(record);
    }

    @Override
    public List<XReplyEntity> queryReplyPager(XReplyEntity reply, PageBean pageBean) {
        return replyMapper.queryReplyPager(reply);
    }

    @Override
    public List<XReplyEntity> queryReplyHPager(XReplyEntity reply, PageBean pageBean) {
        return replyMapper.queryReplyHPager(reply);
    }

    @Override
    public int updateReply(XReplyEntity reply) {
        return replyMapper.updateReply(reply) ;
    }

    @Override
    public int deleteReply(XReplyEntity reply) {

        return replyMapper.deleteReply(reply);
    }
}
