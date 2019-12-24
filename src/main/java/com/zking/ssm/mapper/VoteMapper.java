package com.zking.ssm.mapper;


import com.zking.ssm.model.XVoteEntity;

import java.util.List;

public interface VoteMapper {

    /**
     * 投票
     * @param vote
     * @return
     */
    int insert(XVoteEntity vote);

    /**
     * 查询投票信息
     * @param vote
     * @return
     */
    List<XVoteEntity> queryVote(XVoteEntity vote);
}
