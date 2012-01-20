package com.bulain.mybatis.dao;

import com.bulain.common.dao.PagedMapper;
import com.bulain.mybatis.model.OrderMaster;
import com.bulain.mybatis.pojo.OrderSearch;

public interface OrderMasterMapper extends PagedMapper<OrderMaster, OrderSearch> {
    OrderMaster selectByName(String name);
}