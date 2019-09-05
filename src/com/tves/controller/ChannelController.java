package com.tves.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tves.channelDAO.ChannelDAO;
import com.tves.channelDAO.ChannelDAOImpl;
import com.tves.models.Channel;

/**
 * Servlet implementation class ChannelController
 */
@WebServlet("/ChannelController")
public class ChannelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChannelController() {
        super();
        // TODO Auto-generated constructor stub
    }
    RequestDispatcher rd = null;
    ChannelDAO dao = new ChannelDAOImpl();
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action= request.getParameter("action");

		String chnl=request.getParameter("chnlname");

		if(action.equals("getChannel")){
			System.out.println("channels");
			List<Channel> list = null;
			list=dao.getAll();
			request.setAttribute("list", list);
			rd =request.getRequestDispatcher("listings.jsp");
			
		}
		else if(action.equals("find")){
			System.out.println("hit search");
			List<Channel> list= new ArrayList();
			
			Channel c=dao.find(chnl);
			list.add(c);
			request.setAttribute("list", list);
			rd =request.getRequestDispatcher("listings.jsp");
			
		}
		else if(action.equals("ctgry")){
			System.out.println("hit ctgry");
			String ctegory=request.getParameter("category");
			List<Channel> list= new ArrayList<Channel>();
			
			list=dao.findByCategory(ctegory);
			
			request.setAttribute("list", list);
			rd =request.getRequestDispatcher("listings.jsp");
		}
	
				
	

		rd.forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}}
