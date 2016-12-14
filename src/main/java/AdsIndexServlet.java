import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Nick on 12/14/16.
 */
@WebServlet(name = "AdsIndexServlet", urlPatterns = "/ads")
public class AdsIndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Ad> ads = DaoFactory.getAdsDao().all();
        request.setAttribute("ads", ads);


        //make a variable that holds the result of calling all() method on ListAdsDao

        //Send that data into the view
        //set parameter on response

        //in the view, iterate across the list and output the ads


        request.getRequestDispatcher("ads/index.jsp").forward(request,response);
    }
}
