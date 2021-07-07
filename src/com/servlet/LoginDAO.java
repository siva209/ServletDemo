package com.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginDAO {
	public boolean isCheckData(String user, String pass) {
		//String url = "jdbc:mysql://localhost:3306/dbemployee";
		//String username = "siva";
		//String password = "siva";
	
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbemployees", "siva", "siva");
				System.out.println(con);
				
				
			//System.out.println(con);
			String query = "select * from reg";
			PreparedStatement st = con.prepareStatement(query);
			ResultSet res = st.executeQuery();
			while(res.next()) {
				String UserName = res.getString("UserName");
				String Password = res.getString("password");
			if(user.equals(UserName) && pass.equals(Password))
			return true;
			}
			} catch (Exception e) {
				System.out.println(e );
				//e.printStackTrace();
			}
			return false;
	}
}
