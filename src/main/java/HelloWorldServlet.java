import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "HelloWorldServlet", urlPatterns="/hello")

public class HelloWorldServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        System.out.println("Privet!");
        PrintWriter output = res.getWriter();
        output.print("<h1>Hello, World!</h1>");

//   ====================== REVIEW 8/20/18  ====================== \\
//better way to execute this, also includes the getParameter for printing the passed name parameter
//        PrintWriter out = null;
//        String name = (req.getParameter("name") != null) ? req.getParameter("name") : "World!";

//        try {
//            out = res.getWriter();
//            output.print("<h1>Hello, World!</h1>");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//    }

    }
}
