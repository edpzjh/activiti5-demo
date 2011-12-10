package com.bulain.activiti.service;

import com.bulain.activiti.dao.AccountMapper;
import com.bulain.activiti.model.Account;
import com.bulain.activiti.pojo.AccountSearch;
import com.bulain.common.dao.PagedMapper;
import com.bulain.common.service.PagedServiceImpl;

public class AccountServiceImpl extends PagedServiceImpl<AccountSearch, Account> implements AccountService {
    private AccountMapper accountMapper;
    
    @Override
    protected PagedMapper<AccountSearch, Account> getPagedMapper() {
        return accountMapper;
    }

    public void setAccountMapper(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

}