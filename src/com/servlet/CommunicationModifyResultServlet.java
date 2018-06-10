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

@WebServlet("/CommunicationModifyResultServlet")
public class CommunicationModifyResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		int id = Integer.parseInt(request.getParameter("newsid"));
		
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String content = request.getParameter("content");
		String mark = request.getParameter("mark");
		boolean istop = Boolean.parseBoolean(request.getParameter("istop"));
		
		News news = new News();		
		news.setAuthor(author);
		news.setTitle(title);
		news.setContent(content);
		news.setMark(mark);
		news.setIstop(istop);
		
		if (mark.equals("xsjl")) {
			mark = "学术交流";
		}else if (mark.equals("hzyj")) {
			mark = "合作研究";
		}
		news.setMark(mark);
		INewsService service = new NewsService();
		boolean b = service.modifyNews(id, news);
		
		if (b) {
			request.getRequestDispatcher("WEB-INF/jsp/NewsModifySucc.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("WEB-INF/jsp/NewsModifyEorr.jsp").forward(request, response);
		}
		
	}

}
