<%@page import="java.util.List"%>
<%@page import="com.jsp.dto.TeacherDto"%>
<%@page import="com.jsp.service.TeacherServices"%>
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

<title>All Teacher</title>
</head>
<body>
	<h1>Details of Teacher</h1>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Name</th>
				<th scope="col">Email</th>
				<th scope="col">Subject</th>
			</tr>
		</thead>

		<%
		TeacherServices teacherServices = new TeacherServices();
		List<TeacherDto> teacher = teacherServices.getAllTeacher();
		for (TeacherDto t : teacher) {
		%>
		<tbody>
			<tr>
				<th scope="row"><%=t.getId()%></th>
				<td><%=t.getName()%></td>
				<td><%=t.getEmail()%></td>
				<td><%=t.getSubject()%></td>
			</tr>
		</tbody>
		<%
		}
		%>
	</table>
</body>
</html>