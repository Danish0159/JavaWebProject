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
out.println("         margin-bottom: 5rem;");
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


out.println("     #search-form { ");
out.println("             display: flex;");
out.println("             justify-content: flex-end;");
out.println("         }");

out.println("</style>");  
out.println("</head>");


out.println("<body>");
out.println("       <div class=container>");
out.println("           <h1 class=title>Ecommerce Site</h1>");
out.println("  <form id=search-form action=Search method=post>");
out.println("   <div>");
out.println("       <input class=submit type=submit value=Custom Search>");
out.println("   </div>");
out.println("  </form>");
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
  out.println("                   <div class=products__div>");
  out.println("                       <img src=https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRIflu10Jv_TLhJXCDUIohJ8Fk_NUEGOTqt0w&usqp=CAU>");
  out.println("                       <div class=product_info>");
  out.println("                           <h4>CRCKET BAT(90$)</h4>");
  out.println("                           <input type=checkbox id=check_4 name=Bat value=Toy4>");
  out.println("                           <label for=check_4>ADD TO CART</label>");
  out.println("                       </div>");
  out.println("                   </div>");
  out.println("                   <div class=products__div>");
  out.println("                       <img src=data:image/jpeg;base64,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>");
  out.println("                       <div class=product_info>");
  out.println("                           <h4>CRICKET BOWL (100$)</h4>");
  out.println("                           <input type=checkbox id=check_5 name=Bowl value=Toy5>");
  out.println("                           <label for=check_5>ADD TO CART</label>");
  out.println("                       </div>");
  out.println("                   </div>");
  out.println("                   <div class=products__div>");
  out.println("                       <img src=data:image/jpeg;base64,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>");
  out.println("                       <div class=product_info>");
  out.println("                           <h4>CRICKET PADS(110$)</h4>");
  out.println("                           <input type=checkbox id=check_6 name=Pads value=Toy6>");
  out.println("                           <label for=check_6>ADD TO CART</label>");
  out.println("                       </div>");
  out.println("                   </div>");

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