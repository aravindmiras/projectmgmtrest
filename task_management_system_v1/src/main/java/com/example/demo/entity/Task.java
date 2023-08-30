package com.example.demo.entity;




import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tasktable1")
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String taskName;
	private String taskDescription;
	private String dueDate;
	private String assignedTo;
	private String status;
	private String priority;
	private int estHrs;
	private int actHrs;
	private String notes;
	
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(int id, String taskName, String taskDescription, String dueDate, String assignedTo, String status,
			String priority, int estHrs, int actHrs, String notes) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.dueDate = dueDate;
		this.assignedTo = assignedTo;
		this.status = status;
		this.priority = priority;
		this.estHrs = estHrs;
		this.actHrs = actHrs;
		this.notes = notes;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public int getEstHrs() {
		return estHrs;
	}
	public void setEstHrs(int estHrs) {
		this.estHrs = estHrs;
	}
	public int getActHrs() {
		return actHrs;
	}
	public void setActHrs(int actHrs) {
		this.actHrs = actHrs;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
	
}
