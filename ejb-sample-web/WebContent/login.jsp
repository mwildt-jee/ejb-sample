<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="LoginAction">
		<div>
			<label for="login-username"></label>
			<input type="text" name="username" id="login-username"/>
		</div>
		<div>
			<label for="login-password"></label>
			<input type="password" name="password" id=login-password/>
		</div>
		<div>
			<input type="submit" name="submit" id="login-submit"/>
		</div>		
	</form>
	
</body>
</html>