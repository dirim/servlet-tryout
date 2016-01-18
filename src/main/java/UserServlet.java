import model.User;
import service.UserService;
import javax.annotation.PostConstruct;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by dirim on 12/23/2015.
 */
@WebServlet("/users")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setAttribute("users", UserService.getInstance().getUsers());
        req.setAttribute("userService", UserService.getInstance());

        req.getRequestDispatcher(req.getContextPath() + "/display.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        User user = new User();
        user.setID((UserService.getInstance().getUsers().size()+1) + "");
        user.setName(req.getParameter("name"));
        user.setUsername(req.getParameter("username"));
        user.setPassword(req.getParameter("password"));
        user.setAddress(req.getParameter("address"));
        user.setTelephone(req.getParameter("telephone"));
        UserService.getInstance().addUser(user);
        //doGet(req, resp);
        resp.sendRedirect("/users");
    }
}
