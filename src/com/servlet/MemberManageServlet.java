package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Member;
import com.model.User;
import com.service.IMemberService;
import com.service.IUserService;
import com.service.impl.MemberService;
import com.service.impl.UserService;

public class MemberManageServlet extends HttpServlet {

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

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		IMemberService iMemberService = new MemberService();
		List<Member> members = iMemberService.getallMember();
		request.setAttribute("memberlist", members);
//		List<Member> members1 = iMemberService.getKindMember("学术委员");
//		request.setAttribute("member_research_list", members1);
//		List<Member> members2 = iMemberService.getKindMember("本院研究员");
//		request.setAttribute("member_inner_list", members2);
//		List<Member> members3 = iMemberService.getKindMember("特聘研究员");
//		request.setAttribute("member_outer_list", members3);
		request.getRequestDispatcher("WEB-INF/jsp/MemberManage.jsp").forward(request, response);
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

		this.doGet(request, response);
	}

}
