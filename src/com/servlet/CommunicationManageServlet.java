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
import com.service.ICommuService;
import com.service.INewsService;
import com.service.impl.CommuService;
import com.service.impl.NewsService;


@WebServlet("/CommunicationManageServlet")
public class CommunicationManageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
//		INewsService service = new NewsService();
		ICommuService service = new CommuService();
		List<News> list = service.getAllCommunityNews();
		Collections.reverse(list);
		request.setAttribute("newslist", list);
		
		request.getRequestDispatcher("WEB-INF/jsp/CommunicationManage.jsp").forward(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
