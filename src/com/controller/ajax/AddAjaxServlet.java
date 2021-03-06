package com.controller.ajax;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.NewsService;
import com.service.ServiceFactory;


@WebServlet("/AddAjaxServlet")
public class AddAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private NewsService newsService = ServiceFactory.getNewsService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("newslist", newsService.listNews());
		System.out.println("AddAjaxServlet");
		request.getRequestDispatcher("/WEB-INF/jsp/ajax/add.jsp")
		.forward(request, response);
	}



}
