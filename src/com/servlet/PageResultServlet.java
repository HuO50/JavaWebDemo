package com.servlet;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.News;
import com.service.IResultService;
import com.service.impl.ResultService;

/**
 * Servlet implementation class PageResultServlet
 */
@WebServlet("/PageResultServlet")
public class PageResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IResultService iResultService = new ResultService();
		List<News> news = iResultService.getAllResultNews();
		List<News> news1 = iResultService.getKindResult("重大项目");
		List<News> news2 = iResultService.getKindResult("科学研究");
		List<News> news3 = iResultService.getKindResult("精品课程");
		Collections.reverse(news1);
		Collections.reverse(news2);
		Collections.reverse(news3);
		request.setAttribute("news1", news1);
		request.setAttribute("news2", news2);
		request.setAttribute("news3", news3);
		request.getRequestDispatcher("WEB-INF/jsp/PageResult.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
