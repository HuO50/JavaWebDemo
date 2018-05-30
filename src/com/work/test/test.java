package com.work.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
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
		
//		IPictureDao iPictureDao = new PictureDao();
//		Picture picturereceive = iPictureDao.getPicture(1);
//		System.out.println(picturereceive.toString());
//		Picture picture = new Picture();
//		picture.setId(1);
//		picture.setLocation("/upload");
//		picture.setName("1.jpg");
//		iPictureDao.setPicture(picture, 1);
//		picturereceive = iPictureDao.getPicture(1);
//		System.out.println(picturereceive.toString());
		
//		ILinkService service = new LinkService();
//		
//		
//		List<Link> list = new ArrayList<Link>();
//	
//		
//		list = service.getAllLink();
//		
//		System.out.println(list.size());
//		System.out.println(list.get(1));
		
		
//		ILinkDao dao = new LinkDao();
//		Link link = new Link();
//		link = dao.getLink(1);
//		System.out.println(link.toString());
		
		ILinkService service = new LinkService();
		service.delLink(2);
		
//		dao.delLink(1);
//		List<Link> list = new ArrayList<Link>();
//		list = dao.getAllLink();
//		System.out.println(list.size());
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
		
//		INewsService iNewsService = new NewsService();
//		News news = iNewsService.getNews(27);
//		news.toString();
		
//		INewsDao dao = new NewsDao();
//		News news = dao.getNews(85);
//		System.out.println(news.getId());
//		System.out.println(news.toString());
		
		
//		
//		IMemberDao dao = new MemberDao();
//		Member member = dao.getMember(4);
//		member.toString();
//		IMemberService iMemberService = new MemberService();
//		List<Member> members1 = iMemberService.getKindMember("学术委员");
//		System.out.println(members1.toString());
	//	rule.setContract("hehe");
	//	rule.setRecruit("haha");
	//	rule.setId(1);
	//	System.out.println(rule.toString());
	//	boolean result = iRuleService.setRule(rule,1);
	//	System.out.println(result);
	}

}
