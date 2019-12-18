package com.zking.ssm.mapper;

import com.zking.ssm.model.XSing;

import java.util.List;

public interface XsingMapper {

    /**
     * 用户表和签到表进行联查
     * @param xSing
     * @return
     */
    List<XSing> getAllSing(XSing xSing);

}
