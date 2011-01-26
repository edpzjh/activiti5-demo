package com.bulain.mybatis.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;

import com.bulain.mybatis.test.ActivitiTestCase;

public class ActivitiTest extends ActivitiTestCase {
	private String deploymentId;
	
	public static void main(String[] args){
		junit.textui.TestRunner.run(ActivitiTest.class);
	}	  
	
	protected void setUp() throws Exception {
	    super.setUp();
	    super.setUpActiviti();
	    deploymentId = repositoryService.createDeployment()
	        .addClasspathResource("diagrams/order.bpmn20.xml")
	        .deploy().getId();
	}
	
	protected void tearDown() throws Exception {
	    repositoryService.deleteDeployment(deploymentId, true);
	    super.tearDownJbpm();
	    super.tearDown();
	}
	
	public void testOrderApprove() {
	    Map<String, Object> variables = new HashMap<String, Object>(); 
	    variables.put("owner", "johndoe");
	    ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("order", variables);
	    String pid = processInstance.getId();

	    List<Task> taskList = taskService.createTaskQuery().taskCandidateUser("johndoe").list();
	    assertEquals(1, taskList.size());
	    Task task = taskList.get(0);
	    assertEquals("request", task.getName());
	    
	    taskService.claim(task.getId(), "johndoe");
	    task = taskService.createTaskQuery().taskAssignee("johndoe").singleResult();
	    assertEquals("request", task.getName());
	    assertEquals("johndoe", task.getAssignee());
	    

	    taskService.complete(task.getId());
	    
	    taskList = taskService.createTaskQuery().taskCandidateUser("johndoe").list();
	    assertEquals(0, taskList.size());
	    
	    taskList = taskService.createTaskQuery().taskCandidateUser("bulain").list();
	    assertEquals(1, taskList.size());

	    task = taskList.get(0);
	    assertEquals("approve", task.getName());
	    taskService.claim(task.getId(), "bulain");

	    task = taskService.createTaskQuery().taskAssignee("bulain").singleResult();
	    assertEquals("approve", task.getName());
	    assertEquals("bulain", task.getAssignee());

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("action", "approve");
		taskService.complete(task.getId(), params);
	    
	    processInstance = runtimeService.createProcessInstanceQuery().processInstanceId(pid).singleResult();
	    assertNull(processInstance);
	  }
	
	public void testOrderReject() {
	    Map<String, Object> variables = new HashMap<String, Object>(); 
	    variables.put("owner", "johndoe");
	    ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("order", variables);
	    String pid = processInstance.getId();

	    List<Task> taskList = taskService.createTaskQuery().taskCandidateUser("johndoe").list();
	    assertEquals(1, taskList.size());
	    Task task = taskList.get(0);
	    assertEquals("request", task.getName());
	    
	    taskService.claim(task.getId(), "johndoe");
	    task = taskService.createTaskQuery().taskAssignee("johndoe").singleResult();
	    assertEquals("request", task.getName());
	    assertEquals("johndoe", task.getAssignee());
	    
	    taskService.complete(task.getId());
	    
	    taskList = taskService.createTaskQuery().taskCandidateUser("johndoe").list();
	    assertEquals(0, taskList.size());
	    
	    taskList = taskService.createTaskQuery().taskCandidateUser("bulain").list();
	    assertEquals(1, taskList.size());

	    task = taskList.get(0);
	    assertEquals("approve", task.getName());
	    
	    taskService.claim(task.getId(), "bulain");
	    task = taskService.createTaskQuery().taskAssignee("bulain").singleResult();
	    assertEquals("approve", task.getName());
	    assertEquals("bulain", task.getAssignee());

	    Map<String, Object> params = new HashMap<String, Object>();
	    params.put("action", "reject");
		taskService.complete(task.getId(), params );
	    
	    taskList = taskService.createTaskQuery().taskCandidateUser("johndoe").list();
	    assertEquals(1, taskList.size());
	    task = taskList.get(0);
	    assertEquals("request", task.getName());
	    
	    taskService.claim(task.getId(), "johndoe");
	    task = taskService.createTaskQuery().taskAssignee("johndoe").singleResult();
	    assertEquals("request", task.getName());
	    assertEquals("johndoe", task.getAssignee());
	    
	    taskService.complete(task.getId());
	    
	    taskList = taskService.createTaskQuery().taskCandidateUser("johndoe").list();
	    assertEquals(0, taskList.size());
	    
	    taskList = taskService.createTaskQuery().taskCandidateUser("bulain").list();
	    assertEquals(1, taskList.size());

	    task = taskList.get(0);
	    assertEquals("approve", task.getName());
	    
	    taskService.claim(task.getId(), "bulain");
	    task = taskService.createTaskQuery().taskAssignee("bulain").singleResult();
	    assertEquals("approve", task.getName());
	    assertEquals("bulain", task.getAssignee());

	    params.clear();
	    params.put("action", "approve");
	    taskService.complete(task.getId(), params);
	    
	    processInstance = runtimeService.createProcessInstanceQuery().processInstanceId(pid).singleResult();
	    assertNull(processInstance);
	  }
}
