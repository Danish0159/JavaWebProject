import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;


public class Logout extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{        
        response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	HttpSession session = request.getSession(false);
 
out.println("<!DOCTYPE html>");
out.println("<html>");
out.println("<head>");
out.println("<meta charset=UTF-8>");  
out.println("<meta http-equiv=X-UA-Compatible content=IE=edge>");  
out.println("<meta name=viewport content=width=device-width initial-scale=1.0>");  
out.println("<title>Calculate</title>");
out.println("<title>Calculate</title>");
out.println("<link rel=preconnect href=https://fonts.googleapis.com>");
out.println("<link rel=preconnect href=https://fonts.gstatic.com crossorigin>");
out.println("<link rel=preconnect href=https://fonts.googleapis.com>");
out.println("<link rel=preconnect href=https://fonts.gstatic.com crossorigin>");
out.println("<link href=https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap rel=stylesheet>");

out.println("<style>"); 
out.println("        * {");
out.println("            margin: 0;");
out.println("            padding: 0;");
out.println("        }");
out.println("        a {");
out.println("            text-decoration: none;");
out.println("                        font-family: inherit;");
out.println("                        font-size: 1rem;");
out.println("        }");
out.println("        body {");
out.println("            font-family: 'Roboto', sans-serif;");
out.println("            padding: 0;");
out.println("            margin: 0;");
out.println("            background-image: linear-gradient(to right, rgb(155, 51, 102), rgb(86, 38, 93));");
out.println("        }");
out.println("        .btn {");
out.println("            width: 120px;");
out.println("            padding: 1rem 0rem;");
out.println("            background-color: rgb(155, 51, 102);");
out.println("            color: white;");
out.println("            border: none;");
out.println("            cursor: pointer;");
out.println("            text-align: center;");
out.println("        }");
out.println("        .container {");
out.println("            max-width: 30rem;");
out.println("            margin: auto;");
out.println("            padding: 10rem;");
out.println("            display: flex;");
out.println("            align-items: center;");
out.println("            justify-content: space-between;");
out.println("        }");
out.println("        input {");
out.println("            font-family: inherit;");
out.println("            font-size: 1rem;");
out.println("        }");

out.println("</style>");  


out.println("</head>");
out.println("<body>");


out.println("    <div class=container>");
out.println("        <a class=btn href=http://localhost:8080/WebProject/Login.html>Login</a>");
out.println("    </div>");

out.println("</body>");
out.println("</html>");

	session.invalidate();
	out.close();	   

	
} 
}
