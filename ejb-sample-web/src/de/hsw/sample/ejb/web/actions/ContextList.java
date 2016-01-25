package de.hsw.sample.ejb.web.actions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.hsw.sample.ejb.core.service.ShoppingCart;
import de.hsw.sample.ejb.core.service.UserService;

/**
 * Servlet implementation class ContextList
 */
@WebServlet("/ContextList")
public class ContextList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContextList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("<html>");
		
		try {
			lookup("", response.getWriter());
			lookup("ejb", response.getWriter());
			
			
			/*
			 * Mit EJB müssen wir den EJB-Namen kennen. WEnn der Scope kleiner als der eigentliche ist,
			 * kann der Lookup nicht durch injectetion gemacht werden.
			 */
			
			ShoppingCart cart = (ShoppingCart) new InitialContext().lookup("shopping-cart");
			
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		response.getWriter().append("</html>");
		
	}
	
	
	public void lookup(String path, PrintWriter w) throws NamingException{
		w.append(String.format("<h2>%s</h2>", path));
		InitialContext ic = new InitialContext();
		
		w.append("<ul>");
		
		NamingEnumeration<NameClassPair> set = ic.list(path);
		while(set.hasMore()){
			NameClassPair item = set.next();
			w.append(String.format("<li>%s/%s : %s</li>", path, item.getName(), item.getClassName()));
		}
		w.append("</ul>");
	}
	
	

}
