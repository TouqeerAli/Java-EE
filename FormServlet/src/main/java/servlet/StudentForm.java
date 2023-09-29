package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class StudentForm
 */
public class StudentForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public StudentForm() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.write("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Form</title>\r\n"
				+ "</head>\r\n"
				+ "<body style=\"background-color: #1a211a; color: white;\">\r\n"
				+ "    <div \r\n"
				+ "    style=\"display: flex;\r\n"
				+ "    justify-content: center; \r\n"
				+ "    align-items: center;  \r\n"
				+ "    position: absolute;\r\n"
				+ "    top:0;\r\n"
				+ "    bottom: 0;\r\n"
				+ "    left: 0;\r\n"
				+ "    right: 0;\r\n"
				+ "    \r\n"
				+ "    margin: auto;\">\r\n"
				+ "        <div style=\"border: 2px solid black; display: inline-block; padding: 40px; border-radius: 10px; background-color: #657863; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; font-weight: bold;\">\r\n"
				+ "            <h3 style=\"text-align: center;\">Student Form</h3>\r\n"
				+ "            <table>\r\n"
				+ "                <form action=\"FormData\">\r\n"
				+ "                    <tr>\r\n"
				+ "                        <td><label for=\"\">Name : </label></td>\r\n"
				+ "                        <td><input type=\"text\" name=\"myName\"></td>\r\n"
				+ "                    </tr>\r\n"
				+ "                    <tr>\r\n"
				+ "                        <td><label for=\"\">Roll No : </label></td>\r\n"
				+ "                        <td><input type=\"text\" name=\"rollNo\"></td>\r\n"
				+ "                    </tr>\r\n"
				+ "                    <tr>\r\n"
				+ "                       <td> <label for=\"\">Ph# : </label></td>\r\n"
				+ "                        <td><input type=\"text\" name=\"phoneNum\"></td>\r\n"
				+ "                    </tr>\r\n"
				+ "                    <tr>\r\n"
				+ "                    <td><label for=\"\">Department : </label></td>\r\n"
				+ "                   <td>\r\n"
				+ "                    <select name=\"department\" id=\"\">\r\n"
				+ "                        <option value=\"Computer Systems\">Computer Systems</option>\r\n"
				+ "                        <option value=\"Software\">Software</option>\r\n"
				+ "                        <option value=\"Electronics\">Electronics</option>\r\n"
				+ "                        <option value=\"Electrical\">Electrical</option>\r\n"
				+ "                    </select>\r\n"
				+ "                   </td>\r\n"
				+ "                    </tr>\r\n"
				+ "                    \r\n"
				+ "                    <tr>\r\n"
				+ "                        <td></td>\r\n"
				+ "                        <td><input type=\"submit\"></td>\r\n"
				+ "                    </tr>\r\n"
				+ "                    \r\n"
				+ "                </form>\r\n"
				+ "            </table>\r\n"
				+ "            \r\n"
				+ "        </div>\r\n"
				+ "    </div>\r\n"
				+ "    \r\n"
				+ "    \r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
