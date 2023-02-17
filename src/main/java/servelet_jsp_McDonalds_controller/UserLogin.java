package servelet_jsp_McDonalds_controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servelet_jsp_McDonalds_dao.MenuDao;
import servelet_jsp_McDonalds_dao.UserDao;
import servelet_jsp_McDonalds_dto.Menu;
import servelet_jsp_McDonalds_dto.User;

@WebServlet("/login")
public class UserLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		UserDao dao = new UserDao();
		User user = dao.loginUser(email);
		MenuDao menudao = new MenuDao();
		
		
		if (password.equals(user.getPassword())) {


			if (user.getRole().equals("manager")) {
				List<Menu> list = menudao.getAllMenu();
				req.setAttribute("menus", list);
				RequestDispatcher dispatcher1 = req.getRequestDispatcher("showmenu.jsp");
				dispatcher1.forward(req, resp);
			} else if (user.getRole().equals("staff")) {
				req.setAttribute("key", "Logged in as staff");
				RequestDispatcher dispatcher2 = req.getRequestDispatcher("display.jsp");
				dispatcher2.forward(req, resp);
			} else {
				req.setAttribute("key", "Logged in as customer");
				List<Menu> list = menudao.getAllMenu();
				req.setAttribute("menus", list);
				RequestDispatcher dispatcher3 = req.getRequestDispatcher("showmenuCust.jsp");
				dispatcher3.forward(req, resp);
			}
		}

	}

}
