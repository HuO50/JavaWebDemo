package com.service.impl;

import java.util.List;

import com.dao.INewsDao;
import com.dao.impl.NewsDao;
import com.model.News;
import com.service.ICommuService;

public class CommuService implements ICommuService{

	//get all community news
	@Override
	public List<News> getAllCommunityNews() {
		// TODO Auto-generated method stub
		INewsDao dao = new NewsDao();
		return dao.getCommuNews();
	}

	@Override
	public boolean addCommunity(News news) {
		// TODO Auto-generated method stub
		INewsDao dao = new NewsDao();
		return dao.addNews(news);
	}

	@Override
	public News getCommunity(int id) {
		// TODO Auto-generated method stub
		INewsDao dao = new NewsDao();
		return dao.getNews(id);
	}

	@Override
	public boolean delCommunity(int id) {
		// TODO Auto-generated method stub
		INewsDao dao = new NewsDao();
		return dao.deleteNews(id);
	}

	@Override
	public boolean modifyCommunity(int id, News news) {
		// TODO Auto-generated method stub
		INewsDao dao = new NewsDao();
		return dao.modifyNews(id, news);
	}

	@Override
	public List<News> getKindCommunity(String mark){
		INewsDao dao = new NewsDao();
		return dao.getKindNews(mark);
	}
}
