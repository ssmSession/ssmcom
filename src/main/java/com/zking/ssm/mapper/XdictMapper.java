package com.zking.ssm.mapper;

import com.zking.ssm.model.XDict;

import java.util.List;

public interface XdictMapper {

    /**
     * 查询所有承办者
     * @param xDict
     * @return
     */
    List<XDict> selectDict(XDict xDict);

}
