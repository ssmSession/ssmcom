package com.zking.ssm.controller;

import com.zking.ssm.model.XProposal;
import com.zking.ssm.model.XUser;
import com.zking.ssm.service.IProposalService;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
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
        if(user!=null){
            proposal.setProuserid(user.getId()+"");
        }
        System.out.println(proposal);
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

    @RequestMapping("/queryPeriod")
    @Transactional(readOnly = true)
    @ResponseBody
    public List<XProposal> queryPeriod(XProposal proposal){
        List<XProposal>proposals=proposalService.queryPeriod(proposal);
        return proposals;
    }

    @RequestMapping("/queryProposalPager")
    @Transactional(readOnly = true)
    @ResponseBody
    public Map<String,Object> queryProposalPager(XProposal proposal,HttpServletRequest req){
        PageBean pageBean = new PageBean();
        pageBean.setRequest(req);
        List<XProposal> proposals = proposalService.queryProposalPager(proposal,pageBean);
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageBean.getTotal());
        map.put("data",proposals);
        return  map;
    }

    @RequestMapping("/deleteProposal")
    @Transactional
    @ResponseBody
    public Map<String,Object> deleteProposal(XProposal proposal){
        int i = proposalService.deleteProposal(proposal);
        Map<String,Object> map  = new HashMap<>();
        if(i>0){
            map.put("success",true);
            map.put("message","删除成功");
        }
        return map;
    }

    @RequestMapping("/updataProposal")
    @Transactional
    @ResponseBody
    public Map<String,Object>updataProposal(XProposal proposal){
        int insert = proposalService.updataProposal(proposal);
        Map<String,Object> map = new HashMap<>();
        if(insert>0){
            map.put("success",true);
            map.put("message","提交成功");
        }
        return map;
    }

    @RequestMapping("/updataState")
    @Transactional
    @ResponseBody
    public Map<String,Object> updataState(XProposal proposal){
        int insert = proposalService.updataState(proposal);
        Map<String,Object> map = new HashMap<>();
        if(insert>0){
            map.put("success",true);
            map.put("message","已审核");
        }
        return  map;
    }

    @RequestMapping("/evaluate")
    @Transactional
    @ResponseBody
    public Map<String,Object> evaluate(XProposal proposal){
        int insert = proposalService.evaluate(proposal);
        Map<String,Object> map = new HashMap<>();
        if(insert>0){
            map.put("success",true);
            map.put("message","已评价");
        }
        return  map;
    }

    /**
     * 提案统计
     * @param proposal
     * @return
     */
    @RequestMapping("/Statistics")
    @Transactional(readOnly = true)
    @ResponseBody
    public Map<String,Object> proposalStatistics (XProposal proposal){
        List<Map<String, Object>> proposalStatistics = proposalService.proposalStatistics(proposal);
        List x=new ArrayList<>();
        List data=new ArrayList<>();
        Map<String,Object> map=new HashMap<>();
        for (Map<String, Object> proposalStatistic : proposalStatistics) {
            x.add(proposalStatistic.get("procategory"));
            data.add(proposalStatistic.get("COUNT"));
        }
        map.put("x",x);
        map.put("data",data);
        return map;
    }

    /**
     *未分类提案统计
     * @param proposal
     * @return
     */
    @RequestMapping("/unclassified")
    @Transactional(readOnly = true)
    @ResponseBody
    public String unclassified (XProposal proposal){
        List<String> unclassified = proposalService.unclassified(proposal);
        return unclassified.get(0);
    }

    /**
     * 未审核提案统计
     * @param proposal
     * @return
     */
    @RequestMapping("/unaudited")
    @Transactional(readOnly = true)
    @ResponseBody
    public String unaudited(XProposal proposal){
        List<String> unaudited =proposalService.unaudited(proposal);
        return  unaudited.get(0);
    }


    @RequestMapping("/count")
    @Transactional(readOnly = true)
    @ResponseBody
    public String count(XProposal proposal){
        String count = proposalService.count(proposal);
        return count;
    }







}
