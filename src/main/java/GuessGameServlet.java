import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;


@WebServlet(name = "GuessGameServlet", urlPatterns = "/guess")
public class GuessGameServlet extends HttpServlet {

private static int  correctNumber = getRandomNumber();
//private static String message;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int userGuess = Integer.parseInt(request.getParameter("userGuess"));
        request.setAttribute("userGuess", userGuess);
        request.setAttribute("correctNumber", correctNumber);

//   logic to check user guess vs. random num, sets message to be used in guessResult.jsp \\
        String message;
        if (userGuess == correctNumber) {
            message = "You win!";
        } else if (userGuess > correctNumber) {
            message = "Too HIGH...";
        } else {
            message = "Too LOW...";
        }

       request.getParameter(message);
       request.setAttribute("message", message);
//       issue i had was having the requestDispatcher pass req/resp objects BEFORE my conditionals \\
       request.getRequestDispatcher("/guessResult.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/guess.jsp").forward(request, response);
    }

    private static int getRandomNumber(){
        Random rand = new Random();
        int  n = rand.nextInt(100) + 1;
        return n;
    }

}
