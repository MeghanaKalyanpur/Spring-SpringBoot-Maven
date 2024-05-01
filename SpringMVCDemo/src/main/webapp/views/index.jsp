<%@page language="java" %>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="style.css">
	</head>
	<body>
		<h2>Hello World!!</h2>
		
		<form action="addPatientToDB">
			<label for="Id" > S No</label>
			<input type="text" id="id" name="id"><br>
			<label for="Name" > Name</label>
			<input type="text" id="name" name="name"><br>
			<input type="submit" value="submit">
		</form>
	</body>
</html>