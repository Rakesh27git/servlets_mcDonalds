package servelet_jsp_McDonalds_controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servelet_jsp_McDonalds_dao.ItemsDao;
import servelet_jsp_McDonalds_dao.MenuDao;
import servelet_jsp_McDonalds_dto.Items;
import servelet_jsp_McDonalds_dto.Menu;

@WebServlet("/orderid")
public class ItemsController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id=Integer.parseInt((String) req.getAttribute("id"));
		MenuDao dao=new MenuDao();
		Menu menu=dao.getMenuById(id);
		if(menu!=null)
		{
			req.setAttribute("menus", menu);
			RequestDispatcher dispatcher=req.getRequestDispatcher("additems.jsp");
			dispatcher.forward(req, resp);
			
		}
		
	}

}
