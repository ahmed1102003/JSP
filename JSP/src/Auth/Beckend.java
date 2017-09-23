package Auth;

import java.beans.Beans;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.swing.internal.plaf.basic.resources.basic_zh_HK;

/**
 * Servlet implementation class Beckend
 */

@WebServlet(description="JSP" , urlPatterns={"/Auth"})


public class Beckend extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Beckend() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		if (request.getParameter("foodtype") != null || request.getParameter("location") != null )
		{
			
			String foodtype =  request.getParameter("foodtype").toString();
			
			String location = request.getParameter("location").toString();
			
			Bean b = new Bean();
			
			try 
			{
			
				ArrayList<String> match = b.search(foodtype,location);
				
				request.setAttribute("Rest", match);
					
				getServletContext().getRequestDispatcher("/Home.jsp")
				 .forward(request, response);
				
				//response.getWriter().write("This is from Servlet to JSP page");
				
				//response.getWriter().write(match.toString());
			
			}
		
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
	}	
			
			
		}
	}

}
