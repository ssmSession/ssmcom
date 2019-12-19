package com.zking.ssm.service;

import com.zking.ssm.model.XRecord;

import java.util.List;

public interface IRecordService {

    List<XRecord> selectRecord(XRecord xRecord);
}
