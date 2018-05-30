package com.servlet;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.ILinkService;
import com.service.impl.LinkService;

/**
 * Servlet implementation class LinkDeleteResultServlet
 */
@WebServlet("/LinkDeleteResultServlet")
public class LinkDeleteResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("linkid"));
		System.out.println(id);
		ILinkService service = new LinkService();
		boolean result = service.delLink(id);
		if (result) {
			request.getRequestDispatcher("WEB-INF/jsp/NewsAddSucc.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("WEB-INF/jsp/NewsAddEorr.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
