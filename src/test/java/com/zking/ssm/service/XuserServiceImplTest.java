package com.zking.ssm.service;

import com.zking.ssm.model.XUser;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

public class XuserServiceImplTest extends BaseTest{

    @Resource
    private IXuserService xuserService;

    @Test
    public void getUserByRemark() {
        XUser xUser=new XUser();
        xUser.setRemark("委员");
        List<XUser> users = xuserService.getUserByRemark(xUser);
        for (XUser x:users){
            System.out.println(x);
        }
    }

    @Test
    public  void getUserAndSing(){
        XUser xUser=new XUser();
        List<XUser> users = xuserService.getUserAndSing(xUser);
        for (XUser x:users){
            System.out.println(x);
        }
    }
}