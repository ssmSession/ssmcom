package com.zking.ssm.service;

import com.zking.ssm.model.XProposal;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: w541
 * Date: 2019/12/18
 * Time: 15:19
 */
public class ProposalServiceImplTest extends BaseTest {

    @Resource
    private IProposalService proposalService;

    @Test
    public void insert() {
        XProposal proposal = new XProposal();
    }

    @Test
    public void queryProposal(){
        XProposal proposal = new XProposal();
        proposal.setProid(1);
        System.out.println(proposalService.queryProposal(proposal));
    }

    @Test
    public void queryPeriod(){
        XProposal proposal = new XProposal();
        proposal.setPeriod("1");
        System.out.println(proposalService.queryPeriod(proposal));
    }
}