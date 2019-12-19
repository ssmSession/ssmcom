package com.zking.ssm.controller;

import com.zking.ssm.model.XDictEntity;
import com.zking.ssm.service.DictService;
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
public class DictController {
    @Autowired
    private DictService dictService;

    @RequestMapping("/addDict")
    public String addDict(HttpSession session){
        return "/social/addDict";
    }

    @RequestMapping("/updateDict")
    public String updateDict(HttpSession session){
        return "/social/updateDict";
    }

    @RequestMapping("/queryDict")
    @ResponseBody
    public List<XDictEntity> queryModule(XDictEntity dict){
        List<XDictEntity> sdict = dictService.Sdict(dict);
        return sdict;
    }


    @RequestMapping("/addDicts")
    @ResponseBody
    public Map<String,Object> addDicts(XDictEntity dict){
        int insert = dictService.insert(dict);
        Map<String,Object> map=new HashMap<>();
        map.put("success",true);
        map.put("message","添加成功");
        return map;
    }

    @RequestMapping("/updateDicts")
    @ResponseBody
    public Map<String,Object> updateDicts(XDictEntity dict){
        int insert = dictService.updateDict(dict);
        Map<String,Object> map=new HashMap<>();
        map.put("success",true);
        map.put("message","修改成功");
        return map;
    }

    @RequestMapping("/deleteDict")
    @ResponseBody
    public Map<String,Object> deleteDict(XDictEntity dict){
        int insert = dictService.deleteDict(dict);
        Map<String,Object> map=new HashMap<>();
        map.put("success",true);
        map.put("message","删除成功");
        return map;
    }

    @RequestMapping("/queryDictAll")
    @ResponseBody
    public Map<String,Object> queryDictPager(XDictEntity dict, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        System.out.println(pageBean.getTotal());
        List<XDictEntity> dicts = dictService.queryDictPager(dict,pageBean);
        Map<String,Object> map=new HashMap<>();
        map.put("data",dicts);
        map.put("count",pageBean.getTotal());
        map.put("code",0);
        return map;
    }
}


