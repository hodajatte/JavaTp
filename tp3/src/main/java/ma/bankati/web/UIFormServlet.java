package ma.bankati.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/form")
public class UIFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
  //req.getRequestDispatcher("resp.jsp").forward(req,resp);
        resp.setContentType("text/plain");
        PrintWriter out=resp.getWriter();
        out.println("Nom:" +req.getParameter("nom"));
        out.println("Prénom:" +req.getParameter("prenom"));

        if
        (req.getParameterValues("radio1")[0].equals("mas"))
               out.print("C'est un homme. Il");
          else
            out.print("c'est une femme.Elle");

        out.print(" a écrit:");
        out.println(req.getParameter("textarea"));




    }


}
