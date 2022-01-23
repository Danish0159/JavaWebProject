import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class Find extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{      
response.setContentType("text/html");
PrintWriter out = response.getWriter();
HttpSession session = request.getSession(false);
String product = request.getParameter("product"); 

try {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1/danish";
        Connection con = DriverManager.getConnection(url, "root", "root");
        Statement st = con.createStatement();
	String query = "Select * from search where productName ='" + product + "' ";
	ResultSet obj = st.executeQuery(query);    

	if (obj.next()) {
            product = obj.getString("productName");
            int price = Integer.parseInt(obj.getString("price"));

	    out.println(product);
	    out.println(price);
  }

 else {
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
