package com.bulain.mybatis.service;

import com.bulain.common.dao.PagedMapper;
import com.bulain.common.service.PagedServiceImpl;
import com.bulain.mybatis.dao.JodaMapper;
import com.bulain.mybatis.model.Joda;
import com.bulain.mybatis.pojo.JodaSearch;

public class JodaServiceImpl extends PagedServiceImpl<Joda, JodaSearch> implements JodaService {
    private JodaMapper jodaMapper;

    public void setJodaMapper(JodaMapper jodaMapper) {
        this.jodaMapper = jodaMapper;
    }
    @Override
    public PagedMapper<Joda, JodaSearch> getPagedMapper() {
        return jodaMapper;
    }
}
