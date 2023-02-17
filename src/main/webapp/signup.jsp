<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<form action="save" method="post">
<tr>
<td>
Name:<input type="text" name="name" placeholder="Enter the Name">
</td>
</tr>
<tr>
<td>
Email:<input type="email" name="email" placeholder="Enter the email">
</td>
</tr>
<tr>
<td>
Password:<input type="password" name="password" placeholder="Enter the password">
</td>
</tr>
<tr>
<td>
Phone:<input type="tel" name="phone" placeholder="Entert the Phone Number">
</td>
</tr>
<tr>
<td>
Address:<input type="text" name="address" placeholder="Enter the Address">
</td>
</tr>
<tr>
<td>
<label for="role"> Role </label>
<select id="role" name="role">
<option value = "customer"> Customer 
</option>
<option value = "manager"> Manager
</option>
<option  value = "staff"> Staff
</option>
</select>
<input type="submit">


</form>
</table>

</body>
</html>