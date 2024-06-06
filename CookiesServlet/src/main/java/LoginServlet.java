import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class LoginServlet extends HttpServlet {  

	 protected void doPost(HttpServletRequest request, HttpServletResponse response)  
             throws ServletException, IOException {  
response.setContentType("text/html");  
PrintWriter out=response.getWriter();  

request.getRequestDispatcher("link.html").include(request, response);  

String name=request.getParameter("name");  
String password=request.getParameter("password");  

if(password.equals("admin123")){  
out.print("Você fez login!");  
out.print("<br>Bem-vindo, "+name);  

Cookie ck=new Cookie("nome",name);  
response.addCookie(ck);  
}else{  
out.print("Erro no usuário ou senha.");  
request.getRequestDispatcher("login.html").include(request, response);  
}  

out.close();  
}  


}
