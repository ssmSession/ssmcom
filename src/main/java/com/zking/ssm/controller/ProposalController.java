package com.zking.ssm.controller;

import com.zking.ssm.model.XProposal;
import com.zking.ssm.model.XUser;
import com.zking.ssm.service.IProposalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TOOD
 *
 * @author ${qiaoqiao}
 * @date 2019/12/19 15:18
 */

@RestController
public class ProposalController {

    @Autowired
    private IProposalService proposalService;

    @RequestMapping("/submit")
    @Transactional(rollbackFor = Exception.class)
    public Map<String,Object> submit(XProposal proposal, HttpServletRequest req){
        XUser user =(XUser)req.getSession().getAttribute("user");
        proposal.setProuserid(user.getId()+"");
        int insert= proposalService.insert(proposal);
        Map<String,Object> map = new HashMap<>();
        if(insert>0){
            map.put("success",true);
            map.put("message","提交成功");
        }
        return  map;
    }

    @RequestMapping("/queryProposal")
    @Transactional(readOnly = true)
    public boolean queryProposal(XProposal proposal){
        List<XProposal> proposals = proposalService.queryProposal(proposal);
        if(0!=proposals.size()&&null!=proposals){
            return true;
        }
        return false;
    }
}
