package com.model;

import java.sql.Date;

public class News {

	public News(int id, String title, String author, Date time, String content, String mark, Boolean istop,
			int sortid) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.time = time;
		this.content = content;
		this.mark = mark;
		this.istop = istop;
		this.sortid = sortid;
	}



	private int id;
	private String title;
	private String author;
	private Date time;
	private String content;
	private String mark;
	private Boolean istop;
	private int sortid;
	
	public int getSortid() {
		return sortid;
	}

	public void setSortid(int sortid) {
		this.sortid = sortid;
	}


	public Boolean getIstop() {
		return istop;
	}

	public void setIstop(Boolean istop) {
		this.istop = istop;
	}

	public News() {
		super();
		// TODO Auto-generated constructor stub
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
		return "News [id=" + id + ", title=" + title + ", author=" + author + ", time=" + time + ", content=" + content
				+ ", mark=" + mark + ", istop=" + istop + ", sortid=" + sortid + "]";
	}
		
}
