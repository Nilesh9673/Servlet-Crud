<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update Subject</title>
</head>
<body>
	<h1>Enter your details for update Subject</h1>
	<form action="update_teacher_subject" method="post">

		<div class="form-group">
			<label for="formGroupExampleInput">Enter your Id</label> <input
				type="number" class="form-control" id="formGroupExampleInput"
				name="id" placeholder="id">
		</div>
		<br>
		<div class="form-group">
			<label for="formGroupExampleInput">Enter Subject</label> <input
				type="text" class="form-control" id="formGroupExampleInput"
				name="subject" placeholder="subject">
		</div>
		<br>
		<div class="form-group">
			<button type="submit" class="btn btn-primary">Submit</button>
		</div>
	</form>
</body>
</html>