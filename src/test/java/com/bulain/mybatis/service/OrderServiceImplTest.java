package com.bulain.mybatis.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;

import com.bulain.common.page.Page;
import com.bulain.common.test.ServiceTestCase;
import com.bulain.mybatis.dao.OrderHisMapper;
import com.bulain.mybatis.dao.OrderMapper;
import com.bulain.mybatis.dao.OrderMasterMapper;
import com.bulain.mybatis.model.Order;
import com.bulain.mybatis.model.OrderHis;
import com.bulain.mybatis.model.OrderMaster;
import com.bulain.mybatis.pojo.OrderSearch;
import com.bulain.mybatis.test.TestConst;

public class OrderServiceImplTest extends ServiceTestCase {
    @Autowired
	private OrderService orderService;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderMasterMapper orderMasterMapper;
    @Autowired
    private OrderHisMapper orderHisMapper;
	
	@BeforeTransaction
	public void setUp() throws Exception {
	    super.setUpInitDB(TestConst.TEST_DATA_INIT_COMMON_XML);
		super.setUpDB("test-data/init_orders.xml");
	}

	@AfterTransaction
	public void tearDown() throws Exception {
		super.tearDownDB();
	}
	
	@Test
	public void testGet() {
		Order order = orderService.get(Integer.valueOf(102));
		assertNotNull(order);
		
		assertEquals("name_102", order.getName());
		assertEquals("note_102", order.getNote());
	}

	@Test
	public void testInsert() {
		Order order = new Order();
		order.setName("firstName");
		order.setNote("lastName");
		orderService.insert(order);
	}

	@Test
	public void testUpdate() {
		Order order = new Order();
		order.setId(Integer.valueOf(104));
		order.setName("firstName-updated");
		order.setNote("lastName-updated");
		orderService.update(order, true);
	}

	@Test
	public void testDelete() {
		orderService.delete(Integer.valueOf(101));
	}

	@Test
	public void testFind() {
		OrderSearch search = new OrderSearch();
		search.setName("name_page");
		List<Order> find = orderService.find(search);
		assertEquals(3, find.size());
	}

	@Test
	public void testCount() {
		OrderSearch search = new OrderSearch();
		search.setName("name_page");
		Long count = orderService.count(search);
		assertEquals(Long.valueOf(3), count);
	}

	@Test
	public void testPage() {
		OrderSearch search = new OrderSearch();
		search.setName("name_page");
		Page page = new Page();
		List<Order> listOrder = orderService.page(search, page );
		assertEquals(3, listOrder.size());
	}

	@Test
	public void testGetByWfId(){
		Order byWfId = orderService.getByWfId("wf_id_wf");
		assertNotNull(byWfId);
		assertEquals("name_wf", byWfId.getName());
		assertEquals("note_wf", byWfId.getNote());
		assertEquals("wf_id_wf", byWfId.getWfId());
	}
	
	@Test
	public void testFinish(){
	    //prepare
	    Order exist = orderMapper.selectByPrimaryKey(Integer.valueOf(102));
	    
	    //test
	    orderService.finish(Integer.valueOf(102));
	    
	    //assert order
	    Order order = orderMapper.selectByPrimaryKey(Integer.valueOf(102));
        assertNull(order);
        
        //prepare search
        OrderSearch search = new OrderSearch();
        search.setName(exist.getName());
        
        //assert order master
        List<OrderMaster> findMaster = orderMasterMapper.find(search);
        assertEquals(1, findMaster.size());
        
        //assert order history
        List<OrderHis> findHis = orderHisMapper.find(search);
        assertEquals(1, findHis.size());
        
	}
}
