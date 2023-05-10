package ma.bankati.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import static java.lang.System.out;

@WebServlet(name="HS",urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        var out= response.getWriter();
   out.println("<h1 style=\"font-family:Optima\">"+" Hello from HelloServlet ^_^ </h1>");
   out.println("<h2> Protocole utilisé \t:"+request.getProtocol()+"<h2>");
        out.println("<h2> Methode Http utlisé \t:"+request.getMethod()+"<h2>");
        out.println("<h2> Serveur utilise\t:"+request.getServerName()+"<h2>");
        out.println("<h2> Port utilisé\t:"+request.getServerPort()+"<h2>");


    }
}
