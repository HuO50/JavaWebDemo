package com.model;

public class Link {

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Link [id=" + id + ", link=" + link + ", name=" + name + "]";
	}
	private int id;
	private String link;
	private String name;
	
}
