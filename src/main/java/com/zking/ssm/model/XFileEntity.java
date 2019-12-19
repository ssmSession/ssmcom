package com.zking.ssm.model;

import java.util.Objects;



public class XFileEntity {
    private String fileid;
    private String filesize;
    private String realName;
    private String contentType;
    private String url;

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
        XFileEntity that = (XFileEntity) o;
        return Objects.equals(fileid, that.fileid) &&
                Objects.equals(filesize, that.filesize) &&
                Objects.equals(realName, that.realName) &&
                Objects.equals(contentType, that.contentType) &&
                Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileid, filesize, realName, contentType, url);
    }
}
