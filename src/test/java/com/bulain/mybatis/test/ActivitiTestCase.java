package com.bulain.mybatis.test;

import java.util.List;

import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.ManagementService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Deployment;

import com.bulain.common.test.Struts2TestCase;

public abstract class ActivitiTestCase extends Struts2TestCase {
	
	protected RepositoryService repositoryService;
	protected RuntimeService runtimeService;
	protected TaskService taskService;
	protected HistoryService historyService;
	protected IdentityService identityService;
	protected ManagementService managementService;
	
	protected void setUpActiviti() throws Exception {
		repositoryService = (RepositoryService) applicationContext.getBean("repositoryService");
		runtimeService = (RuntimeService) applicationContext.getBean("runtimeService");
	    taskService = (TaskService) applicationContext.getBean("taskService");
	    historyService = (HistoryService) applicationContext.getBean("historyService");
	    identityService = (IdentityService) applicationContext.getBean("identityService");
	    managementService = (ManagementService) applicationContext.getBean("managementService");
	}
	
	protected void setUpCleanActiviti() throws Exception {
		if(repositoryService==null) setUpActiviti();
		List<Deployment> listDeployment = repositoryService.createDeploymentQuery().list();
	    for(Deployment deployment : listDeployment){
	    	repositoryService.deleteDeployment(deployment.getId(), true);
	    }
	}
	
	protected void tearDownJbpm() throws Exception {}
}
