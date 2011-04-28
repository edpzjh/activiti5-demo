package com.bulain.mybatis.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;

import com.bulain.common.page.Page;
import com.bulain.common.test.ServiceTestCase;
import com.bulain.common.util.SystemClock;
import com.bulain.mybatis.model.JodaDemo;
import com.bulain.mybatis.pojo.JodaSearch;

public class JodaServiceTest extends ServiceTestCase {
    @Autowired
    private JodaService jodaService;
    
    @BeforeTransaction
    public void setUp() throws Exception {
        super.setUpDB("test-data/init_jodas.xml");
        DateTime dateTime = new DateTime(2010, 4, 3, 8, 0, 0, 0);
        DateTimeUtils.setCurrentMillisFixed(dateTime.getMillis());
    }

    @AfterTransaction
    public void tearDown() throws Exception {
        super.tearDownDB();
        DateTimeUtils.setCurrentMillisSystem();
    }
    
    @Test
    public void testDelete() {
        jodaService.delete(Integer.valueOf(101));
    }

    @Test
    public void testInsert() {
        JodaDemo record = new JodaDemo();
        Date xdate = SystemClock.getDate();
        record.setXdate(xdate);
        record.setXtime(xdate);
        record.setXdatetime(xdate);
        record.setXtimestamp(xdate);
        jodaService.insert(record);
    }

    @Test
    public void testGet() {
        JodaDemo selectByPrimaryKey = jodaService.get(Integer.valueOf(102));
        assertNotNull(selectByPrimaryKey);
        
        DateTime xdate = new DateTime(2010, 4, 3, 0, 0, 0, 0);
        DateTime xtime = new DateTime(1970, 1, 1, 8, 0, 0, 0);
        DateTime xdatetime = new DateTime(2010, 4, 3, 8, 0, 0, 0);
        DateTime xtimestamp = new DateTime(2010, 4, 3, 8, 0, 0, 0);
        
        assertEquals(xdate.toDate(), selectByPrimaryKey.getXdate());
        assertEquals(xtime.toDate(), selectByPrimaryKey.getXtime());
        assertEquals(xdatetime.toDate(), selectByPrimaryKey.getXdatetime());
        assertEquals(xtimestamp.toDate(), selectByPrimaryKey.getXtimestamp());
    }

    @Test
    public void testUpdate() {
        JodaDemo record = new JodaDemo();
        record.setId(Integer.valueOf(103));
        DateTime dateTime = new DateTime(2011, 4, 3, 9, 0, 0, 0);
        record.setXdate(dateTime.toDate());
        record.setXtime(dateTime.toDate());
        record.setXdatetime(dateTime.toDate());
        record.setXtimestamp(dateTime.toDate());
        jodaService.update(record, true);
    }

    @Test
    public void testFind(){
        JodaSearch search = new JodaSearch();
        DateTime dateTime = new DateTime(2010, 4, 4, 0, 0, 0, 0);
        search.setXdate(dateTime.toDate());
        List<JodaDemo> find = jodaService.find(search);
        assertEquals(3, find.size());
    }
    
    @Test
    public void testCount(){
        JodaSearch search = new JodaSearch();
        DateTime dateTime = new DateTime(2010, 4, 4, 0, 0, 0, 0);
        search.setXdate(dateTime.toDate());
        Long count = jodaService.count(search);
        assertEquals(Long.valueOf(3), count);
    }
    
    @Test
    public void testPage(){
        JodaSearch search = new JodaSearch();
        DateTime dateTime = new DateTime(2010, 4, 4, 0, 0, 0, 0);
        search.setXdate(dateTime.toDate());
        Page page = new Page();
        List<JodaDemo> listUser = jodaService.page(search, page);
        assertEquals(3, listUser.size());
    }

}
