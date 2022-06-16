<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>


<h1> Login Form </h1>

<form action="/login" method="POST">

Customer Email:<input type="text" name="customerEmail"/><br>
Password   :<input type="password" name="password"/><br>

<input type="submit" value="login"/><br>
</form>


<br>

<a href="/reg_form">Register</a>

</body>
</html>