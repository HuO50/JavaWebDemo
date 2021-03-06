package com.servlet;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Link;
import com.service.ILinkService;
import com.service.impl.LinkService;

/**
 * Servlet implementation class LinkAddResultServlet
 */
@WebServlet("/LinkAddResultServlet")
public class LinkAddResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LinkAddResultServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		ILinkService linkService = new LinkService();
		Link link = new Link();
		link.setName(request.getParameter("name"));
		link.setLink(request.getParameter("link"));
		boolean result = linkService.setLink(link);
		if (result) {
			request.getRequestDispatcher("WEB-INF/jsp/NewsAddSucc.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("WEB-INF/jsp/NewsAddEorr.jsp").forward(request, response);
		}
		
	}

}
