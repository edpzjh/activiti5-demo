package com.bulain.mybatis.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;

import com.bulain.common.test.ServiceTestCase;
import com.bulain.mybatis.model.OrderMaster;
import com.bulain.mybatis.pojo.OrderSearch;

public class OrderMasterMapperTest extends ServiceTestCase {
    @Autowired
    private OrderMasterMapper orderMasterMapper;
    
    @BeforeTransaction
    public void setUp() throws Exception {
        super.setUpDB("test-data/init_order_masters.xml");
    }

    @AfterTransaction
    public void tearDown() throws Exception {
        super.tearDownDB();
    }

    @Test
    public void testSelectByName() {
        OrderMaster orderMaster = orderMasterMapper.selectByName("name_102");
        
        assertNotNull(orderMaster);
        
        assertEquals("name_102", orderMaster.getName());
        assertEquals("note_102", orderMaster.getNote());
    }

    @Test
    public void testFind() {
        OrderSearch search = new OrderSearch();
        search.setName("name_page");
        search.setEffDateFrom(null);
        search.setEffDateTo(null);
        List<OrderMaster> find = orderMasterMapper.find(search);
        assertEquals(3, find.size());
    }

    @Test
    public void testCount() {
        OrderSearch search = new OrderSearch();
        search.setName("name_page");
        search.setEffDateFrom(null);
        search.setEffDateTo(null);
        Long count = orderMasterMapper.count(search);
        assertEquals(Long.valueOf(3), count);
    }

    @Test
    public void testPage() {
        OrderSearch search = new OrderSearch();
        search.setName("name_page");
        search.setEffDateFrom(null);
        search.setEffDateTo(null);
        search.setLow(0);
        search.setHigh(20);
        List<OrderMaster> page = orderMasterMapper.page(search);
        assertEquals(3, page.size());
    }

    public void setOrderMasterMapper(OrderMasterMapper orderMasterMapper) {
        this.orderMasterMapper = orderMasterMapper;
    }

}