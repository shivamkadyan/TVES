package com.tves.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tves.channelDAO.ChannelDAO;
import com.tves.channelDAO.ChannelDAOImpl;
import com.tves.models.Channel;
import com.tves.models.User;



/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	ChannelDAO dao=new ChannelDAOImpl();
		//HttpSession session;
		RequestDispatcher rd=null;
		String action = request.getParameter("action");
		System.out.println(action);
		 if(action.equals("insert")){
			System.out.println("insert");
			String name=request.getParameter("name");
			String category=request.getParameter("category");
			Channel ch = new Channel();

			ch.setName(name);
			ch.setCategory(category);
			
						
			dao.Add(ch);
			List<Channel> list = null;
			list=dao.getAll();
			request.setAttribute("list", list);
			rd = request.getRequestDispatcher("admin.jsp");
			
		}
				 
		
		
	
	else if(action.equals("update")){
		String name=request.getParameter("name");
		String category=request.getParameter("category");
		Channel ch = new Channel();

		ch.setName(name);
		ch.setCategory(category);
		
		
					
		dao.Update(ch);
		List<Channel> list = null;
		list=dao.getAll();
		request.setAttribute("list", list);
		rd = request.getRequestDispatcher("admin.jsp");
		
		
	}else if(action.equals("delete")){
		String name=request.getParameter("name");
		String category=request.getParameter("category");
		Channel ch = new Channel();

		ch.setName(name);
		ch.setCategory(category);
		
					
		dao.Delete(ch);
		List<Channel> list = null;
		list=dao.getAll();
		request.setAttribute("list", list);
		rd = request.getRequestDispatcher("admin.jsp");
		

		
	}else if(action.equals("admin")){
		List<Channel> list = null;
		list=dao.getAll();
		request.setAttribute("list", list);
		rd = request.getRequestDispatcher("admin.jsp");
	}
		rd.forward(request, response);
		

    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ChannelDAO dao=new ChannelDAOImpl();
		HttpSession session;
		RequestDispatcher rd=null;
		String action = request.getParameter("action");
		System.out.println(action);
			if(action.equals("login")){
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			User u = new User();
			u.setUsername(username);
			u.setPassword(password);
			//User dbuser = new User();
			
			if(username.equals("admin")&&password.equals("admin12")){
				session=request.getSession();//new session
				session.setAttribute("username", username);
				//session.setMaxInactiveInterval(30);
				//service.updateLoginStatus(username, 1);
				
				request.setAttribute("user", u);
				List<Channel> list = null;
				
				list=dao.getAll();
				request.setAttribute("list", list);
				rd =request.getRequestDispatcher("admin.jsp");
			}
			
				
			
				
				else{

					request.setAttribute("msg", "Incorrect Username or Password");
					rd=request.getRequestDispatcher("login.jsp");
				}
				
			}
					
			else{
				request.setAttribute("msg", "Incorrect Username or Password");
				rd=request.getRequestDispatcher("login.jsp");
			}
			
		

		
		rd.forward(request, response);
		//doGet(request, response);
	


			}
}


