package com.zking.ssm.service.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.ssm.mapper.XmeetingMapper;
import com.zking.ssm.model.XAdvice;
import com.zking.ssm.model.XMeeting;
import com.zking.ssm.service.IXmeetingService;
import com.zking.ssm.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class XmeetingServiceImpl implements IXmeetingService {

    @Resource
    private XmeetingMapper xmeetingMapper;

    @Override
    public List<XMeeting> getAllMeetingByType(XMeeting xMeeting, PageBean pageBean){
        if(pageBean!=null && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        List<XMeeting> list =  xmeetingMapper.getAllMeetingByType(xMeeting);
        if(pageBean!=null && pageBean.isPagination()){
            PageInfo pageInfo=new PageInfo(list);
            pageBean.setTotal(Long.valueOf(pageInfo.getTotal()).intValue());
        }
        return list;
    }

    @Override
    public int applyName(XMeeting xMeeting){
        return xmeetingMapper.applyName(xMeeting);
    }

    @Override
    public int delMeeting(XMeeting xMeeting){
        return  xmeetingMapper.delMeet(xMeeting);
    }

    @Override
    public int addMeeting(XMeeting xMeeting){
        return  xmeetingMapper.addMeeting(xMeeting);
    }


}
