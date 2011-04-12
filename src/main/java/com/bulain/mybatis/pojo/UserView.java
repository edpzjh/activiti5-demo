package com.bulain.mybatis.pojo;

import com.bulain.mybatis.model.User;

public class UserView extends User{
	private static final long serialVersionUID = -2999199668190109782L;

	private String createdAtName;
	private String updatedAtName;
	
	public String getCreatedAtName() {
		return createdAtName;
	}
	public void setCreatedAtName(String createdAtName) {
		this.createdAtName = createdAtName;
	}
	public String getUpdatedAtName() {
		return updatedAtName;
	}
	public void setUpdatedAtName(String updatedAtName) {
		this.updatedAtName = updatedAtName;
	}
}