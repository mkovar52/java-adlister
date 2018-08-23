import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (request.getSession().getAttribute("user") == null) {
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        } else {
            response.sendRedirect("/profile");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        HttpSession session = request.getSession();

//        if (request.getParameter("username") != null && request.getParameter("password") != null) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
//            session.setAttribute("user", username);
//
//            if (username.length() > 0 && username.equals("mykel") && password.equals("codeup")) {
//
//                response.sendRedirect("/profile");
//            } else {
//                response.sendRedirect("/login");
//            }
//        }

        boolean validAttempt = username.equals("admin") && password.equals("password");

        if (validAttempt) {
            session.setAttribute("user", username);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }

//    working solution ==================================
//        if (request.getParameter("username") != null && request.getParameter("password") != null) {
//            String username = request.getParameter("username");
//            String password = request.getParameter("password");
//            session.setAttribute("user", username);
//
//            if (username.length() > 0 && username.equals("mykel") && password.equals("codeup")) {
//
//                response.sendRedirect("/profile");
//            } else {
//                response.sendRedirect("/login");
//            }
//        }


}
