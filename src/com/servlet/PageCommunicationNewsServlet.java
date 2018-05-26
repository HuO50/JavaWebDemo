package com.servlet;

import java.io.IOException;
import java.util.Collections;
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
		List<News> news2 = iNewsService.getKindNews("合作研究");
		Collections.reverse(news2);
		request.setAttribute("news1", news1);
		request.setAttribute("news2", news2);
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
