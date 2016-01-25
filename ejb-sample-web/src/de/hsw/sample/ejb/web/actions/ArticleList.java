package de.hsw.sample.ejb.web.actions;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.glassfish.api.container.RequestDispatcher;

import de.hsw.sample.ejb.core.model.Article;
import de.hsw.sample.ejb.core.service.ArticleService;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/ArticleList")
public class ArticleList extends HttpServlet {
	
	
	private static final long serialVersionUID = 2L;

	@EJB
	ArticleService articleService;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Article> articles = articleService.getAllArticles();
		
		request.setAttribute("articles", articles);
	
		/*
		 * Da eine JSP-Seite nicht für Injektion genutzt werden kann, muss das Servlet als Information-Provider dienen
		 */
		String nextJSP = "/articles.jsp";
		javax.servlet.RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(request,response);
		
	}

}
