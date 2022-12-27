<%@page import="java.util.List"%>
<%@page import="com.jsp.dto.StaffDto"%>
<%@page import="com.jsp.service.StaffService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<h1>Details of All Staff</h1>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Name</th>
				<th scope="col">Job</th>
			</tr>
		</thead>
		<%
		StaffService staffService = new StaffService();
		List<StaffDto> staff = staffService.getAllStaff();
		for (StaffDto s : staff) {
		%>
		<tbody>
			<tr>
				<th scope="row"><%=s.getId()%></th>
				<td><%=s.getName()%></td>
				<td><%=s.getJd()%></td>
			</tr>
		</tbody>
		<%
		}
		%>
		</table>
	
</body>
</html>