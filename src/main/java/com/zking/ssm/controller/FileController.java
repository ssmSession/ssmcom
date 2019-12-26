package com.zking.ssm.controller;

import com.zking.ssm.model.XFile;
import com.zking.ssm.service.FileService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/File")
public class FileController {

    @Resource
    private FileService fileServices;


    @RequestMapping("/upload")
    @ResponseBody
    @Transactional(rollbackFor = Exception.class)
    public Map<String, Object> upload(XFile file) throws Exception {
        MultipartFile[] imgs = file.getFile();
        String fileId = file.getFileid();
        String filenameId = UUID.randomUUID().toString().replace("-", "");
        for (MultipartFile img : imgs) {
            String filePath = "D:\\t233idea\\ssmcom\\upload\\" + filenameId + img.getOriginalFilename();
            file.setFileid(fileId);
            file.setFilesize(img.getSize() + "");
            file.setContentType(img.getContentType());
            file.setRealName(img.getOriginalFilename());
            file.setUrl(filePath);
            int insert = fileServices.insert(file);
            img.transferTo(new File(filePath));
        }
        Map<String, Object> res = new HashMap<>();
        res.put("code", 0);
        return res;
    }

    @RequestMapping("/delete")
    @ResponseBody
    @Transactional(rollbackFor = Exception.class)
    public Map<String, Object> delete(XFile file)  throws Exception{
        List<XFile> files = fileServices.queryFile(file);
        if (0 != files.size() && null != files) {
            fileServices.delete(file);
        }
        for (XFile file1 : files) {
            File file2 = new File(file1.getUrl());
            file2.delete();
        }
        Map<String, Object> res = new HashMap<>();
        res.put("code", 0);
        res.put("message","清空成功");
        return res;
    }

    @RequestMapping("/queryFile")
    @Transactional
    @ResponseBody
    public List<XFile> queryFile(XFile file){
        List<XFile> files = fileServices.queryFile(file);
        return files;
    }
}