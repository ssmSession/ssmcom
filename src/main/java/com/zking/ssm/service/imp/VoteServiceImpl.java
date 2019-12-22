package com.zking.ssm.service.imp;

import com.zking.ssm.model.XVoteEntity;
import com.zking.ssm.service.VoteService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service
public class VoteServiceImpl implements VoteService {
    @Resource
    private  VoteService voteService;

    @Override
    public int insert(XVoteEntity record) {
        return voteService.insert(record);
    }

    @Override
    public List<XVoteEntity> queryVote(XVoteEntity vote) {
        return voteService.queryVote(vote);
    }
}
