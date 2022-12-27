<%@page import="com.jsp.dto.StudentDto"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.StudentService"%>
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
<title>All Student</title>
</head>
<body>
	<h1>DetailS of Student</h1>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Name</th>
				<th scope="col">Dob</th>
				<th scope="col">Cno</th>
			</tr>
		</thead>
		<%
		StudentService studentService = new StudentService();
		List<StudentDto> student = studentService.getAllStudent();
		for (StudentDto s : student) {
		%>
		<tbody>
			<tr>
				<th scope="row"><%=s.getId()%></th>
				<td><%=s.getName()%></td>
				<td><%=s.getDob()%></td>
				<td><%=s.getCno()%></td>
			</tr>
		</tbody>
		<%
		}
		%>
	</table>


</body>
</html>