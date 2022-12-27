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
<title>Save Student</title>
</head>
<body>
	<h1>Enter your detail</h1>
	<form action="save_student" method="post">
		<div class="form-group">
			<label for="formGroupExampleInput">Enter your name</label> <input
				type="text" class="form-control" name="name" placeholder="Name">
		</div>
		<br>

		<div class="form-group">
			<label for="formGroupExampleInput2">Enter your Dob</label> <input
				type="text" class="form-control" name="dob" placeholder="Dob">
		</div>
		<br>
		<div class="form-group">
			<label for="formGroupExampleInput2">Enter your ContactNo</label> <input
				type="number" class="form-control" name="number"
				placeholder="ContactNo">
		</div>
		<br>
		<div class="form-group">
			<button type="submit" class="btn btn-primary">Submit</button>
		</div>
		
	</form>

</body>
</html>