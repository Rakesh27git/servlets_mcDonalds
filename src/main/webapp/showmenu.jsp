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
			<th>Delete</th>
			<th>Update</th>

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

			<td><a href="delete?id=<%=menu.getM_id()%>"><button>delete</button></a>
			</td>
			<td><a href="update?id=<%=menu.getM_id()%>"><button>update</button></a>
			</td>

		</tr>
		<%
		}
		%>

<tr>
<td>
<a href="addmenu.jsp"><input type="button" value="AddMenu"></a>
</td>
</tr>



	</table>


</body>
</html>