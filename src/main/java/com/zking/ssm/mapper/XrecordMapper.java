package com.zking.ssm.mapper;

import com.zking.ssm.model.XRecord;

import java.util.List;

public interface XrecordMapper {

    List<XRecord> selectRecord(XRecord xRecord);
}
