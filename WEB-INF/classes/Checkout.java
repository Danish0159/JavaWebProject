import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;


public class Checkout extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{        
    response.setContentType("text/html");
PrintWriter out = response.getWriter();

	HttpSession session = request.getSession(true);
 	String total = (String)session.getAttribute("ORDERTOTAL");
	out.println("Order Total: " + total);

	



    out.close();
   
} 
}

