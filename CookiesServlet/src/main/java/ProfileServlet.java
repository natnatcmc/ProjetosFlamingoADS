import java.io.IOException;  
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse; 

public class ProfileServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
    
                          throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        request.getRequestDispatcher("link.html").include(request, response);  
          
        Cookie ck[]=request.getCookies();  
        if(ck!=null){  
         String name=ck[0].getValue();  
        if(!name.equals("")||name!=null){  
            out.print("<b>Bem-vindo(a) ao perfil!</b>");  
            out.print("<br>Bem-vindo(a), "+ name);  
        }  
        }else{  
            out.print("Por favor faça login antes");  
            request.getRequestDispatcher("login.html").include(request, response);  
        }  
        out.close();  
    }  
    
}