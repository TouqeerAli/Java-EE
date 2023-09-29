package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FormData
 */
public class FormData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String name = request.getParameter("myName");
		String rollNo = request.getParameter("rollNo");
		String phone = request.getParameter("phoneNum");
		String department = request.getParameter("department");
		
		PrintWriter printWriter = response.getWriter();
		printWriter.write("<h1>Student Data<h1>");
		printWriter.write("<p>Name : "+name+"</p>");
		printWriter.write("<p>Roll No : "+rollNo+"</p>");
		printWriter.write("<p>Phone No : "+phone+"</p>");
		printWriter.write("<p>Department : "+department+"</p>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
