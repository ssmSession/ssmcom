package com.zking.ssm.service;

import com.zking.ssm.model.XProposal;
import com.zking.ssm.util.PageBean;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: w541
 * Date: 2019/12/18
 * Time: 14:26
 */
public interface IProposalService {

    /**
     * 添加提案
     * @param record
     * @return
     */
    int insert(XProposal record);

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

    /**
     * 提案查询（分页）
     * @param proposal
     * @return
     */
    List<XProposal> queryProposalPager(XProposal proposal, PageBean pageBean);


    /**
     * 删除提案
     * @param proposal
     * @return
     */
    int deleteProposal(XProposal proposal);

    /**
     * 修改提案
     * @param proposal
     * @return
     */
    int updataProposal(XProposal proposal);


    /**
     * 提案审核
     * @param proposal
     * @return
     */
    int updataState(XProposal proposal);

    /**
     * 提案评价
     * @param proposal
     * @return
     */
    int evaluate (XProposal proposal);

    /**
     * 提案统计
     * @param proposal
     * @return
     */
    List<Map<String,Object>> proposalStatistics(XProposal proposal);


    /**
     * 未分类提案统计
     * @param proposal
     * @return
     */
    List<String> unclassified (XProposal proposal);

    /**
     * 未审核提案统计
     * @param proposal
     * @return
     */
    List<String> unaudited (XProposal proposal);


    /**
     * 提案类型统计
     * @param proposal
     * @return
     */
    List<String> proposalType(XProposal proposal);

    /**
     * 提案件数
     * @param proposal
     * @return
     */
    String count(XProposal proposal);

    /**
     * 提案附议
     * @param proposal
     * @return
     */
    int updateFY(XProposal proposal);
}
