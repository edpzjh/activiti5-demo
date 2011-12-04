package com.bulain.activiti.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import com.bulain.activiti.model.Group;
import com.bulain.activiti.pojo.GroupSearch;
import com.bulain.activiti.pojo.GroupView;
import com.bulain.activiti.service.GroupService;
import com.bulain.common.controller.PageSupportActionSupport;

public class GroupAction extends PageSupportActionSupport {
    private static final String TEXT_GROUP_MODEL = "group.model";
    private static final long serialVersionUID = -4580561000078777884L;
    private static final Logger LOG = LoggerFactory.getLogger(GroupAction.class);

    private Integer id;
    private GroupSearch search;
    private Group group;
    private List<GroupView> listGroup;

    private transient GroupService groupService;

    public String list() {
        search = (GroupSearch) getSearchFromSession(GroupSearch.class, search);
        page = getPageFromSession();

        List<Group> list = groupService.page(search, page);
        listGroup = formatList(list);

        putSearchToSession(GroupSearch.class, search);
        putPageToSession();

        return SUCCESS;
    }

    public String newn() {
        group = new Group();
        return SUCCESS;
    }
    public String create() {
        try {
            groupService.insert(group);
            String msg = getText("info.create", new String[]{getText(TEXT_GROUP_MODEL)});
            addActionMessage(msg);
        } catch (Exception e) {
            LOG.error("create()", e);
            String msg = getText("error.create", new String[]{getText(TEXT_GROUP_MODEL)});
            addActionError(msg);
            return ERROR;
        }
        return SUCCESS;
    }
    public String show() {
        group = groupService.get(id);
        return SUCCESS;
    }
    public String edit() {
        group = groupService.get(id);
        return SUCCESS;
    }
    public String update() {
        try {
            groupService.update(group, true);
            String msg = getText("common.updateInfo", new String[]{TEXT_GROUP_MODEL});
            addActionMessage(msg);
        } catch (Exception e) {
            LOG.error("update()", e);
            String msg = getText("common.updateError", new String[]{TEXT_GROUP_MODEL});
            addActionError(msg);
            return ERROR;
        }
        return SUCCESS;
    }
    public String destroy() {
        try {
            groupService.delete(id);
            String msg = getText("common.deleteInfo", new String[]{TEXT_GROUP_MODEL});
            addActionMessage(msg);
        } catch (Exception e) {
            LOG.error("destroy()", e);
            String msg = getText("common.deleteError", new String[]{TEXT_GROUP_MODEL});
            addActionError(msg);
            return ERROR;
        }
        
        return SUCCESS;
    }

    public void prepareList() {
    }

    public void prepareUpdate() {
        if (id != null) {
            group = groupService.get(id);
        }
    }

    protected List<GroupView> formatList(List<Group> list) {
        List<GroupView> listView = new ArrayList<GroupView>();
        for (Group lgn : list) {
            listView.add(formatItem(lgn));
        }
        return listView;
    }

    protected GroupView formatItem(Group group) {
        GroupView view = new GroupView();
        BeanUtils.copyProperties(group, view);
        return view;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public GroupSearch getSearch() {
        return search;
    }

    public void setSearch(GroupSearch search) {
        this.search = search;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public List<GroupView> getListGroup() {
        return listGroup;
    }

    public void setListGroup(List<GroupView> listGroup) {
        this.listGroup = listGroup;
    }

    public void setGroupService(GroupService groupService) {
        this.groupService = groupService;
    }
}
