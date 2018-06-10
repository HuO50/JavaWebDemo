package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.News;
import com.service.INewsService;
import com.service.impl.NewsService;

@WebServlet("/PageCooperationNewsServlet")
public class PageCooperationNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PageCooperationNewsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("合作研究内容如下");
		
		INewsService iNewsService = new NewsService();
		List<News> news = iNewsService.getKindNews("合作研究");
		Collections.reverse(news);

		
		List<News> topNews = new ArrayList<News>();
		List<News> unTopNews = new ArrayList<News>();
		List<News> returnNews = new ArrayList<News>();
		
		for(Iterator iterator = news.iterator();iterator.hasNext();) {
			News newsTemp = new News();
			newsTemp = (News) iterator.next();
			if (newsTemp.getIstop()) {
				topNews.add(newsTemp);
			} else {
				unTopNews.add(newsTemp);
			}
		}
		//添加sortid，进行排序
		for(int i = 0; i < topNews.size(); i++  ) {
			topNews.get(i).setSortid(i);
			returnNews.add(topNews.get(i));
		}
		for(int i = 0; i < unTopNews.size(); i++) {
			int j = topNews.size();
			unTopNews.get(i).setSortid(j+i);
			returnNews.add(unTopNews.get(i));
		}
		
		request.setAttribute("news2", returnNews);
		request.getRequestDispatcher("WEB-INF/jsp/PageCooperationNews.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
