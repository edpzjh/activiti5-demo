package com.bulain.activiti.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.bulain.activiti.model.Group;
import com.bulain.activiti.pojo.GroupSearch;
import com.bulain.common.dataset.DataSet;
import com.bulain.common.page.Page;
import com.bulain.common.test.ServiceTestCase;

@DataSet(file = "test-data/init_groups.xml")
public class GroupServiceTest extends ServiceTestCase {
    @Autowired
    private GroupService groupService;

    @Test
    public void testGet() {
        Group group = groupService.get(Integer.valueOf(102));
        assertNotNull(group);

        assertEquals("name_102", group.getName());
        assertEquals("type_102", group.getType());
    }

    @Test
    public void testInsert() {
        Group group = new Group();
        group.setName("name");
        group.setType("type");
        groupService.insert(group);
    }

    @Test
    public void testUpdate() {
        Group group = new Group();
        group.setId(Integer.valueOf(104));
        group.setName("name-updated");
        group.setType("type-updated");
        groupService.update(group, true);
    }

    @Test
    public void testDelete() {
        groupService.delete(Integer.valueOf(101));
    }

    @Test
    public void testFind() {
        GroupSearch search = new GroupSearch();
        search.setName("name_page");
        search.setType("type_page");
        List<Group> find = groupService.find(search);
        assertEquals(3, find.size());
    }

    @Test
    public void testCount() {
        GroupSearch search = new GroupSearch();
        search.setName("name_page");
        search.setType("type_page");
        Long count = groupService.count(search);
        assertEquals(Long.valueOf(3), count);
    }

    @Test
    public void testPage() {
        GroupSearch search = new GroupSearch();
        search.setName("name_page");
        search.setType("type_page");
        Page page = new Page();
        List<Group> listGroup = groupService.page(search, page);
        assertEquals(3, listGroup.size());
    }

}
