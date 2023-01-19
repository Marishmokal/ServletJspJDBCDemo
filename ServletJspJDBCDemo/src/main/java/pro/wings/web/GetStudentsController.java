package pro.wings.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pro.wings.web.dao.StudentsDao;
import pro.wings.web.model.Students;

/**
 * Servlet implementation class GetStudentsController
 */
public class GetStudentsController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int id=Integer.parseInt(request.getParameter("a_id"));
		StudentsDao dao=new StudentsDao();
		Students s1=dao.getStudents(id);
		
		
		
		HttpSession session=request.getSession();
		session.setAttribute("vaibhav", s1);
		response.sendRedirect("ShowStudents.jsp");
	}

	

}
