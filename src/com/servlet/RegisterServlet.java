package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public RegisterServlet() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String UserName = request.getParameter("UserName");
		String Password = request.getParameter("password");
		String Name = request.getParameter("Name");
		String UserID = request.getParameter("UserID");
		String ReTypepassword = request.getParameter("ReTypepassword");
		
		String url = "jdbc:mysql://localhost:3306/dbemployees";
		String username = "siva";
		String password = "siva";
		if(Password.equals(ReTypepassword) && UserName != null && Password != null && Name != null && UserID != null && ReTypepassword != null) {
			try {
				Class.forName("com.mysql.jdbc.cj.Driver");
				Connection con = DriverManager.getConnection(url, username, password);
				//System.out.println("database connected");
			String query = "insert into reg values (?,?,?,?,?)";
			PreparedStatement st = con.prepareStatement(query);
			System.out.println("started");
			st.setString(1, UserName);
			st.setString(2, Password);
			st.setString(3, Name);
			st.setString(4, UserID);
			st.setString(5, ReTypepassword);
			st.executeUpdate();
			System.out.println(UserName+" "+Password+" "+Name+" "+UserID+" "+ReTypepassword);
			response.sendRedirect("Success.jsp");
	}catch (Exception e) {
		e.printStackTrace();
	}
		}
	}
}