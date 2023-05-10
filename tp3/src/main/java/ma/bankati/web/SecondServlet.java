package ma.bankati.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/hello2")
public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        var out= resp.getWriter();
        out.println("<h1 style=\"font-family:Optima\">"+" Bonjour mes amis ^_^ </h1>");
        out.println("<h2> Protocole utilisé \t:"+req.getProtocol()+"<h2>");
        out.println("<h2> Methode Http utlisé \t:"+req.getMethod()+"<h2>");
        out.println("<h2> Serveur utilise\t:"+req.getServerName()+"<h2>");
        out.println("<h2> Port utilisé\t:"+req.getServerPort()+"<h2>");
    }
}