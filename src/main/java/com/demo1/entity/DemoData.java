package com.demo1.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table
@Entity
public class DemoData {

	
	
	private Integer id;
	private String name;
	private String school;
	private String mobile;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
