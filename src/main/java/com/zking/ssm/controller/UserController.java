package com.zking.ssm.controller;

import com.zking.ssm.model.XUser;
import com.zking.ssm.service.IXuserService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IXuserService xuserService;

    @RequestMapping("/loadUser")
    public Object loadUser(XUser xUser){
        xUser.setRemark("委员");
        List<XUser> list = xuserService.getUserByRemark(xUser);
        DataProtocol data=new DataProtocol();
        data.setCode(DataProtocol.SUCCESS);
        data.setData(list);
        return data;
    }


}
