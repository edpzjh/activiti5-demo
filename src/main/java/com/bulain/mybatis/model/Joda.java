package com.bulain.mybatis.model;

import java.util.Date;

import com.bulain.common.model.Entity;

public class Joda implements Entity{
    private static final long serialVersionUID = -5752868790524850684L;
    
    private Integer id;
    private Date xdate;
    private Date xtime;
    private Date xdatetime;
    private Date xtimestamp;
    
    private String createdBy;
    private Date createdAt;
    private String updatedBy;
    private Date updatedAt;
    
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getXdate() {
        return xdate;
    }
    public void setXdate(Date xdate) {
        this.xdate = xdate;
    }
    public Date getXtime() {
        return xtime;
    }
    public void setXtime(Date xtime) {
        this.xtime = xtime;
    }
    public Date getXdatetime() {
        return xdatetime;
    }
    public void setXdatetime(Date xdatetime) {
        this.xdatetime = xdatetime;
    }
    public Date getXtimestamp() {
        return xtimestamp;
    }
    public void setXtimestamp(Date xtimestamp) {
        this.xtimestamp = xtimestamp;
    }
    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public String getUpdatedBy() {
        return updatedBy;
    }
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    
}
