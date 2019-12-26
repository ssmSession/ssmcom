package com.zking.ssm.service;

import com.zking.ssm.model.XAdvice;
import com.zking.ssm.util.PageBean;

import java.util.List;
import java.util.Map;

public interface IXadivesService {

    List<XAdvice> selectAdvice(Map map, PageBean pageBean);

    int delAdvice(XAdvice xAdvice);

    int updateAdvice(XAdvice xAdvice);
}
