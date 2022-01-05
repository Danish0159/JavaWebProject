import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;


public class Cart extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{        
response.setContentType("text/html");
HttpSession session = request.getSession(true);
PrintWriter out = response.getWriter();

String counter = (String)session.getAttribute("counter");
int count = Integer.parseInt(counter);

for (int i = 1; i<count;i++)
{
String sitems []= new String [count];
sitems[i-1] = (String)session.getAttribute("c" + i);
if((sitems[i-1]).equals("Football"))
{
out.println("Football<br>"); 
}
if((sitems[i-1]).equals("Studs"))
{
 out.println("Studs<br>"); 
}
if((sitems[i-1]).equals("Gloves"))
{
out.println("Gloves<br>"); 
}

}


out.close();
   
} 
}

