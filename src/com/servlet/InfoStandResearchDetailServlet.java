package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Info;
import com.model.Rule;
import com.service.IInfoService;
import com.service.IRuleService;
import com.service.impl.InfoService;
import com.service.impl.RuleService;


@WebServlet("/InfoStandResearchDetailServlet")
public class InfoStandResearchDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//IRuleService service = new RuleService();
		IInfoService service = new InfoService();
		Info info = service.getInfo(1);
//		Rule rule = service.getRule(1);
//		rule.toString();
		request.setAttribute("standresearch", info.getStandresearch());
		
		request.getRequestDispatcher("WEB-INF/jsp/InfoStandResearchDetail.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
