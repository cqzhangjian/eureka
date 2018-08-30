package org.zj.commons.bean;

import java.io.Serializable;
import java.util.Date;

public class PersonBean implements Serializable {

	private Long id;
	private String username;
	private Date birthday;
	
	
	public PersonBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonBean(Long id, String username, Date birthday) {
		super();
		this.id = id;
		this.username = username;
		this.birthday = birthday;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "PersonBean [id=" + id + ", username=" + username + ", birthday=" + birthday + "]";
	}
}
