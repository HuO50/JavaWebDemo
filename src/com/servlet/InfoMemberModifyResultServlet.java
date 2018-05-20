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
 * Servlet implementation class InfoMemberModifyResultServlet
 */
@WebServlet("/InfoMemberModifyResultServlet")
public class InfoMemberModifyResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoMemberModifyResultServlet() {
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
		
		String member = request.getParameter("member");
	//	System.out.println(abstractinfo);
		
		Info info = new Info();
		
		
		IInfoService service = new InfoService();
		Info newinfo = service.getInfo(1);
		info.setAbstractinfo(newinfo.getAbstractinfo());
		info.setHonorpresident(newinfo.getHonorpresident());
		info.setInnerresearch(newinfo.getInnerresearch());
		info.setLangresearch(newinfo.getLangresearch());
		info.setMember(member);
		info.setMultioffice(newinfo.getMultioffice());
		info.setPolicyresearch(newinfo.getPolicyresearch());
		info.setOuterresearch(newinfo.getOuterresearch());
		info.setPresident(newinfo.getPresident());
		info.setHonorpresident(newinfo.getHonorpresident());
		info.setStandresearch(newinfo.getStandresearch());
		info.toString();
		
		boolean result = service.setInfo(info, 1);
		if (result) {
			request.getRequestDispatcher("WEB-INF/jsp/NewsModifySucc.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("WEB-INF/jsp/NewsModifyEorr.jsp").forward(request, response);
		}
	}

}
