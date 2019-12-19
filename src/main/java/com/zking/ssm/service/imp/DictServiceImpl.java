package com.zking.ssm.service.imp;

import com.zking.ssm.mapper.DictMapper;
import com.zking.ssm.model.XDictEntity;
import com.zking.ssm.service.DictService;
import com.zking.ssm.util.PageBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service
public class DictServiceImpl implements DictService {
    @Resource
    private DictMapper dictMapper;

    @Override
    public int insert(XDictEntity record) {
        return dictMapper.insert(record);
    }

    @Transactional(readOnly = true)
    @Override
    public List<XDictEntity> Sdict(XDictEntity dict) {
        return dictMapper.Sdict(dict);
    }


    @Override
    public List<XDictEntity> queryDictPager(XDictEntity dict, PageBean pageBean) {

        return dictMapper.queryDictPager(dict);
    }

    @Override
    public int updateDict(XDictEntity dict) {

        return dictMapper.updateDict(dict);
    }

    @Override
    public int deleteDict(XDictEntity dict) {
        return dictMapper.deleteDict(dict);
    }
}
