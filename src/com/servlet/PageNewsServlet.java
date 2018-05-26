package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.News;
import com.service.INewsService;
import com.service.impl.NewsService;

/**
 * Servlet implementation class PageNewsServlet
 */
@WebServlet("/PageNewsServlet")
public class PageNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PageNewsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		INewsService iNewsService = new NewsService();
		News news = iNewsService.getNews(id);
		request.setAttribute("news", news);
		System.out.println(news.toString());
		request.getRequestDispatcher("WEB-INF/jsp/PageNews.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
