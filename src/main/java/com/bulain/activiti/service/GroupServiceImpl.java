package com.bulain.activiti.service;

import com.bulain.activiti.dao.GroupMapper;
import com.bulain.activiti.model.Group;
import com.bulain.activiti.pojo.GroupSearch;
import com.bulain.common.dao.PagedMapper;
import com.bulain.common.service.PagedServiceImpl;

public class GroupServiceImpl extends PagedServiceImpl<GroupSearch, Group> implements GroupService {
    private GroupMapper groupMapper;

    protected PagedMapper<GroupSearch, Group> getPagedMapper() {
        return groupMapper;
    }

    public void setGroupMapper(GroupMapper groupMapper) {
        this.groupMapper = groupMapper;
    }
}
