package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.News;
import com.model.Rule;
import com.service.INewsService;
import com.service.IRuleService;
import com.service.impl.NewsService;
import com.service.impl.RuleService;

/**
 * Servlet implementation class RuleRecruitModifyResultServlet
 */
@WebServlet("/RuleRecruitModifyResultServlet")
public class RuleRecruitModifyResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String recruit = request.getParameter("recruit");
		
		Rule rule = new Rule();
		rule.setRecruit(recruit);
		
		//test
//		System.out.println(recruit);
//		System.out.println(rule.toString());
		
		IRuleService service = new RuleService();
		Rule newrule = service.getRule(1);
		rule.setContract(newrule.getContract());
		rule.toString();
		
		boolean b = service.setRule(rule, 1);
		
		if (b) {
			request.getRequestDispatcher("WEB-INF/jsp/NewsModifySucc.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("WEB-INF/jsp/NewsModifyEorr.jsp").forward(request, response);
		}
	}

}
