import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;


public class Login extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{        
	
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    HttpSession session = request.getSession(true);
    String name = request.getParameter("name");   
    session.setAttribute("userName" , name);
     
try {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1/danish";
        Connection con = DriverManager.getConnection(url, "root", "root");
        Statement st = con.createStatement();

        String query = "Select * from profile where personName='" + name + "' ";

        ResultSet obj = st.executeQuery(query);    
	 if (obj.next()) {
            name = obj.getString("personName");
            String address = obj.getString("address");
            int num = Integer.parseInt(obj.getString("phone"));
            out.println("Name: " + name + "\tAddress: " + address + "\tNumber: " + num);

out.println("<html>");
out.println("<body>"); 

out.println("<form method=post action=Products>"); 
out.println("Football (Price: 50$) <input type=checkbox name=Football value=Toy> <br>"); 
out.println("Studs (Price: 60$) <input type=checkbox name=Studs value=Toy2> <br>"); 
out.println("Gloves (Price: 80$) <input type=checkbox name=Gloves value=Toy3> <br>"); 
out.println("<input type=submit value=submit>"); 

out.println("</form>");

out.println("</body>");  
out.println("</html>");


  } else {
            out.println("No record found");
        }


	st.close();
	con.close();
	out.close();
}
catch(Exception Ex)
{
   out.println(Ex);
}
} 
}