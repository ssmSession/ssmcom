package com.zking.ssm.service.imp;

import com.github.pagehelper.PageInfo;
import com.zking.ssm.mapper.ProposalMapper;
import com.zking.ssm.model.XProposal;
import com.zking.ssm.service.IProposalService;
import com.zking.ssm.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: w541
 * Date: 2019/12/18
 * Time: 14:29
 */
@Service
public class ProposalServiceImpl implements IProposalService {

    @Resource
    private ProposalMapper proposalMapper;

    /**
     * 添加提案
     * @param record
     * @return
     */
    @Override
    public int insert(XProposal record){
        return proposalMapper.insert(record);
    }

    /**
     * 提案号查询
     * @param proposal
     * @return
     */
    @Override
    public List<XProposal> queryProposal(XProposal proposal) {
        return proposalMapper.queryProposal(proposal);
    }

    /**
     * 届次查询
     * @param proposal
     * @return
     */
    @Override
    public List<XProposal> queryPeriod(XProposal proposal) {

        return proposalMapper.queryPeriod(proposal);
    }


    /**
     * 提案查询
     * @param proposal
     * @return
     */
    @Override
    public List<XProposal> queryProposalPager(XProposal proposal, PageBean pageBean) {

        return proposalMapper.queryProposalPager(proposal);
    }

    /**
     * 删除提案
     * @param proposal
     * @return
     */
    @Override
    public int deleteProposal(XProposal proposal) {
        return proposalMapper.deleteProposal(proposal);
    }

    /**
     * 提案修改
     * @param proposal
     * @return
     */
    @Override
    public int updataProposal(XProposal proposal) {
        return proposalMapper.updataProposal(proposal);
    }

    /**
     * 提案审核
     * @param proposal
     * @return
     */
    @Override
    public int updataState(XProposal proposal) {
        return proposalMapper.updataState(proposal);
    }

    /**
     * 提案评价
     * @param proposal
     * @return
     */
    @Override
    public int evaluate(XProposal proposal) {
        return proposalMapper.evaluate(proposal);
    }

    /**
     * 提案统计
     * @param proposal
     * @return
     */
    @Override
    public List<Map<String, Object>> proposalStatistics(XProposal proposal) {
        return proposalMapper.proposalStatistics(proposal);
    }

    /**
     * 未分类提案统计
     * @param proposal
     * @return
     */
    @Override
    public List<String> unclassified(XProposal proposal) {
        return proposalMapper.unclassified(proposal);
    }

    /**
     * 未审核提案统计
     * @param proposal
     * @return
     */
    @Override
    public List<String> unaudited(XProposal proposal) {
        return proposalMapper.unaudited(proposal);
    }


    /**
     * 提案类型统计
     * @param proposal
     * @return
     */
    @Override
    public List<String> proposalType(XProposal proposal) {
        return proposalMapper.proposalType(proposal);
    }

    /**
     * 提案件数
     * @param proposal
     * @return
     */
    @Override
    public String count(XProposal proposal) {
        return proposalMapper.count(proposal);
    }

    /**
     * 提案附议
     * @param proposal
     * @return
     */
    @Override
    public int updateFY(XProposal proposal) {
        return proposalMapper.updateFY(proposal);
    }
}
