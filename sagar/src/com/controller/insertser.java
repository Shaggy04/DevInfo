package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLmanager;
import com.pojo.Addmember;
import com.pojo.Position;
import com.pojo.Sponser;

/**
 * Servlet implementation class insertser
 */
@WebServlet("/insertser")
public class insertser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Addmember add=new Addmember();
	Position p=new Position();
	Sponser s=new Sponser();
	BLmanager bl=new BLmanager();
    public insertser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name=request.getParameter("name");
		String surname=request.getParameter("surname");
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String mobile=request.getParameter("mobile");
		String enrollment_fee=request.getParameter("enrollment_fee");
		
		bl.savedata(add);
		bl.savesponser(s);
		response.sendRedirect("insertsponser.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}

}
