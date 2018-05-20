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


@WebServlet("/RuleContractModifyServlet")
public class RuleContractModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IRuleService service = new RuleService();
		Rule rule = service.getRule(1);
		rule.toString();
		request.setAttribute("contract", rule.getContract());
		
		request.getRequestDispatcher("WEB-INF/jsp/RuleContractModify.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
