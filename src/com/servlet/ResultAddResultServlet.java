package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.News;
import com.service.INewsService;
import com.service.impl.NewsService;
import com.util.GetNowDateUtil;

public class ResultAddResultServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		Date time = GetNowDateUtil.getDate();
		String content = request.getParameter("content");
		String mark = request.getParameter("mark");
		boolean istop = Boolean.parseBoolean(request.getParameter("istop"));
		
		News news = new News();		
		news.setAuthor(author);
		news.setTitle(title);
		news.setTime(time);
		news.setContent(content);
		if (mark.equals("zdxm")) {
			mark = "重大项目";
		}else if (mark.equals("kxyj")) {
			mark = "科学研究";
		}else if (mark.equals("jpkc")) {
			mark = "精品课程";
		}
		news.setMark(mark);
		news.setIstop(istop);
		
		
		INewsService service = new NewsService();
		boolean b = service.addNews(news);
		
		if (b) {
			request.getRequestDispatcher("WEB-INF/jsp/NewsAddSucc.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("WEB-INF/jsp/NewsAddEorr.jsp").forward(request, response);
		}
		
	}

}
