package com.zking.ssm.service;

import com.zking.ssm.model.XRecord;
import com.zking.ssm.service.BaseTest;
import com.zking.ssm.service.IRecordService;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

public class RecordServiceImplTest extends BaseTest {

    @Resource
    private IRecordService recordService;

    @Test
    public void selectRecord() {
        XRecord xRecord= new XRecord();
        xRecord.setRecdf(90F);
        List<XRecord> xRecords = recordService.selectRecord(xRecord);
        for (XRecord x:xRecords){
            System.out.println(x);
        }
    }
}