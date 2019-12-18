package com.zking.ssm.service;

import com.zking.ssm.model.XUser;

import java.util.List;

public interface IXuserService {
    List<XUser> getUserByRemark(XUser xUser);

    List<XUser> getUserAndSing(XUser xUser);
}
