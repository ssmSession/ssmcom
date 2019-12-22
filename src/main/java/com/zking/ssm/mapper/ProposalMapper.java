package com.zking.ssm.mapper;

import com.zking.ssm.model.XProposal;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: w541
 * Date: 2019/12/18
 * Time: 14:33
 */


public interface ProposalMapper {

    /**
     * 添加提案
     * @param record
     * @return
     */
    int  insert(XProposal record);


    /**
     * 提案号查询
     * @param proposal
     * @return
     */
    List<XProposal> queryProposal(XProposal proposal);

    /**
     * 届次查询
     * @param proposal
     * @return
     */
    List<XProposal> queryPeriod(XProposal proposal);
}
