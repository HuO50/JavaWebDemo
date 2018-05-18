package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;
import com.service.IUserService;
import com.service.impl.UserService;
import com.util.GetNowDateUtil;

public class MemberModifyResultServlet extends HttpServlet {

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
		
		IUserService service = new UserService();
		int id = Integer.parseInt(request.getParameter("userid"));
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phonenum = request.getParameter("phonenum");
		
		User user = service.getUser(id);
		user.setId(id);
		user.setPassword(password);
		user.setEmail(email);
		user.setPhonenum(phonenum);						
		boolean b = service.modifyUser(user, id);
		
		if (b) {
			request.getRequestDispatcher("WEB-INF/jsp/MemberModifySucc.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("WEB-INF/jsp/MemberModifyEorr.jsp").forward(request, response);
		}
		
	}

}
