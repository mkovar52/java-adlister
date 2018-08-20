import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet(name = "CountServlet", urlPatterns = "/count")

public class CountServlet extends HttpServlet {

    private int count = 1;

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

// ====================== BUGGED SOLUTION, revisit 8/20
        PrintWriter out;
        count = (req.getParameter("reset") != null) ? 0 : count;

        try {
            out = res.getWriter();
            out.println("<h1>"+ ++count+"</h1>");

        } catch (IOException e) {
            e.printStackTrace();
    }






    }

}
