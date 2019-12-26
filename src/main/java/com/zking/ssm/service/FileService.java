package com.zking.ssm.service;

import com.zking.ssm.model.XFile;

import java.util.List;

public interface FileService {
    /**
     * 添加文件
     * @param record
     * @return
     */
    int insert(XFile record);

    /**
     * 删除文件
     * @param file
     * @return
     */
    int delete(XFile file);

    /**
     * 查询文件
     * @param file
     * @return
     */
    List<XFile> queryFile(XFile file);
}