package com.zking.ssm.service.imp;

import com.zking.ssm.mapper.XdictMapper;
import com.zking.ssm.model.XDict;
import com.zking.ssm.service.IXdictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class XdictServiceImpl implements IXdictService {

    @Resource
    private XdictMapper xdictMapper;

    @Override
    public List<XDict> selectDict(XDict xDict){
        return  xdictMapper.selectDict(xDict);
    }

}
