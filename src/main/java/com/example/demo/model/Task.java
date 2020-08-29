package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Task {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@NotNull
	@Size(min=2, max= 255)
	@NotEmpty
	String title;
	@NotNull
	@Size(min=2, max= 10000)
	@NotEmpty
	String description;
	@NotNull
	@NotEmpty
	String scheduled_date;
	@NotNull
	@NotEmpty
	String complete_date;
	int complete_flg;
	@NotNull
	int priority;
	int delete_flg;
	String created_at;
	String updated_at;
	
	public Task() {
		super();
	}

	public Task(int id, String title, String description, String scheduled_date, String complete_date, 
			int complete_flg, int priority, int delete_flg,	String created_at, String updated_at) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.scheduled_date = scheduled_date;
		this.complete_date = complete_date;
		this.complete_flg = complete_flg;
		this.priority = priority;
		this.delete_flg = delete_flg;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getScheduled_date() {
		return scheduled_date;
	}
	public void setScheduled_date(String scheduled_date) {
		this.scheduled_date = scheduled_date;
	}
	public String getComplete_date() {
		return complete_date;
	}
	public void setComplete_date(String complete_date) {
		this.complete_date = complete_date;
	}
	public int getComplete_flg() {
		return complete_flg;
	}
	public void setComplete_flg(int complete_flg) {
		this.complete_flg = complete_flg;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getDelete_flg() {
		return delete_flg;
	}
	public void setDelete_flg(int delete_flg) {
		this.delete_flg = delete_flg;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
}
