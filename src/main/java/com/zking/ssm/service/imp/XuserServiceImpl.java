package com.zking.ssm.service.imp;

import com.zking.ssm.mapper.XuserMapper;
import com.zking.ssm.model.XUser;
import com.zking.ssm.service.IXuserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class XuserServiceImpl implements IXuserService {

    @Resource
    private XuserMapper xuserMapper;

    @Override
    public List<XUser> getUserByRemark(XUser xUser){
        return xuserMapper.getUserByRemark(xUser);
    }

    @Override
    public  List<XUser> getUserAndSing(Map<String,Object> xUser){
        return xuserMapper.getUserAndSing(xUser);
    }

    @Override
    public void addUser(XUser xUser){
        xuserMapper.addUser(xUser);
    }

    @Override
    public XUser getUser(XUser xUser){
        return xuserMapper.getUser(xUser);
    }

}
