package com.gotprint.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "note")
public class User {
	
	@Id
	@Column(name = "userEmail")
	private String userEmail;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "timeCreated")
	private Date timeCreated;
	
	@Column(name = "lastUpdated")
	private Date lastUpdatedTime;
	
	@OneToMany(mappedBy="user")
	private Set<Note> note;
	
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getTimeCreated() {
		return timeCreated;
	}
	public void setTimeCreated(Date timeCreated) {
		this.timeCreated = timeCreated;
	}
	public Date getLastUpdatedTime() {
		return lastUpdatedTime;
	}
	public void setLastUpdatedTime(Date lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	
	

}
