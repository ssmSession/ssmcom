package com.zking.ssm.controller;

import com.zking.ssm.model.XRecord;
import com.zking.ssm.service.IXrecordService;
import com.zking.ssm.util.DataProtocol;
import com.zking.ssm.util.PageBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/record")
public class RecordController {

    @Resource
    private IXrecordService recordService;

    @RequestMapping("/loadRecord")
    public Object selectRecord(XRecord xRecord , HttpServletRequest request, PageBean pageBean){
        pageBean.setRequest(request);
        List<XRecord> xRecords = recordService.selectRecord(xRecord,pageBean);
        DataProtocol data=new DataProtocol();
        data.setCode(0);
        data.setCount(pageBean.getTotal());
        data.setData(xRecords);
        return data;
    }
}
