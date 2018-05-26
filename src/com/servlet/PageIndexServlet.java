package com.servlet;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.IPictureDao;
import com.model.Info;
import com.model.News;
import com.model.Picture;
import com.service.IInfoService;
import com.service.INewsService;
import com.service.IPictureService;
import com.service.IRuleService;
import com.service.impl.InfoService;
import com.service.impl.NewsService;
import com.service.impl.PictureService;

@WebServlet("/PageIndexServlet")
public class PageIndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取轮播等图像路径
		response.setHeader("Cache-Control", "no-store");//or no-cache
		response.setHeader("Pragrma", "no-cache"); 
		response.setDateHeader("Expires", 0);
		IPictureService iPictureService =  new PictureService();
		Picture picture1 = iPictureService.getPicture(1);
		request.setAttribute("picture1", picture1.getLocation());
		Picture picture2 = iPictureService.getPicture(2);
		request.setAttribute("picture2", picture2.getLocation());
		Picture picture3 = iPictureService.getPicture(3);
		request.setAttribute("picture3", picture3.getLocation());
		Picture picture4 = iPictureService.getPicture(4);
		request.setAttribute("picture4", picture4.getLocation());
		Picture picture5 = iPictureService.getPicture(5);
		request.setAttribute("picture5", picture5.getLocation());
		Picture picture6 = iPictureService.getPicture(6);
		request.setAttribute("picture6", picture6.getLocation());
		//获得研究院概况内容
		IInfoService iInfoService = new InfoService();
		Info info = iInfoService.getInfo(1);
		
		request.setAttribute("abstractinfo", info.getAbstractinfo());
		
		//学术动态4条简介
		INewsService iNewsService = new NewsService();
		List<News> news1 = iNewsService.getKindNews("学术动态");
		Collections.reverse(news1);
		request.setAttribute("news1", news1);
		
		//学术交流4条简介
		List<News> news2 = iNewsService.getKindNews("学术交流");
		Collections.reverse(news2);
		request.setAttribute("news2", news2);
		
		request.getRequestDispatcher("WEB-INF/jsp/PageIndex.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
