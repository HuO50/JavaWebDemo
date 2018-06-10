package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.News;
import com.service.INewsService;
import com.service.IResultService;
import com.service.impl.NewsService;
import com.service.impl.ResultService;

/**
 * Servlet implementation class PageProjectNewsServlet
 */
@WebServlet("/PageProjectNewsServlet")
public class PageProjectNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PageProjectNewsServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("重大项目内容如下");
		IResultService iResultService = new ResultService();
		List<News> news = iResultService.getKindResult("重大项目");
		
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
		
		request.setAttribute("news", returnNews);
		request.getRequestDispatcher("WEB-INF/jsp/PageProjectNews.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
