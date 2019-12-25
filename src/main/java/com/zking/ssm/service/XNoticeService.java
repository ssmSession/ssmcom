package com.zking.ssm.service;


import com.zking.ssm.model.XNotice;
import com.zking.ssm.util.PageBean;

import java.util.List;

public interface XNoticeService {

    public int addXNotice(XNotice xNotice);


    List<XNotice> getXNotice(XNotice xNotice, PageBean pageBean);

    void updateXNotice(XNotice xnotice);

    void delXNotice(XNotice xNotice);
}
