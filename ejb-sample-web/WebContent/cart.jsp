<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<jsp:include page="head.jsp"></jsp:include>
	<title>Shop - Benutzer</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

	<div class="container">

		<h1>Hallo  ${user.username}</h1>
	
		<p>Das hier ist die Übersichtsseite zu ihrem persönlichen Benutzer</p>
	</div>

</body>
</html>