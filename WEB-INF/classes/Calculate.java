import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;


public class Calculate extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{  
int p1=0;
int p2=0;
int p3=0;
int totalPrice=0;      

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
 p1=50;
}
if((sitems[i-1]).equals("Studs"))
{
 p2=60;
}
if((sitems[i-1]).equals("Gloves"))
{
 p3=80;
}

}

totalPrice= p1+p2+p3;
session.setAttribute("ORDERTOTAL" , totalPrice + "");
      


out.println("<html>");
out.println("<body>"); 
out.println("<br> <br><form method=post action=Cart>"); 
out.println("<input type=submit value=Cart>"); 
out.println("</form>");

out.println("<br> <br> <br><form method=post action=Checkout>"); 
out.println("<input type=submit value=Checkout>"); 
out.println("</form>");


out.println("<a href=http://localhost:8080/WebProject/Login.html>Logout</a>");  
out.println("</body>");  
out.println("</html>");



out.close();
   
} 
}

