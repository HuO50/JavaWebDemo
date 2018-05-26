package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Member;
import com.service.IMemberService;
import com.service.impl.MemberService;

/**
 * Servlet implementation class MemberDetailServlet
 */
@WebServlet("/PageMemberDetailServlet")
public class PageMemberDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int id = Integer.parseInt(request.getParameter("id"));
			IMemberService iMemberService = new MemberService();
			Member member =iMemberService.getMember(id);
			request.setAttribute("member", member);
			request.getRequestDispatcher("WEB-INF/jsp/PageMemberDetail.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
