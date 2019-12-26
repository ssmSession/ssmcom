package com.zking.ssm.service;

import com.zking.ssm.model.XRecord;
import com.zking.ssm.util.PageBean;

import java.util.List;

public interface IXrecordService {

    List<XRecord> selectRecord(XRecord xRecord, PageBean pageBean);

}
