package com.zking.ssm.service.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.ssm.mapper.XnoticeMapper;
import com.zking.ssm.model.XNotice;
import com.zking.ssm.service.XNoticeService;
import com.zking.ssm.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class XNoticeServiceImpl implements XNoticeService {

    @Resource
    private XnoticeMapper xnoticeMapper;

    @Override
    public int addXNotice(XNotice xNotice) {

        //给id赋值
        long x = 0;
        for(int j = 0; j< 100; j++){
            x = (long) ((Math.random()*9+1)*100000000);
        }
        String notid = "kh_"+x;
        xNotice.setNotid(notid);

        //给时间赋值
        xNotice.setNotdate(new Date());

        return xnoticeMapper.addXNotice(xNotice);
    }

    @Override
    public List<XNotice> getXNotice(XNotice xNotice, PageBean pageBean){

        if(pageBean != null && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }

        List<XNotice> list = xnoticeMapper.getXNotice(xNotice);

        if(pageBean != null && pageBean.isPagination()){
            PageInfo pageInfo = new PageInfo(list);
            pageBean.setTotal(Long.valueOf(pageInfo.getTotal()).intValue());
        }

        return  list;
    }

    @Override
    public void updateXNotice(XNotice xnotice){
        xnoticeMapper.updateXNotice(xnotice);
    }

    @Override
    public void delXNotice (XNotice xNotice){
        xnoticeMapper.delXNotice(xNotice);
    }


}
