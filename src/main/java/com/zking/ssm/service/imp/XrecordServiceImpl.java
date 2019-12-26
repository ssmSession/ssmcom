package com.zking.ssm.service.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.ssm.mapper.XrecordMapper;
import com.zking.ssm.model.XMeeting;
import com.zking.ssm.model.XRecord;
import com.zking.ssm.service.IXrecordService;
import com.zking.ssm.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class XrecordServiceImpl implements IXrecordService {

    @Resource
    private XrecordMapper xrecordMapper;

    @Override
    public List<XRecord> selectRecord(XRecord xRecord, PageBean pageBean){
        if(pageBean!=null && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        List<XRecord> list = xrecordMapper.selectRecord(xRecord);
        if(pageBean!=null && pageBean.isPagination()){
            PageInfo pageInfo=new PageInfo(list);
            pageBean.setTotal(Long.valueOf(pageInfo.getTotal()).intValue());
        }
        return list;
    }
}
