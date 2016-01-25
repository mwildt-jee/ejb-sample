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
 * Servlet implementation class ShowUserAction
 */
@WebServlet("/ShowUserAction")
public class ShowUserAction extends HttpServlet {
	
	@EJB
	private UserService userService;
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		
		User user = userService.getByUsername(username);
		if(null != user){
			response.getWriter().append(String.format("Hallo %s [hash: %s]", user.getUsername(), user.getPassword()));
		} else {
			response.getWriter().append(String.format("Der Benutzer mit den Nammen %s existiert nicht", username));
		}
	}

}
