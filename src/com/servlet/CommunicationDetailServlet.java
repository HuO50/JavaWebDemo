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


@WebServlet("/CommunicationDetailServlet")
public class CommunicationDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CommunicationDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("newsid"));
		
		INewsService service = new NewsService();
		News news = service.getNews(id);
		
		request.setAttribute("news", news);
		
		request.getRequestDispatcher("WEB-INF/jsp/CommunicationDetail.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
