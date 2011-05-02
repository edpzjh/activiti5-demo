package com.bulain.mybatis.pojo;

import com.bulain.mybatis.model.Joda;

public class JodaView extends Joda{
    private static final long serialVersionUID = 5114363861135391354L;
    
    private String xdateName;
    private String xtimeName;
    private String xdatetimeName;
    private String xtimestampName;
    
    private String createdAtName;
    private String updatedAtName;
    
    public String getXdateName() {
        return xdateName;
    }
    public void setXdateName(String xdateName) {
        this.xdateName = xdateName;
    }
    public String getXtimeName() {
        return xtimeName;
    }
    public void setXtimeName(String xtimeName) {
        this.xtimeName = xtimeName;
    }
    public String getXdatetimeName() {
        return xdatetimeName;
    }
    public void setXdatetimeName(String xdatetimeName) {
        this.xdatetimeName = xdatetimeName;
    }
    public String getXtimestampName() {
        return xtimestampName;
    }
    public void setXtimestampName(String xtimestampName) {
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
