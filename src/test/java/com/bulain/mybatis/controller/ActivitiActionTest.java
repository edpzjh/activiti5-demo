package com.bulain.mybatis.controller;

import java.util.List;

import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;

import com.bulain.common.test.ActivitiTestCase;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionProxy;

public class ActivitiActionTest extends ActivitiTestCase {
	public static void main(String[] args) {
		junit.textui.TestRunner.run(ActivitiActionTest.class);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		super.setUpCleanActiviti();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testWorkflow() throws Exception {
		initServletMockObjects();
		ActionProxy proxy = getActionProxy("/activiti/deploy");
		ActivitiAction activitiAction = (ActivitiAction) proxy.getAction();
		String result = proxy.execute();
		assertEquals(Action.SUCCESS, result);
		
		initServletMockObjects();
		proxy = getActionProxy("/activiti/list");
		activitiAction = (ActivitiAction) proxy.getAction();
		result = proxy.execute();
		assertEquals(Action.SUCCESS, result);
		
		List<ProcessDefinition> listProcessDefinition = activitiAction.getListProcessDefinition();
		List<ProcessInstance> listProcessInstance = activitiAction.getListProcessInstance();
		List<Task> listTask = activitiAction.getListPersonTask();
		
		assertEquals(1, listProcessDefinition.size());
		assertEquals(0, listProcessInstance.size());
		assertEquals(0, listTask.size());
		
		String processDefinitionId = listProcessDefinition.get(0).getId();
		
		initServletMockObjects();
		request.setParameter("processDefinitionId", processDefinitionId);
		proxy = getActionProxy("/activiti/start");
		activitiAction = (ActivitiAction) proxy.getAction();
		result = proxy.execute();
		assertEquals(Action.SUCCESS, result);
		
		initServletMockObjects();
		proxy = getActionProxy("/activiti/list");
		activitiAction = (ActivitiAction) proxy.getAction();
		result = proxy.execute();
		assertEquals(Action.SUCCESS, result);
		
		assertEquals(1, activitiAction.getListProcessInstance().size());
		String executionId = activitiAction.getListProcessInstance().get(0).getId();
		
		initServletMockObjects();
		request.setParameter("executionId", executionId);
		proxy = getActionProxy("/activiti/view");
		activitiAction = (ActivitiAction) proxy.getAction();
		result = proxy.execute();
		assertEquals(Action.SUCCESS, result);
		
		initServletMockObjects();
		proxy = getActionProxy("/activiti/list");
		activitiAction = (ActivitiAction) proxy.getAction();
		result = proxy.execute();
		assertEquals(Action.SUCCESS, result);
		
		listProcessDefinition = activitiAction.getListProcessDefinition();
		listProcessInstance = activitiAction.getListProcessInstance();
		listTask = activitiAction.getListPersonTask();
		
		assertEquals(1, listProcessDefinition.size());
		assertEquals(1, listProcessInstance.size());
		assertEquals(0, listTask.size());
		
		String deploymentId = listProcessDefinition.get(0).getDeploymentId();
		
		initServletMockObjects();
		request.setParameter("deploymentId", deploymentId);
		proxy = getActionProxy("/activiti/destroy");
		activitiAction = (ActivitiAction) proxy.getAction();
		result = proxy.execute();
		assertEquals(Action.SUCCESS, result);
		
		initServletMockObjects();
		proxy = getActionProxy("/activiti/list");
		activitiAction = (ActivitiAction) proxy.getAction();
		result = proxy.execute();
		assertEquals(Action.SUCCESS, result);
		
		listProcessDefinition = activitiAction.getListProcessDefinition();
		listProcessInstance = activitiAction.getListProcessInstance();
		listTask = activitiAction.getListPersonTask();
		
		assertEquals(0, listProcessDefinition.size());
		assertEquals(0, listProcessInstance.size());
		assertEquals(0, listTask.size());
	} 
}
