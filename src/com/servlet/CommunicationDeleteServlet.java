package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CommunicationDeleteServlet")
public class CommunicationDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setAttribute("newsid", Integer.parseInt(request.getParameter("newsid")));
		
		request.getRequestDispatcher("WEB-INF/jsp/CommunicationDelete.jsp").forward(request, response);
	}


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
