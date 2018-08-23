import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "UserLogoutServlet", urlPatterns = "/logout")
public class UserLogoutServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session1 = request.getSession();

//   this works for logout button
        if (request.getParameter("logout") != null ) {
            session1.invalidate();
            response.sendRedirect("/login");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/logout.jsp").forward(request, response);

//       logout feat. should go here because user visits /logout (GET request) to log out.


    }
}
