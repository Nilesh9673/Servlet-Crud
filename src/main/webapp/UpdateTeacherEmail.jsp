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
<title>update email</title>
</head>
<body>
	<h1>Enter your details for update email</h1>
	<form action="update_teacher_email" method="post">

		<div class="form-group">
			<label for="formGroupExampleInput">Enter your Id</label> <input
				type="number" class="form-control" id="formGroupExampleInput"
				name="id" placeholder="id">
		</div>
		<br>
		<div class="form-group">
			<label for="formGroupExampleInput">Enter your new password</label> <input
				type="email" class="form-control" id="formGroupExampleInput"
				name="email" placeholder="Email">
		</div>
		<br>
		<div class="form-group">
			<button type="submit" class="btn btn-primary">Submit</button>
		</div>
	</form>
</body>
</html>