package com.model;

import java.sql.Date;

public class News {

	private int id;
	private String title;
	private String author;
	private Date time;
	private String content;
	private String mark;
	
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}

	public News(int id, String title, String author, Date time, String content, String mark) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.time = time;
		this.content = content;
		this.mark = mark;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	


	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", mark=" + mark + ", author=" + author
				+ ", time=" + time + ", content=" + content + "]";
	}
		
}
