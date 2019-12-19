package com.zking.ssm.service;

import com.zking.ssm.model.XUser;

import java.util.List;
import java.util.Map;

public interface IXuserService {

    /**
     * 根据用户的remark字段进行查询
     * @param xUser
     * @return
     */
    List<XUser> getUserByRemark(XUser xUser);

    /**
     * 用户表和签到表联查
     * @param xUser
     * @return
     */
    List<XUser> getUserAndSing(Map<String,Object> xUser);
}
