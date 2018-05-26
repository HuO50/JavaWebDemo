package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Rule;
import com.service.IRuleService;
import com.service.impl.RuleService;

/**
 * Servlet implementation class PageRuleServlet
 */
@WebServlet("/PageRuleServlet")
public class PageRuleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IRuleService iRuleService = new RuleService();
		Rule rule = iRuleService.getRule(1);
		request.setAttribute("concract", rule.getContract());
		request.setAttribute("recruit", rule.getRecruit());
		request.getRequestDispatcher("WEB-INF/jsp/PageRule.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
