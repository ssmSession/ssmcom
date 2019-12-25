package com.zking.ssm.service.imp;

import com.zking.ssm.mapper.ProposalMapper;
import com.zking.ssm.model.XProposal;
import com.zking.ssm.service.IProposalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
}
