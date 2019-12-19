package com.zking.ssm.mapper;

import com.zking.ssm.model.XRecord;

import java.util.List;

public interface XrecordMapper {


    /**
     * 查询根据条件（类型，标题，得分）所有记录
     * @param xRecord
     * @return
     */
    List<XRecord> selectRecord(XRecord xRecord);
}
