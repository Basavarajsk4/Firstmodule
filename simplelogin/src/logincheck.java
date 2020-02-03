
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class logincheck
 */
@WebServlet("/logincheck")
public class logincheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logincheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
System.out.println("doget method...................................");
		
		
		String uname=request.getParameter("uname");
		String password=request.getParameter("pass");
		
		if(uname.equals("java") && password.equals("123"))
		{
			response.sendRedirect("member.jsp");
		}
		else
		{
			response.sendRedirect("error.jsp");
			
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * System.out.println("dopost method");
		 * 
		 * 
		 * String uname=request.getParameter("uname"); String
		 * password=request.getParameter("pass");
		 * 
		 * if(uname.equals("java") && password.equals("123")) {
		 * response.sendRedirect("member.jsp"); } else {
		 * response.sendRedirect("error.jsp");
		 * 
		 * }
		 */
				{
			
				}
	}

}
