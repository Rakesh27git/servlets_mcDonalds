<%@page import="servelet_jsp_McDonalds_dao.MenuDao"%>
<%@page import="servelet_jsp_McDonalds_dto.Menu"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	
	<%
	List<Menu> list1 = (List) request.getAttribute("menus");
	%>

	<table border="3px">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Description</th>
			<th>Price</th>
			<th>Offer</th>
			<th>Select Order</th>
			<th>Quantity</th>
			
			

		</tr>
		<%
		for (Menu menu : list1) {
		%>
		<tr>
			<td><%=menu.getM_id()%></td>
			<td><%=menu.getM_name()%></td>
			<td><%=menu.getM_desc()%></td>
			<td><%=menu.getM_price()%></td>
			<td><%=menu.getM_offer()%></td>

			<td><a href="orderid?id=<%=menu.getM_id()%>"><input type="checkbox"></a>
			</td>
			<td><input type="number">
			</td>

		</tr>
		<%
		}
		%>

<tr>
<td>
<a href="insertItems.jsp"><input type="button" value="Confirm"></a>
</td>
</tr>




	</table>
	


</body>
</html>