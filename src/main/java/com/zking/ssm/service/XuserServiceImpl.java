package com.zking.ssm.service;

import com.zking.ssm.mapper.XuserMapper;
import com.zking.ssm.model.XUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class XuserServiceImpl implements IXuserService {

    @Resource
    private XuserMapper xuserMapper;

    @Override
    public List<XUser> getUserByRemark(XUser xUser){
        return xuserMapper.getUserByRemark(xUser);
    }

    @Override
    public  List<XUser> getUserAndSing(XUser xUser){
        return xuserMapper.getUserAndSing(xUser);
    }
}
