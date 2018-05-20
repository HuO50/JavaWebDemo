package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.INewsService;
import com.service.impl.NewsService;


@WebServlet("/CommunicationDeleteResultServlet")
public class CommunicationDeleteResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("newsid"));

		INewsService service = new NewsService();
		boolean b = service.deleteNews(id);

		if (b) {
			request.getRequestDispatcher("WEB-INF/jsp/CommunicationDeleteSucc.jsp")
					.forward(request, response);
		}
	}


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
