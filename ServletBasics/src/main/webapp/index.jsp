<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	.container {
		width: 30%;
		border : 1px solid black;
		
		padding: 20px;
		font-size: 20px;
	}
</style>
</head>
<body>
<h1>First Servlet Program</h1>
<h6><a href="first" %>First</a></h6>
<h6><a href="second">Second</a></h6>
<h6><a href="third">Third</a></h6>
<h1> -----------------------------------------</h1><br><br>
<div class="container">
	<h1>MY FORM</h1>
	<form action="Register" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="user_name" placeholder="Enter here"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="user_password"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="user_email"></td>
			</tr>
			<tr>
				<td>Select Gender</td>
				<td>
					<input type="radio" name="user_gender" placeholder="Your Name">Male
					<input type="radio" name="user_gender" placeholder="Your Name">Female
				</td>
			</tr>
			<tr>
				<td>Select courses</td>
				<td>
					<select name="user_course">
						<option>Java</option>
						<option>React</option>
						<option>Python</option>
					 </select>
				</td>
			</tr>
			<tr>
				<td>
				
				</td>
				<td>
					<input type="checkbox" value="checked" name="user_condition">
					Agree Terms and condition
				</td>
			</tr>
			<tr>
				<td>
					<button type="reset">Reset</button>
				</td>
				<td>
					<button type="submit">Register</button>
				</td>
			</tr>
		</table>
	</form>
</div>
<h1> -----------------------------------------</h1><br><br>
<div class="container">
	<h1>Calculator for practicing attributes</h1>
	<form action="s1" method="post">
		N1:<input type="number" name="n1"><br>
		N2:<input type="number" name="n2"><br>
		<button type = "submit">
			ok
		</button>
	</form>
</div>
</body>
</html>