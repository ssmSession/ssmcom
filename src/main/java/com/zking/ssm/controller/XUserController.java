package com.zking.ssm.controller;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.zking.ssm.model.XUser;
import com.zking.ssm.service.IXuserService;
import com.zking.ssm.service.imp.XuserServiceImpl;
import com.zking.ssm.util.DataProtocol;
import com.zking.ssm.util.SmsSnedUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("/user")
public class XUserController {


    @Resource
    private IXuserService iXuserService;

    /**
     * 用户登录
     * @return
     */
    @RequestMapping("/login")
    public Object login(XUser xUser) {

        DataProtocol dataProtocol = new DataProtocol();

        try {
            XUser user = iXuserService.getUser(xUser);
            if(xUser != null && xUser.getPassword().equals(user.getPassword())){
               dataProtocol.setCode(1);
            }else {
                dataProtocol.setCode(-1);
            }
        }catch (Exception e){
            dataProtocol.setCode(-1);
        }
        return dataProtocol;
    }

    /**
     * 用户注册
     * @return
     */
    @RequestMapping("/addUser")
    public Object addXUser(XUser xUser){
        DataProtocol dataProtocol = new DataProtocol();
        try {
            iXuserService.addUser(xUser);
            dataProtocol.setCode(1);
        }catch (Exception e){
            dataProtocol.setCode(-1);
        }
        return dataProtocol;
    }

    /**
     * 获取手机号码返回的短信验证码
     * @return
     */
    @RequestMapping("/getTelCode")
    public Object getTelCode (String tel){

        DataProtocol dataProtocol = new DataProtocol();

        try {
            String send = SmsSnedUtil.send(tel);
            dataProtocol.setCode(1);
            dataProtocol.setData(send);
        }catch (Exception e){
            dataProtocol.setCode(-1);
        }
        return dataProtocol;
    }


}
