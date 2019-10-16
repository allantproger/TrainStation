package kz.edu.nu.cs.se.Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = { "/submit" })
public class ServletExample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

        String name = req.getParameter("userNameaaaa");
        String email = req.getParameter("email");
        String ip = req.getRemoteAddr();
        System.out.println("ПОШЁЛ НАХ АЛИБ");
    }
}
