package com.kalle.tasktrackerapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Task {
	@Id
	private int id;
	private boolean reminder;
	private String text;
	private String month;
	private String day;
	private String year;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isReminder() {
		return reminder;
	}
	public void setReminder(boolean reminder) {
		this.reminder = reminder;
	}
	public String getText() {
		return text;
	}
	public void setTask(String text) {
		this.text = text;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", reminder=" + reminder + ", task=" + text + ", month=" + month + ", day=" + day
				+ ", year=" + year + "]";
	}
	
	
}
