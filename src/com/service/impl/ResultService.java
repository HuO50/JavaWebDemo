package com.service.impl;

import java.util.List;

import com.dao.INewsDao;
import com.dao.impl.NewsDao;
import com.model.News;
import com.service.IResultService;

public class ResultService implements IResultService{

	//get all community news
	@Override
	public List<News> getAllResultNews() {
		// TODO Auto-generated method stub
		INewsDao dao = new NewsDao();
		return dao.getResultNews();
	}

	@Override
	public boolean addResult(News news) {
		// TODO Auto-generated method stub
		INewsDao dao = new NewsDao();
		return dao.addNews(news);
	}

	@Override
	public News getResult(int id) {
		// TODO Auto-generated method stub
		INewsDao dao = new NewsDao();
		return dao.getNews(id);
	}

	@Override
	public boolean delResult(int id) {
		// TODO Auto-generated method stub
		INewsDao dao = new NewsDao();
		return dao.deleteNews(id);
	}

	@Override
	public boolean modifyResult(int id, News news) {
		// TODO Auto-generated method stub
		INewsDao dao = new NewsDao();
		return dao.modifyNews(id, news);
	}

	@Override
	public List<News> getKindResult(String mark){
		INewsDao dao = new NewsDao();
		return dao.getKindNews(mark);
	}
}
