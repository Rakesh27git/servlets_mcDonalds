package servelet_jsp_McDonalds_controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servelet_jsp_McDonalds_dao.UserDao;
import servelet_jsp_McDonalds_dto.User;
@WebServlet("/save")
public class UserSignUp extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		long phone=Long.parseLong(req.getParameter("phone"));
		String address=req.getParameter("address");
		String role=req.getParameter("role");
		
		User user=new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setPhone(phone);
		user.setAddress(address);
		user.setRole(role);
		
		UserDao dao=new UserDao();
		User user1=dao.saveUser(user);
		
		if(user1!=null)
		{
			req.setAttribute("key", "Signed Up Sucessfully");
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
