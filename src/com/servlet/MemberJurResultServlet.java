package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.IUserService;
import com.service.impl.UserService;

public class MemberJurResultServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		int id = Integer.parseInt(request.getParameter("userid"));
		String jurisdiction = request.getParameter("jurisdiction");
		if (jurisdiction.equals("yes")) {
			jurisdiction = "no";
		} else {
			jurisdiction = "yes";
		}
		
		IUserService service = new UserService();
		boolean b = service.Userjurisdiction(jurisdiction, id);
		
		if (b) {
			request.getRequestDispatcher("WEB-INF/jsp/MemberJurSucc.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("WEB-INF/jsp/MemberJurEorr.jsp").forward(request, response);
		}
		
	}


}
