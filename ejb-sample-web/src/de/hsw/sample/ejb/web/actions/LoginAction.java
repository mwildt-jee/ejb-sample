package de.hsw.sample.ejb.web.actions;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.hsw.sample.ejb.core.model.User;
import de.hsw.sample.ejb.core.service.UserService;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	
	
	private static final long serialVersionUID = 2L;

	@EJB
	UserService userService;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	
		User user = userService.getByUsername(username);
		
		if(null == user){
			System.out.println("userNotFound");
			response.sendRedirect("login.jsp");
		}		

		if(userService.checkCredentials(user, password)){
			request.getSession().setAttribute("user", user);
			response.sendRedirect("user.jsp");
		} else {
			System.out.println("Invalid Credentials");
			response.sendRedirect("login.jsp");
		}
		
	}

}
