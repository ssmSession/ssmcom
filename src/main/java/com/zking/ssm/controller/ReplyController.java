package com.zking.ssm.controller;

import com.zking.ssm.model.XOpinionEntity;
import com.zking.ssm.model.XReplyEntity;
import com.zking.ssm.service.OpinionService;
import com.zking.ssm.service.ReplyService;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Reply")
public class ReplyController {

    @Autowired
    private ReplyService replyService;

    @Autowired
    private OpinionService opinionService;

    @RequestMapping("/queryMLL")
    public String tosocialML(HttpSession session){
        return "/social/socialMLL";
    }

//    @RequestMapping("/queryMHL")
//    public String tosocialMHL(HttpSession session){
//        return "/social/socialMHL";
//    }

    @RequestMapping("/queryReply")
    @ResponseBody
    public Map<String, Object> queryReplyPager(XReplyEntity reply, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        List<XReplyEntity> replies = replyService.queryReplyPager(reply, pageBean);
        Map<String,Object> map=new HashMap<>();
        map.put("data",replies);
        map.put("count",pageBean.getTotal());
        map.put("code",0);
        return map;
    }

    @RequestMapping("/queryReplyHf")
    @ResponseBody
    public Map<String, Object> queryReplyHfPager(XReplyEntity reply, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        List<XReplyEntity> replies = replyService.queryReplyHPager(reply,pageBean);
        Map<String,Object> map=new HashMap<>();
        map.put("data",replies);
        map.put("count",pageBean.getTotal());
        map.put("code",0);
        return map;
    }

    @RequestMapping("/updateReply")
    @ResponseBody
    public Map<String, Object> updateyReply(XReplyEntity reply){
        int i = replyService.updateReply(reply);
        Map<String ,Object> map=new HashMap<>();
        map.put("success",true);
        map.put("message","回复成功");
        return map;
    }

    @RequestMapping("/deleteReply")
    @ResponseBody
    public Map<String, Object> deleteReply(XReplyEntity reply, HttpServletRequest req){
        XOpinionEntity opinion=new XOpinionEntity();
        String oplgbt=req.getParameter("oplgbt");
        opinion.setOplgbt(oplgbt);
        opinion.setOpgjzt("017");
        opinion.setOpsfgk(1);
        opinionService.updateOpinions(opinion);
        int i = replyService.deleteReply(reply);
        Map<String ,Object> map=new HashMap<>();
        map.put("success",true);
        map.put("message","删除成功");
        return map;
    }
}
