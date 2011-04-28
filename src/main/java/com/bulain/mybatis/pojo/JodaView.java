package com.bulain.mybatis.pojo;

import java.util.Date;

import com.bulain.mybatis.model.JodaDemo;

public class JodaView extends JodaDemo{
    private static final long serialVersionUID = 5114363861135391354L;
    
    private Date xdateName;
    private Date xtimeName;
    private Date xdatetimeName;
    private Date xtimestampName;
    
    private String createdAtName;
    private String updatedAtName;
    
    public Date getXdateName() {
        return xdateName;
    }
    public void setXdateName(Date xdateName) {
        this.xdateName = xdateName;
    }
    public Date getXtimeName() {
        return xtimeName;
    }
    public void setXtimeName(Date xtimeName) {
        this.xtimeName = xtimeName;
    }
    public Date getXdatetimeName() {
        return xdatetimeName;
    }
    public void setXdatetimeName(Date xdatetimeName) {
        this.xdatetimeName = xdatetimeName;
    }
    public Date getXtimestampName() {
        return xtimestampName;
    }
    public void setXtimestampName(Date xtimestampName) {
        this.xtimestampName = xtimestampName;
    }
    public String getCreatedAtName() {
        return createdAtName;
    }
    public void setCreatedAtName(String createdAtName) {
        this.createdAtName = createdAtName;
    }
    public String getUpdatedAtName() {
        return updatedAtName;
    }
    public void setUpdatedAtName(String updatedAtName) {
        this.updatedAtName = updatedAtName;
    }
}
