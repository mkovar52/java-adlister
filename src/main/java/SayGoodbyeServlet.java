import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//import java.io.PrintWriter;


@WebServlet(name = "SayGoodbyeServlet", urlPatterns="/bye")

public class SayGoodbyeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("goodbye.");
        PrintWriter output = res.getWriter();
        output.print("<h1>bye for now!</h1>");
    }

}
