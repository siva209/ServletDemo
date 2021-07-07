package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String UserName = request.getParameter("UserName");
		String Password = request.getParameter("password");
		LoginDAO ldao = new LoginDAO();
		if (ldao.isCheckData(UserName, Password) == true) {
			request.setAttribute("message", UserName);
			RequestDispatcher res = request.getRequestDispatcher("Welcome.jsp");
			res.forward(request, response);
		} else
			response.sendRedirect("loginpage.jsp");
	}

}
