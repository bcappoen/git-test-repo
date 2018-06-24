package com.bcn.model;

public class User {

	private String id;

	private String name;

	private String fisrtName;

	public User() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", fisrtName=" + fisrtName + "]";
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
