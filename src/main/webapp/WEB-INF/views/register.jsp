<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>

<h1> This is a Registration Form  </h1>
 
   <form action="/register" method="POST">
   
    Customer ID : <input type="text" name="customerId" /> <br>
    Customer Name : <input type="text" name="customerName" /> <br>
    Customer Email : <input type="text" name="customerEmail" /> <br>
    Contact Number : <input type="text" name="contactNumber" /> <br>
    Password       :<input type="password"name="password"/><br>
    
    <input type="submit" value="Register"/>
   
   </form>

</body>
</html>