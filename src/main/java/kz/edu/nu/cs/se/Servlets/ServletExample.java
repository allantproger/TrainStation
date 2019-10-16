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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("userName");
        String email = req.getParameter("email");
        String ip = req.getRemoteAddr();
        System.out.println("ПОШЁЛ НАХ АЛИБ");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("KRASAVCHIK!!");
    }
}
