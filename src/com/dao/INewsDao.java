package com.dao;

import java.util.List;

import com.model.News;

public interface INewsDao {

	public List<News> getallNews();
	
	public News getNews(int id);
	
	public boolean addNews(News news);
	
	public boolean modifyNews(int id, News news);
	
	public boolean deleteNews(int id);

	public List<News> getKindNews(String mark);
}
