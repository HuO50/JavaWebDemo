package com.work.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.StyledDocument;

import org.junit.Test;

import com.dao.ILinkDao;
import com.dao.IMemberDao;
import com.dao.INewsDao;
import com.dao.IPictureDao;
import com.dao.impl.LinkDao;
import com.dao.impl.MemberDao;
import com.dao.impl.NewsDao;
import com.dao.impl.PictureDao;
import com.model.Link;
import com.model.Member;
import com.model.News;
import com.model.Picture;
import com.model.Rule;
import com.mysql.jdbc.Connection;
import com.service.ICommuService;
import com.service.ILinkService;
import com.service.IMemberService;
import com.service.INewsService;
import com.service.IResultService;
import com.service.IRuleService;
import com.service.impl.CommuService;
import com.service.impl.LinkService;
import com.service.impl.MemberService;
import com.service.impl.NewsService;
import com.service.impl.ResultService;
import com.service.impl.RuleService;
import com.util.DBUtil;

public class test {

	@Test
	public void test() {
		INewsService iNewsService = new NewsService();
		List<News> news = iNewsService.getKindNews("学术动态");
		Collections.reverse(news);
		//判断news是否置顶
		//挑选置顶news,置顶文章是根据日期判断
		List<News> topNews = new ArrayList<News>();
		List<News> unTopNews = new ArrayList<News>();
		for(Iterator iterator = news.iterator();iterator.hasNext();) {
			News newsTemp = new News();
			newsTemp = (News) iterator.next();
			System.out.println(newsTemp.getId());
			if (newsTemp.getIstop()) {
				topNews.add(newsTemp);
			} else {
				unTopNews.add(newsTemp);
			}
		}
		
		
	}

}
