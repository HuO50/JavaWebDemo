package com.service.impl;

import java.util.List;

import com.dao.INewsDao;
import com.dao.impl.NewsDao;
import com.model.News;
import com.service.INewsService;

public class NewsService implements INewsService{

	@Override
	public List<News> getallNews() {
		// TODO Auto-generated method stub
		INewsDao dao = new NewsDao();
		return dao.getallNews();
	}

	@Override
	public boolean addNews(News news) {
		// TODO Auto-generated method stub
		INewsDao dao = new NewsDao();
		return dao.addNews(news);
	}

	@Override
	public News getNews(int id) {
		// TODO Auto-generated method stub
		INewsDao dao = new NewsDao();
		return dao.getNews(id);
	}

	@Override
	public boolean deleteNews(int id) {
		// TODO Auto-generated method stub
		INewsDao dao = new NewsDao();
		return dao.deleteNews(id);
	}

	@Override
	public boolean modifyNews(int id, News news) {
		// TODO Auto-generated method stub
		INewsDao dao = new NewsDao();
		return dao.modifyNews(id, news);
	}

	@Override
	public List<News> getKindNews(String mark){
		INewsDao dao = new NewsDao();
		return dao.getKindNews(mark);
	}
	
	
}
