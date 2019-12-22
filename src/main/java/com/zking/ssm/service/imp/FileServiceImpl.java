package com.zking.ssm.service.imp;

import com.zking.ssm.mapper.FlieMapper;
import com.zking.ssm.model.XFile;
import com.zking.ssm.service.FileService;
import org.apache.logging.log4j.core.appender.FileManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Transactional
@Service
public class FileServiceImpl implements FileService {

    @Resource
    private FlieMapper flieMapper;
    @Override
    public int insert(XFile record) {
        return flieMapper.insert(record);
    }

    @Override
    public int delete(XFile file) {
        return flieMapper.delete(file);
    }

    @Override
    public List<XFile> queryFile(XFile file) {

        return flieMapper.queryFile(file);
    }
}
