package com.gotprint.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "note")
public class Note {
	
	@ManyToOne
	@JoinColumn(name="userEmail")
	private User user;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "note")
	private String note;
	
	@Column(name = "timeCreated")
	private Date timeCreated;
	
	@Column(name = "lastUpdated")
	private Date lastUpdated;

	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getTimeCreated() {
		return timeCreated;
	}
	public void setTimeCreated(Date timeCreated) {
		this.timeCreated = timeCreated;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
	@Override
	public String toString() {
		return "Note [userEmail=" + user + ", title=" + title + ", note="
				+ note + ", timeCreated=" + timeCreated + ", lastUpdated="
				+ lastUpdated + "]";
	}
	
}
