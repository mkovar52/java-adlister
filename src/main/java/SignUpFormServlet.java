import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//import java.io.PrintWriter;

@WebServlet(name = "SignUpFormServlet", urlPatterns = "/register")

public class SignUpFormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");

        String html = "<form method=\"POST\" action=\"/register\">\n" +
                "    <label for=\"email\">Email:</label>\n" +
                "    <input id=\"email\" name=\"email\" placeholder=\"Enter your email address\" />\n" +
                " </form>";
        System.out.println("sign-up form started");
        String userEmail = req.getParameter("email");
        System.out.println("User's Email Address: " + userEmail);
//
//        PrintWriter output = res.getWriter();
//        output.print("<h1>bye for now!</h1>");



    }
}
