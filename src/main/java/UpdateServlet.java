import model.User;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dirim on 1/10/2016.
 */
@WebServlet("/users/*")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        String id = pathInfo.substring(1);
        //  String[] pathParts = pathInfo.split("/");
        //  String part1 = pathParts[1]; // {value}
       //   String part2 = pathParts[2]; // test
       //req.getAttribute("userService");
       //req.setAttribute("users", userService.getUsers());
       //User user = userService.getUser(id);
       //req.setAttribute("user", user);
       //System.out.println(user.getName());
       req.setAttribute("user", UserService.getInstance().getUser(id));
       req.getRequestDispatcher(req.getContextPath() + "/selectedUser.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        List<User> users = UserService.getInstance().getUsers();
        String userId = req.getParameter("id");
        int index = users.indexOf(UserService.getInstance().getUser(userId));

        User user = UserService.getInstance().getUser(userId);
        user.setName(req.getParameter("name"));
        user.setUsername(req.getParameter("username"));
        user.setPassword(req.getParameter("password"));
        user.setAddress(req.getParameter("address"));
        user.setTelephone(req.getParameter("telephone"));
        UserService.getInstance().getUsers().set(index, user);

        resp.sendRedirect("./../users");
    }

}
