package com.tves.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tves.channelDAO.ChannelDAO;
import com.tves.channelDAO.ChannelDAOImpl;
import com.tves.channelDAO.ProgrammesDAO;
import com.tves.channelDAO.ProgrammesDAOImpl;
import com.tves.models.Channel;
import com.tves.models.Programmes;

/**
 * Servlet implementation class ProgrammesController
 */
@WebServlet("/ProgrammesController")
public class ProgrammesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProgrammesController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		ProgrammesDAO dao = new ProgrammesDAOImpl();
		String action= request.getParameter("action");
		
		String chnl=request.getParameter("channelname");
		if(action.equals("getProgrammes")){
			System.out.println("Programmes");
			List<Programmes> list = null;
			list=dao.getByChannel(chnl);
			request.setAttribute("list", list);
			rd =request.getRequestDispatcher("programmes.jsp");
			
		}
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
