package com.work.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.model.News;
import com.model.Rule;
import com.mysql.jdbc.Connection;
import com.service.ICommuService;
import com.service.IResultService;
import com.service.IRuleService;
import com.service.impl.CommuService;
import com.service.impl.NewsService;
import com.service.impl.ResultService;
import com.service.impl.RuleService;
import com.util.DBUtil;

public class test {

	@Test
	public void test() {
//		ICommuService commuService = new CommuService();
//		NewsService newsService = new NewsService();
//		CommuService commuService = new CommuService();
		
//		List<News> news = new ArrayList<News>(); 
//		IResultService iResultService = new ResultService();
//		news = iResultService.getAllResultNews();
//		System.out.println(news.size());
//		for(int i = 0; i < news.size(); i++) {
//			System.out.println(news.get(i).toString());
//			
//		}
		
		Rule rule = new Rule();
		IRuleService iRuleService =  new RuleService();
		rule = iRuleService.getRule(1);
		System.out.println(rule.toString());
	//	rule.setContract("hehe");
	//	rule.setRecruit("haha");
	//	rule.setId(1);
	//	System.out.println(rule.toString());
	//	boolean result = iRuleService.setRule(rule,1);
	//	System.out.println(result);
	}

}
