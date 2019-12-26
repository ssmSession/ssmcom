package com.zking.ssm.service;


import com.zking.ssm.model.XDictEntity;
import com.zking.ssm.util.PageBean;

import java.util.List;

public interface DictService {

    List<XDictEntity> selectDict(XDictEntity xDict);
    
    int insert(XDictEntity record);

    List<XDictEntity> Sdict(XDictEntity dict);

    List<XDictEntity> queryDictPager(XDictEntity dict, PageBean pageBean);

    int updateDict(XDictEntity dict);

    int deleteDict(XDictEntity dict);
}
