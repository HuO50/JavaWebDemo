package com.work.test;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.model.News;
import com.mysql.jdbc.Connection;
import com.service.impl.NewsService;
import com.util.DBUtil;

public class test {

	@Test
	public void test() {
		NewsService newsService = new NewsService();
		List<News> news = newsService.getKindNews("学术动态");
		for (int i = 0; i < news.size(); i++) {
			news.get(i).toString();
		}
	}

}
