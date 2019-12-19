package com.zking.ssm.controller;

import com.zking.ssm.model.XOpinionEntity;
import com.zking.ssm.model.XReplyEntity;
import com.zking.ssm.service.OpinionService;
import com.zking.ssm.service.ReplyService;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OpinionController {
    @Autowired
    private OpinionService opinionService;

    @Autowired
    private ReplyService replyService;
//
//    @Autowired
//    private VoteService voteService;


    @RequestMapping("/addOpinion")
    @ResponseBody
    public Map<String, Object> addOpinion(XOpinionEntity opinion, HttpServletRequest req) {
        opinion.setProid(1);
        opinion.setOpgjzt("017");
       /* User user = (User) req.getSession().getAttribute("User");
        opinion.setOpfyr(user.getUsername());*/
        opinionService.insert(opinion);
        Map<String, Object> map = new HashMap<>();
        map.put("success", true);
        map.put("message", "保存成功");
        return map;
    }

  /*  @RequestMapping("/queryOpinion")
    @ResponseBody*/
    /*public Map<String, Object> queryOpinionPager(XOpinionEntity opinion, HttpServletRequest req) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(req);
        List<XOpinionEntity> opinions = opinionService.queryOpinionPager(opinion, pageBean);
        Map<String, Object> map = new HashMap<>();
        map.put("data", opinions);
        map.put("count", pageBean.getTotal());
        map.put("code", 0);
        return map;*/
   /* }*/

    @RequestMapping("/updateyOpinion")
    @ResponseBody
    public Map<String, Object> updateyOpinion(XOpinionEntity opinion, HttpServletRequest req) {
        XReplyEntity reply = new XReplyEntity();
        String biaoti = req.getParameter("oplgbt");
        System.out.println(biaoti);
        String danw = req.getParameter("opdwllx");
        opinion.setOpgjzt("018");
        opinion.setOpsfgk(0);
        int i = opinionService.updateOpinion(opinion);
        reply.setRepname(biaoti);
        reply.setRepdw(danw);
        reply.setRepdate(new Date());
        replyService.insert(reply);
        Map<String, Object> map = new HashMap<>();
        map.put("success", true);
        map.put("message", "报送成功");
        return map;
    }

    @RequestMapping("/deleteOpinion")
    @ResponseBody
    public Map<String, Object> deleteOpinion(XOpinionEntity opinion) {
        int i = opinionService.deleteOpinion(opinion);
        Map<String, Object> map = new HashMap<>();
        map.put("success", true);
        map.put("message", "删除成功");
        return map;
    }

    @RequestMapping("/queryTj")
    @ResponseBody
    public Map<String, Object> queryTj(XOpinionEntity opinion) {
        List<Map<String, Object>> opin = opinionService.queryTj(opinion);
        Map<String, Object> writMap = new HashMap<>();
        writMap.put("success", true);
        writMap.put("message", "失败");
        writMap.put("data", opin);
        return writMap;
    }

    @RequestMapping("/queryTo")
    @ResponseBody
    public Map<String, Object> queryTo(XOpinionEntity opinion) {
        List<Map<String, Object>> opin = opinionService.queryTo(opinion);
        Map<String, Object> writMap = new HashMap<>();
        writMap.put("success", true);
        writMap.put("message", "失败");
        writMap.put("data", opin);
        return writMap;
    }

    @RequestMapping("/queryTh")
    @ResponseBody
    public Map<String, Object> queryTh(XOpinionEntity opinion) {
        List<Map<String, Object>> opin = opinionService.queryTH(opinion);
        Map<String, Object> writMap = new HashMap<>();
        writMap.put("success", true);
        writMap.put("message", "失败");
        writMap.put("data", opin);
        return writMap;
    }

   /* @RequestMapping("/updateTp")
    @ResponseBody*/
   /* public Map<String, Object> updateTp(XOpinionEntity opinion, HttpServletRequest req) {
        Vote vote = new Vote();
        String proid = req.getParameter("proid");
        opinion.setProid(Integer.parseInt(proid) + 1);
        String opid = req.getParameter("opid");
        User user = (User) req.getSession().getAttribute("User");
        //String opfyr = "李四";
        vote.setProid(Integer.parseInt(opid));
        vote.setOpname(user.getUsername());
        List<Vote> votes = voteService.queryVote(vote);
        if (0 == votes.size()) {
            voteService.insert(vote);
            opinionService.updateTp(opinion);
            Map<String, Object> writMap = new HashMap<>();
            writMap.put("success", true);
            writMap.put("message", "投票成功");
            return writMap;
        } else {
            Map<String, Object> writMap = new HashMap<>();
            writMap.put("success", true);
            writMap.put("message", "已投票,每个人只有一次机会");
            return writMap;
        }
    }*/

}
