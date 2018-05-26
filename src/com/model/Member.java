package com.model;

public class Member {
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getBelong() {
		return belong;
	}
	public void setBelong(String belong) {
		this.belong = belong;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", resume=" + resume + ", belong=" + belong + "]";
	}
	
	private int id;
	private String name;
	private String resume;
	private String belong;

}
