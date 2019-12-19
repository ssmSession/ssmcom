package com.zking.ssm.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.ssm.mapper.XadviceMapper;
import com.zking.ssm.model.XAdvice;
import com.zking.ssm.model.XDict;
import com.zking.ssm.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class XadivesServiceImpl implements IXadivesService {

    @Resource
    private XadviceMapper xadviceMapper;

    @Override
    public List<XAdvice>  selectAdvice(Map map, PageBean pageBean){
        if(pageBean!=null && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }

        List<XAdvice> list = xadviceMapper.selectAdvice(map);
        if(pageBean!=null && pageBean.isPagination()){
            PageInfo pageInfo=new PageInfo(list);
            pageBean.setTotal(Long.valueOf(pageInfo.getTotal()).intValue());
        }
        return list;
    }

}
