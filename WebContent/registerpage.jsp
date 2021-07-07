<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="RegisterServlet" method="post">
<table style="background-color: gold; margin-left: auto; margin-right: auto; margin-top: 150px;">
<tr>
<td><h1>Registration Page!!!!!</h1></td>
<tr>
<td>UserName :</td>
<td><input type="text" name="UserName"></td>
</tr>
<tr>
<td>Password :</td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td>Name :</td>
<td><input type="text" name="Name"></td>
</tr>
<tr>
<td>UserID :</td>
<td><input type="text" name="UserID"></td>
</tr>
<tr>
<td>ReTypePassword :</td>
<td><input type="password" name="ReTypepassword"></td>
</tr>
<tr>
<td><input type="submit" name="submit" value="register"></td>
</tr>
</table>
</form>
</body>
</html>