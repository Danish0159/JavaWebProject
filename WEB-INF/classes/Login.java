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
       

out.println("<!DOCTYPE html>");
out.println("<html>");
out.println("<head>");
out.println("<meta charset=UTF-8>");  
out.println("<meta http-equiv=X-UA-Compatible content=IE=edge>");  
out.println("<meta name=viewport content=width=device-width initial-scale=1.0>");  
out.println("<title>Login</title>");
out.println("<title>Login</title>");
out.println("<link rel=preconnect href=https://fonts.googleapis.com>");
out.println("<link rel=preconnect href=https://fonts.gstatic.com crossorigin>");
out.println("<link rel=preconnect href=https://fonts.googleapis.com>");
out.println("<link rel=preconnect href=https://fonts.gstatic.com crossorigin>");
out.println("<link href=https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap rel=stylesheet>");


out.println("<style>");    

out.println("      * {");
out.println("          margin: 0;");
out.println("           padding: 0;");
out.println("      }");

out.println("  body {");
out.println("        font-family: 'Roboto', sans-serif;");
out.println("        padding: 0;");
out.println("        margin: 0;");
out.println("        background-image: linear-gradient(to right, rgb(155, 51, 102), rgb(86, 38, 93));");
out.println("    }");

out.println(" .container {");
out.println(" margin: 5rem 5rem;");
out.println(" padding: 2rem 2rem;");
out.println(" background-color: #fff;");
out.println(" }");      

out.println(" .title {");
out.println(" text-align: center;");
out.println(" font-weight: 600;");
out.println(" }");

  
out.println(" input[type=checkbox]:not(:checked),");
out.println(" input[type=checkbox]:checked {");
out.println(" position: absolute;");
out.println(" left: -9999%;");
out.println(" }");
      


out.println(" input[type=checkbox]+label {");
out.println(" display: inline-block;");
out.println(" padding: 10px;");
out.println(" cursor: pointer;");
out.println(" border: 1px solid black;");
out.println(" color: black;");
out.println(" background-color: white;");
out.println(" margin-bottom: 10px;");
out.println(" }");

out.println("      input[type=checkbox]:checked+label { ");
out.println("          border: 1px solid white; ");
out.println("          color: white; ");
out.println("          background-color: rgb(155, 51, 102); ");
out.println("      } ");

out.println(" .products {");
out.println(" text-align: center;");
out.println(" }");
    
out.println(" .products__grid {");
out.println(" max-width: 110rem;");
out.println(" margin: auto;");
out.println(" margin-top: 3rem;");
out.println(" display: grid;");
out.println(" grid-template-columns: repeat(auto-fit, minmax(30%, 1fr));");
out.println(" grid-gap: 2rem;");
out.println(" margin-bottom: 4rem;");
out.println(" }");

out.println(" @media only screen and (max-width: 900px) {");
out.println(" .products__grid {");
out.println(" max-width: 100%;");
out.println(" grid-template-columns: repeat(auto-fit, minmax(40%, 1fr));");
out.println(" }");
out.println(" }");

out.println(" @media only screen and (max-width: 500px) {");
out.println(" .products__grid {");
out.println(" max-width: 100%;");
out.println(" grid-template-columns: repeat(auto-fit, minmax(100%, 1fr));");
out.println(" }");
out.println(" }");

out.println(" .product_info {");
out.println(" padding: .4rem .6rem;");
out.println(" display: flex;");
out.println(" justify-content: space-between;");
out.println(" align-items: center;");
out.println(" }");
    
out.println("     .products__div {");
out.println("         margin-bottom: 1.4rem;");
out.println("         height: 260px;");
out.println("     }");

out.println("     .products__div img {");
out.println("         border-radius: 15px;");
out.println("         width: 100%;");
out.println("         height: 100%;");
out.println("     }");

out.println("     .submit {");
out.println("         display: block;");
out.println("         width: 130px;");
out.println("         margin: auto;");
out.println("         padding: .7rem 0rem;");
out.println("         color: white;");
out.println("         border: 1px solid white;");
out.println("         background-color: rgb(155, 51, 102);");
out.println("         font: inherit;");
out.println("         cursor: pointer;");
out.println("     }");
out.println("</style>");  
out.println("</head>");


out.println("<body>");
out.println("       <div class=container>");
out.println("           <h1 class=title>Ecommerce Site</h1>");
out.println("           <form method=post action=Products>");
out.println("               <section class=products>");
out.println("                   <div class=products__grid>");
out.println("                       <div class=products__div>");
out.println("                           <img src=https://images.unsplash.com/photo-1575361204480-aadea25e6e68?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8NXx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60");
out.println("                               alt=products>");
out.println("                           <div class=product_info>");
out.println("                               <h4>FOOTBALL (50$)</h4>");
out.println("                               <input type=checkbox id=check_1 name=Football value=Toy>");
out.println("                               <label for=check_1>ADD TO CART</label>");
out.println("                           </div>");
out.println("                       </div>");
out.println("                       <div class=products__div>");
out.println("                           <img src=https://media.istockphoto.com/photos/football-boots-isolated-picture-id667118840?b=1&k=20&m=667118840&s=170667a&w=0&h=qc6wqw-VsnfwpiTfW974S86dl_A0LgNtB2Sa57K5YI8=");
out.println("                               alt=products>");
out.println("                           <div class=product_info>");
out.println("                               <h4>STUDS (60$)</h4>");
out.println("                               <input type=checkbox id=check_2 name=Studs value=Toy2>");
out.println("                               <label for=check_2>ADD TO CART</label>");
out.println("                           </div>");
out.println("                       </div>");
out.println("                       <div class=products__div>");
out.println("                           <img src=https://media.istockphoto.com/photos/soccer-ball-and-goalkeeper-gloves-picture-id465695622?b=1&k=20&m=465695622&s=170667a&w=0&h=Pd9c8-qoQf2zhNDd0_rYED4HlLuOiA7bkcV6s7TAabg=");
out.println("                               alt=products>");
out.println("                           <div class=product_info>");
out.println("                               <h4>GLOVES (80$)</h4>");
out.println("                               <input type=checkbox id=check_3 name=Gloves value=Toy3>");
out.println("                               <label for=check_3>ADD TO CART</label>");
out.println("                           </div>");
out.println("                       </div>");
out.println("                   </div>");
out.println("               </section>");
out.println("               <input class=submit type=submit value=PROCEED>");
out.println("           </form>");
out.println("       </div>");
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