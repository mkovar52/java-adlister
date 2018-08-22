import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ViewIndexServlet", urlPatterns = "/ads")
public class ViewIndexServlet extends HttpServlet {

//    why this approach vs. the List<Ad> like the employee example
    Ads adsDao = DaoFactory.getAdsDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("ads", adsDao.all());
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);

    }
}
