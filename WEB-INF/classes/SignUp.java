import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;


public class SignUp extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{        
	
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    String name = request.getParameter("name");   
    String address = request.getParameter("adress");
    int num = Integer.parseInt(request.getParameter("number"));
    
try{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1/danish";
        Connection con = DriverManager.getConnection(url, "root", "root");
        Statement st = con.createStatement();

        String query = "insert into profile(personName,address,phone) values('" + name + "','" + address + "'," + num + ")";
        int rs = st.executeUpdate(query);
    
        if (rs > 0) {
        out.println("<html>");
        out.println("<head>");
        out.println("<title>HomeTask</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>You are Signed Up</p>");
        out.println("</body>");
        out.println("</html>");
   }
else {
    out.println("<html>");
    out.println("<head>");
    out.println("<title>HomeTask</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<p>Your Record NOt Added</p>");
    out.println("</body>");
    out.println("</html>");

        }
st.close();
con.close();
out.close();
}
catch(Exception Ex)
{


 out.println("<html>");
out.println("<body>"); 

out.println("The user already Exist ! Please Login");
out.println("<a href=http://localhost:8080/WebProject/Login.html>Login</a>");  
out.println("</body>");  
out.println("</html>");


}
} 
}

