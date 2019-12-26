package com.zking.ssm.model;

import org.springframework.web.multipart.MultipartFile;

import java.util.Objects;



public class XFile {
    private String fileid;
    private String filesize;
    private String realName;
    private String contentType;
    private String url;
    private MultipartFile[] file;

    public MultipartFile[] getFile() {
        return file;
    }

    public void setFile(MultipartFile[] file) {
        this.file = file;
    }

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid;
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XFile xFile = (XFile) o;
        return Objects.equals(fileid, xFile.fileid) &&
                Objects.equals(filesize, xFile.filesize) &&
                Objects.equals(realName, xFile.realName) &&
                Objects.equals(contentType, xFile.contentType) &&
                Objects.equals(url, xFile.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileid, filesize, realName, contentType, url);
    }
}
