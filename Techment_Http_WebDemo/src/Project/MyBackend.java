package Project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyBackend
 */
@WebServlet("/MyBackend")
public class MyBackend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("ewlcome to website");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("hello this is from server");
		String name=request.getParameter("username");
	
		int age1=Integer.parseInt(request.getParameter("age"));
		out.print("your name is"+name+ "<br>" );
		out.print("your age is"+age1+"<br>");
		
		if(age1>=18) 
			out.print("you can vote"+"<br>");
		else
				out.print("you can not vote");
	
		/*
		 * it is created by browser.....................
		 */
		Cookie cookie=new Cookie("key1",name);
		out.print("<a href= 'Second'> second page </a>");
	}

}
