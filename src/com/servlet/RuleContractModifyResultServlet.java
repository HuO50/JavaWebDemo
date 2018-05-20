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


@WebServlet("/RuleContractModifyResultServlet")
public class RuleContractModifyResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String contract = request.getParameter("contract");

		Rule rule = new Rule();
		rule.setContract(contract);
		
		IRuleService service = new RuleService();
		Rule newrule = service.getRule(1);
		rule.setRecruit(newrule.getRecruit());
		
		rule.toString();
		
		boolean b = service.setRule(rule, 1);
		
		if (b) {
			request.getRequestDispatcher("WEB-INF/jsp/NewsModifySucc.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("WEB-INF/jsp/NewsModifyEorr.jsp").forward(request, response);
		}
	}

}
