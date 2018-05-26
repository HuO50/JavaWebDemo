package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;
import com.service.IUserService;
import com.service.impl.UserService;

public class LoginverificationServlet extends HttpServlet {


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String jurisdiction = "yes";
		PrintWriter out = response.getWriter();
		
		IUserService service = new UserService();
		User user = service.getUser(username);
		String jurisdiction_yes = user.getJurisdiction();
		String password_yes = user.getPassword();
		
		if (password.equals(password_yes) && jurisdiction_yes.equals(jurisdiction)) {
			request.getSession().setAttribute("username", username);		
			response.sendRedirect("ManageHome");
		}
		else if (password.equals(password_yes) && !jurisdiction_yes.equals(jurisdiction)) {
			out.print("<script language='javascript'>alert('登录失败：没有登录权限！');"
					+ "window.location.href='Login'</script>");
			out.close();
		}
		else {
			out.print("<script language='javascript'>alert('登录失败：用户名密码错误！');"
							+ "window.location.href='Login'</script>");
			out.close();
		}
	}

}
