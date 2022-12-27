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
<title>Update Dob</title>
</head>
<body>
<h1>Enter your details for update Dob</h1>
	<form action="update_student_dob" method="post">
		<div class="form-group">
			<label> Enter your Id</label> <input
				type="number" class="form-control" id="formGroupExampleInput"
				name="id" placeholder="Id">
		</div>
		<br>
		<div class="form-group">
			<label>Enter your Dob</label> <input type="text"
				class="form-control" id="formGroupExampleInput" name="dob"
				placeholder="Dob">
		</div>
		<br>
		<div class="form-group">
			<button type="submit" class="btn btn-primary">Submit</button>
		</div>
	</form>

</body>
</html>