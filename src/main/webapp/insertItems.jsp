<%@page import="servelet_jsp_McDonalds_dto.Menu"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%Menu menu=(Menu)request.getAttribute("menus"); %>

<table>
<form action="addItems">

<tr>
<td>
Menu Id:<input type="number" name="id" value="<%=menu.getM_id()%>">
</td>
</tr>
<tr>
<td>
Name:<input type="text" name="name" value="<%=menu.getM_name()%>">
</td>
</tr>
<tr>
<td>
Desc:<input type="text" name="desc" value="<%=menu.getM_desc()%>">
</td>
</tr>
<tr>
<td>
Price:<input type="number" name="price" value="<%=menu.getM_price()%>">
</td>
</tr>
<tr>
<td>
Offer:<input type="number" name="offer" value="value="<%=menu.getM_offer()%>">
</td>
</tr>
<tr>
<td>
Quantity:<input type="number" name="quantity" placeholder="Enter the quantity">
</td>
</tr>
<tr>
<td>

<input type="submit">


</form>
</table>
</body>
</html>