 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<title> 
LoginPage
</title>
</head>
<body>
<form action="LoginServlet" method="post">
<table style="background-color: gold; margin-left: auto; margin-right: auto; margin-top: 150px;">
<tr>
<td><h1>Login Page!!!!!</h1></td>
<tr>
<td>UserName :</td>
<td><input type="text" name="UserName"></td>
</tr>
<tr>
<td>Password :</td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td><input type="submit" name="submit" value="login"></td>
<td><a href="registerpage.jsp">register</a></td>
</tr>
</table>
</form>
</body>
</html>