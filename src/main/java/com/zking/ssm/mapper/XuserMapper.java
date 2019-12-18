package com.zking.ssm.mapper;

import com.zking.ssm.model.XUser;

import java.util.List;

public interface XuserMapper {

    /**
     * 根据用户表的remark进行查询所有
     * @param xUser
     * @return
     */
    List<XUser> getUserByRemark(XUser xUser);

    List<XUser> getUserAndSing(XUser xUser);

}
