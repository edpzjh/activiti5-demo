package com.bulain.activiti.controller;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.bulain.activiti.model.User;
import com.bulain.activiti.pojo.UserView;
import com.bulain.common.dataset.DataSet;
import com.bulain.common.test.ActionTestCase;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionProxy;

@DataSet(file = "test-data/init_users.xml")
public class UserActionTest extends ActionTestCase {

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testList() throws Exception {
        initServletMockObjects();
        request.setParameter("search.firstName", "first_name_page");
        request.setParameter("search.lastName", "last_name_page");

        ActionProxy proxy = getActionProxy("/user/list");
        UserAction userAction = (UserAction) proxy.getAction();
        String result = proxy.execute();
        assertEquals(Action.SUCCESS, result);

        List<UserView> listLogin = userAction.getListLogin();
        assertEquals(3, listLogin.size());
    }

    @Test
    public void testNewn() throws Exception {
        initServletMockObjects();

        ActionProxy proxy = getActionProxy("/user/new");
        UserAction userAction = (UserAction) proxy.getAction();
        String result = proxy.execute();
        assertEquals(Action.SUCCESS, result);

        User user = userAction.getUser();
        assertNotNull(user);
    }

    @Test
    public void testCreate() throws Exception {
        initServletMockObjects();
        request.setParameter("user.firstName", "first_name");
        request.setParameter("user.lastName", "last_name");

        ActionProxy proxy = getActionProxy("/user/create");
        proxy.getAction();
        String result = proxy.execute();
        assertEquals(Action.SUCCESS, result);
    }

    @Test
    public void testShow() throws Exception {
        initServletMockObjects();
        request.setParameter("id", "102");

        ActionProxy proxy = getActionProxy("/user/show");
        UserAction userAction = (UserAction) proxy.getAction();
        String result = proxy.execute();
        assertEquals(Action.SUCCESS, result);

        User user = userAction.getUser();
        assertNotNull(user);
        assertEquals("first_name_102", user.getFirstName());
        assertEquals("last_name_102", user.getLastName());
    }

    @Test
    public void testEdit() throws Exception {
        initServletMockObjects();
        request.setParameter("id", "102");

        ActionProxy proxy = getActionProxy("/user/edit");
        UserAction userAction = (UserAction) proxy.getAction();
        String result = proxy.execute();
        assertEquals(Action.SUCCESS, result);

        User user = userAction.getUser();
        assertNotNull(user);
        assertEquals("first_name_102", user.getFirstName());
        assertEquals("last_name_102", user.getLastName());
    }

    @Test
    public void testUpdate() throws Exception {
        initServletMockObjects();
        request.setParameter("id", "103");
        request.setParameter("user.firstName", "first_name_updated");
        request.setParameter("user.lastName", "last_name_updated");

        ActionProxy proxy = getActionProxy("/user/update");
        proxy.getAction();
        String result = proxy.execute();
        assertEquals(Action.SUCCESS, result);
    }

    @Test
    public void testDestroy() throws Exception {
        initServletMockObjects();
        request.setParameter("id", "101");

        ActionProxy proxy = getActionProxy("/user/destroy");
        proxy.getAction();
        String result = proxy.execute();
        assertEquals(Action.SUCCESS, result);
    }

}
