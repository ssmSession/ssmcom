package com.zking.ssm.mapper;


import com.zking.ssm.model.XDictEntity;

import java.util.List;

public interface DictMapper {

    int insert(XDictEntity record);

    List<XDictEntity> queryDictPager(XDictEntity dict);

    List<XDictEntity> Sdict(XDictEntity dict);

    int updateDict(XDictEntity dict);

    int deleteDict(XDictEntity dict);
}
