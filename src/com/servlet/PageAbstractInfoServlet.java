package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.taglibs.standard.tag.el.fmt.RequestEncodingTag;

import com.model.Info;
import com.model.Member;
import com.service.IInfoService;
import com.service.IMemberService;
import com.service.impl.InfoService;
import com.service.impl.MemberService;

/**
 * Servlet implementation class PageAbstractInfoServlet
 */
@WebServlet("/PageAbstractInfoServlet")
public class PageAbstractInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获得 委员
		IMemberService iMemberService = new MemberService();
		List<Member> members1 = iMemberService.getKindMember("学术委员");
		request.setAttribute("member1", members1);
		List<Member> members2 = iMemberService.getKindMember("本院研究员");
		request.setAttribute("member2", members2);
		List<Member> members3 = iMemberService.getKindMember("特聘研究员");
		request.setAttribute("member3", members3);
		
		IInfoService iInfoService = new InfoService();
		Info info = iInfoService.getInfo(1);
		request.setAttribute("policyresearch", info.getPolicyresearch());
		request.setAttribute("multioffice", info.getMultioffice());
		request.setAttribute("langresearch", info.getLangresearch());
		request.setAttribute("abstractinfo", info.getAbstractinfo());
		request.setAttribute("honorpresident", info.getHonorpresident());
		request.setAttribute("president", info.getPresident());
		request.setAttribute("standresearch", info.getStandresearch());
		request.getRequestDispatcher("WEB-INF/jsp/PageAbstractInfo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
