package com.zking.ssm.controller;

import com.zking.ssm.model.XDict;
import com.zking.ssm.service.IXdictService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/dict")
public class DictController {

    @Resource
    private IXdictService xdictService;

    @RequestMapping("/selectDict")
    public Object selectDict(XDict xDict){
        List<XDict> xDicts = xdictService.selectDict(xDict);
        DataProtocol data=new DataProtocol();
        data.setCode(DataProtocol.SUCCESS);
        data.setData(xDicts);
        return data;
    }

}
