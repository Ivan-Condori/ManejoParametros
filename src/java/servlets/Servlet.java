package servlets;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<body>");
            out.println("Metodo doGet no soportado en el Servlet");
            out.println("</body>");
            out.println("</html>");    
            out.close();
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        //Leemos los parametros del formulario
        //por default el formulario es de tipo Get
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        System.out.println("usuario"+usuario);
        System.out.println("password"+password);
        PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<body>");
            out.println("El parametro usuario es: "+usuario);
            out.println("<br>");
            out.println("El parametro password es: "+password);
            out.println("</body>");
            out.println("</html>");    
            out.close();
    }
}
