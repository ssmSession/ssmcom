package com.zking.ssm.controller;

import com.zking.ssm.model.XNotice;
import com.zking.ssm.service.XNoticeService;
import com.zking.ssm.util.DataProtocol;
import com.zking.ssm.util.PageBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@RestController
public class XNoticeController {

    @Resource
    private XNoticeService xNoticeService;

    /**
     * 添加通知
     * @return
     */
    @RequestMapping("/addXNotice")
    public Object addXNotice (XNotice xNotice){
        DataProtocol dataProtocol = new DataProtocol();
        try {
            xNoticeService.addXNotice(xNotice);
        } catch (Exception e){
            dataProtocol.setCode(-1);
        }
        return dataProtocol;
    }

    /**
     * 查询所有通知并且分页
     * @param pageBean
     * @return
     */
    @RequestMapping("/getXNotice")
    public Object getXNotice (XNotice xnotice, PageBean pageBean,Integer limit){

        DataProtocol dataProtocol = new DataProtocol();
        pageBean.setRows(limit);
        try {
            List<XNotice> xNotice = xNoticeService.getXNotice(xnotice, pageBean);
            dataProtocol.setData(xNotice);
            dataProtocol.setCode(0);
            dataProtocol.setCount(pageBean.getTotal());
        }catch (Exception e){
            dataProtocol.setCode(-1);
            e.printStackTrace();
        }
        return  dataProtocol;
    }

    @RequestMapping("/updateXNotice")
    public Object updateXNotice (XNotice xNotice){

        DataProtocol dataProtocol = new DataProtocol();

        try {
            xNoticeService.updateXNotice(xNotice);
        }catch (Exception e){
            dataProtocol.setCode(-1);
        }
        return dataProtocol;
    }

    /**
     * 删除 通知根据
     * @param xNotice
     * @return
     */
    @RequestMapping("/delXNotice")
    public Object delXNotice (XNotice xNotice){

        DataProtocol dataProtocol = new DataProtocol();
        try {
            xNoticeService.delXNotice(xNotice);
        }catch (Exception e){
            dataProtocol.setCode(-1);
        }
        return dataProtocol;
    }


}
