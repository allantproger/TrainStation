import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Something {



    @WebServlet(
            name = "TrainStatin",
            urlPatterns = {"/"}
    )
    public class HelloServlet extends HttpServlet {
        public HelloServlet() {
        }

        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.getWriter().write("TrainStatin");
        }
    }
}
