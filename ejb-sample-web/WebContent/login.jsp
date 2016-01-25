<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="head.jsp"></jsp:include>
</head>

<body>
	<jsp:include page="header.jsp"></jsp:include>
	
	<div class="container">

		<h1>Login</h1>

		<form method="POST" class="form" action="LoginAction">
			<div class="form-group">
				<label for="login-username">Username:</label>
				<input type="text" class="form-control" name="username" id="login-username"/>
			</div>
			<div class="form-group">
				<label for="login-password">Password:</label>
				<input type="password" class="form-control" name="password" id=login-password/>
			</div>
			<button class="btn btn-primary" type="submit" name="submit" id="login-submit">Login</button>		
		</form>
	</div>
	
</body>
</html>