package servelet_jsp_McDonalds_controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servelet_jsp_McDonalds_dao.ItemsDao;
import servelet_jsp_McDonalds_dto.Items;

public class InsertItems extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String desc=req.getParameter("desc");
		double price=Double.parseDouble("price");
		String offer=req.getParameter("offer");
		int quantity=Integer.parseInt(req.getParameter("quantity"));
		
		Items items=new Items();
		items.getI_id();
		items.getI_name();
		items.getI_desc();
		items.getI_price();
		items.getI_offer();
		items.getI_quantity();
		
		ItemsDao dao=new ItemsDao();
		dao.saveItems(items);
		
		
	}
	
	

}
