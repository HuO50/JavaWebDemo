package com.service;

import java.util.List;

import com.model.News;

public interface IResultService {
	
	public List<News> getAllResultNews();
	
	public boolean addResult(News news);
	
	public News getResult(int id);
	
	public boolean delResult(int id);
	
	public boolean modifyResult(int id, News news);
	
	public List<News> getKindResult(String mark);
	

}
