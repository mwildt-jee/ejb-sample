<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.ejb.EJB" %>
<%@ page import="de.hsw.sample.ejb.core.service.ArticleService" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<jsp:include page="head.jsp"></jsp:include>
	<title>Shop - Benutzer</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

	<div class="container">

		<%! @EJB ArticleService articleService; %>
	
		<h1>Artikelübersicht</h1>

		<c:forEach items="${articles}" var="article">
			<div class="panel panel-default" id="article-${article.articleNo}">
				<div class="panel-heading">
					<span>${article.title} (Artikel#: ${article.articleNo})</span>
					<span class="pull-right">
						<a class="btn btn-xs add-to-cart"
							href="AddToCartAction?articleNo=${article.articleNo}"
						>In den Einkaufswagen</a>	
					</span>
				</div>
				<div class="panel-body">${article.description}</div>
			</div>
		</c:forEach>
	</div>

</body>
</html>