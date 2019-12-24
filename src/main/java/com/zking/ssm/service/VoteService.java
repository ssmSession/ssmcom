package com.zking.ssm.service;


import com.zking.ssm.model.XVoteEntity;

import java.util.List;

public interface VoteService {
    int insert(XVoteEntity record);

    List<XVoteEntity> queryVote(XVoteEntity vote);
}
