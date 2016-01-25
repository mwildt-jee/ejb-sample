package de.hsw.sample.ejb.web.listener;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import de.hsw.sample.ejb.core.service.ShoppingCart;

/**
 * Application Lifecycle Listener implementation class SessionListener
 *
 */
@WebListener
public class SessionListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public SessionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
    	
    	try {
    		// http://docs.oracle.com/javaee/6/tutorial/doc/gipjf.html
    		// same as context.lookup("jndi:global/samle-ejb/sample-ejb-core/ShoppingCartListImpl/ShoppingCart");
    		InitialContext context = new InitialContext();
    		String name = "java:global/sample-ejb/sample-ejb-core/ShoppingCartListImpl";
    		System.out.println("lookup " + name);
			ShoppingCart cart = (ShoppingCart) context.lookup(name);
			System.out.println(cart.getAll().size());
			arg0.getSession().setAttribute("cart",cart);
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
        System.out.println("Destroy Session");
    }
	
}
