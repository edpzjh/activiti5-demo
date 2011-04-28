package com.bulain.mybatis.service;

import com.bulain.common.dao.PagedMapper;
import com.bulain.common.service.PagedServiceImpl;
import com.bulain.mybatis.dao.JodaDemoMapper;
import com.bulain.mybatis.model.JodaDemo;
import com.bulain.mybatis.pojo.JodaSearch;

public class JodaServiceImpl extends PagedServiceImpl<JodaSearch, JodaDemo> implements JodaService{
    private JodaDemoMapper jodaDemoMapper;
    
    public void setJodaDemoMapper(JodaDemoMapper jodaDemoMapper) {
        this.jodaDemoMapper = jodaDemoMapper;
    }
    @Override
    public PagedMapper<JodaSearch, JodaDemo> getPagedMapper() {
        return jodaDemoMapper;
    }
}
