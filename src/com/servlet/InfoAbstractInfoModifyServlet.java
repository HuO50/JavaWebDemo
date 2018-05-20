package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Info;
import com.service.IInfoService;
import com.service.impl.InfoService;

/**
 * Servlet implementation class InfoAbstractInfoModifyServlet
 */
@WebServlet("/InfoAbstractInfoModifyServlet")
public class InfoAbstractInfoModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IInfoService service = new InfoService();
		Info info = service.getInfo(1);
		request.setAttribute("abstractinfo", info.getAbstractinfo());
		request.getRequestDispatcher("WEB-INF/jsp/InfoAbstractInfoModify.jsp").forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
