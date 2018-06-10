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

/**
 * Servlet implementation class PageCommunicationNewsServlet
 */
@WebServlet("/PageCommunicationNewsServlet")
public class PageCommunicationNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		INewsService iNewsService = new NewsService();
		List<News> news1 = iNewsService.getKindNews("学术交流");
		Collections.reverse(news1);
		System.out.println(news1.size());

		
		//news1 排序
		List<News> topNews1 = new ArrayList<News>();
		List<News> unTopNews1 = new ArrayList<News>();

		List<News> returnNews1 = new ArrayList<News>();		

		
		for(Iterator iterator = news1.iterator();iterator.hasNext();) {
			News newsTemp = new News();
			newsTemp = (News) iterator.next();
			if (newsTemp.getIstop()) {
				topNews1.add(newsTemp);
			} else {
				unTopNews1.add(newsTemp);
			}
		}
		//添加sortid，进行排序
		for(int i = 0; i < topNews1.size(); i++  ) {
			topNews1.get(i).setSortid(i);
			returnNews1.add(topNews1.get(i));
		}
		for(int i = 0; i < unTopNews1.size(); i++) {
			int j = topNews1.size();
			unTopNews1.get(i).setSortid(j+i);
			returnNews1.add(unTopNews1.get(i));
		}
		for (int i = 0; i < returnNews1.size(); i++) {
			System.out.println(returnNews1.get(i).toString());
		}
		
		//news2排序
		

		
		request.setAttribute("news1", returnNews1);

		request.getRequestDispatcher("WEB-INF/jsp/PageCommunicationNews.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
