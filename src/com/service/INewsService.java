package com.service;

import java.util.List;

import com.model.News;

public interface INewsService {

	public List<News> getallNews();
	
	public boolean addNews(News news);
	
	public News getNews(int id);
	
	public boolean deleteNews(int id);
	
	public boolean modifyNews(int id, News news);
	
	public List<News> getKindNews(String mark);
}
