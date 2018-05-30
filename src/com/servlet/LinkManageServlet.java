package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Link;
import com.service.ILinkService;
import com.service.impl.LinkService;

/**
 * Servlet implementation class LinkManageServlet
 */
@WebServlet("/LinkManageServlet")
public class LinkManageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		ILinkService iService = new LinkService();
		List<Link> links =  iService.getAllLink();
		
		request.setAttribute("linklist", links);
		for (Link link : links) {
			System.out.println(link.toString());
		}
		request.getRequestDispatcher("WEB-INF/jsp/LinkManage.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
