package com.zking.ssm.service.imp;

import com.zking.ssm.mapper.XrecordMapper;
import com.zking.ssm.model.XRecord;
import com.zking.ssm.service.IRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecordServiceImpl implements IRecordService {

    @Resource
    private XrecordMapper xrecordMapper;

    @Override
    public List<XRecord> selectRecord(XRecord xRecord){
        return xrecordMapper.selectRecord(xRecord);
    }
}
