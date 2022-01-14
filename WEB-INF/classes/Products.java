import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class Products extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{        
String item = null;
int i =1;
Enumeration e = null;
PrintWriter out = response.getWriter();
HttpSession session = request.getSession(true);

e=request.getParameterNames();
while(e.hasMoreElements())
{
String items = (String)e.nextElement();
session.setAttribute("c" + i , items);
i++;
}

session.setAttribute("counter" , i + "");

RequestDispatcher dis = request.getRequestDispatcher("Calculate");
dis.forward(request , response); 
	   
} 
}

