package com.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.News;
import com.service.INewsService;
import com.service.impl.NewsService;
import com.util.GetNowDateUtil;

/**
 * Servlet implementation class CommunicationAddResultServlet
 */
@WebServlet("/CommunicationAddResultServlet")
public class CommunicationAddResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommunicationAddResultServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		Date time = GetNowDateUtil.getDate();
		String content = request.getParameter("content");
		String mark = request.getParameter("mark");
		
		News news = new News();		
		news.setAuthor(author);
		news.setTitle(title);
		news.setTime(time);
		news.setContent(content);
		if (mark.equals("xsjl")) {
			mark = "学术交流";
		}else if (mark.equals("hzyj")) {
			mark = "合作研究";
		}
		news.setMark(mark);
		
		INewsService service = new NewsService();
		boolean b = service.addNews(news);
		
		if (b) {
			request.getRequestDispatcher("WEB-INF/jsp/CommunicationAddSucc.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("WEB-INF/jsp/CommunicationAddEorr.jsp").forward(request, response);
		}
	}

}
