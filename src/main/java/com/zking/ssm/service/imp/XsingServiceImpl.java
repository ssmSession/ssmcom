package com.zking.ssm.service.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.ssm.mapper.XsingMapper;
import com.zking.ssm.model.XMeeting;
import com.zking.ssm.model.XSing;
import com.zking.ssm.model.XUser;
import com.zking.ssm.service.IXsingService;
import com.zking.ssm.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class XsingServiceImpl implements IXsingService {

    @Resource
    private XsingMapper xsingMapper;

    @Override
    public  List<XSing> getUserAndSing(Map<String,Object> map, PageBean pageBean){

        if(pageBean!=null && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        List<XSing> list = xsingMapper.getUserAndSing(map);
        if(pageBean!=null && pageBean.isPagination()){
            PageInfo pageInfo=new PageInfo(list);
            pageBean.setTotal(Long.valueOf(pageInfo.getTotal()).intValue());
        }
        return list;
    }


}
