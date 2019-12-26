package com.zking.ssm.service;

import com.zking.ssm.model.XSing;
import com.zking.ssm.model.XUser;
import com.zking.ssm.util.PageBean;

import java.util.List;
import java.util.Map;

public interface IXsingService {

    /**
     * 用户表和签到表联查
     * @param map
     * @return
     */
    List<XSing> getUserAndSing(Map<String,Object> map, PageBean pageBean);
}
