package com.service;

import java.util.List;

import com.model.News;

public interface ICommuService {
	
	public List<News> getAllCommunityNews();
	
	public boolean addCommunity(News news);
	
	public News getCommunity(int id);
	
	public boolean delCommunity(int id);
	
	public boolean modifyCommunity(int id, News news);
	
	public List<News> getKindCommunity(String mark);


}
