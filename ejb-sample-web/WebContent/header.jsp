<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<nav class="navbar navbar-default">
	<div class="container container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
				<span class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="">Shop</a>
			
			
		</div>
	
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
	
				<li><a id="nav-articles" href="ArticleList">Artikel</a></li>
				<li>
					<c:if test="${sessionScope.user != null}" >
						<a id="nav-logout" href="#">Logout</a>
					</c:if>
					<c:if test="${sessionScope.user == null}" >
						<a id="nav-login" href="LogoutAction">Login</a>
					</c:if>
				</li>
				<li>
					<a href="cart.jsp">Cart <span class="badge">${cart.getAll().size()}</span></a>
				</li>
			</ul>
		</div>
	</div>
</nav>