package com.zking.ssm.service;

import com.zking.ssm.model.XDict;

import java.util.List;

public interface IXdictService {

    List<XDict> selectDict(XDict xDict);
}
