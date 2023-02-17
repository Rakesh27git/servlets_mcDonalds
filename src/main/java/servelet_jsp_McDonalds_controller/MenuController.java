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
import servelet_jsp_McDonalds_dto.Menu;

@WebServlet("/savemenu")
public class MenuController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String desc = req.getParameter("desc");
		double price = Double.parseDouble(req.getParameter("price"));
		String offer = req.getParameter("offer");
	

		Menu menu = new Menu();
	
		menu.setM_name(name);
		menu.setM_desc(desc);
		menu.setM_price(price);
		menu.setM_offer(offer);

		MenuDao dao = new MenuDao();
		Menu menu1 = dao.saveMenu(menu);

		if (menu1 != null) {
			List<Menu> list = dao.getAllMenu();
			req.setAttribute("menus", list);
			RequestDispatcher dispatcher = req.getRequestDispatcher("showmenu.jsp");
			dispatcher.forward(req, resp);
		}

	}

}
