package com.example.demo.entity;




import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="projectname")
public class Projects {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int projectid;
	private String projectname;
	private String startdate;
	private String enddate;
	private String status;
	private String descriptions;
	
	
	public Projects(int projectid, String projectname, String startdate, String enddate, String status,
			String descriptions) {
		super();
		this.projectid = projectid;
		this.projectname = projectname;
		this.startdate = startdate;
		this.enddate = enddate;
		this.status = status;
		this.descriptions = descriptions;
	}
	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	}
	

