package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.OnlineDao.UserDao;
import com.OnlineModel.User;


@WebServlet("/")
public class MyApplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MyApplication() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path = request.getServletPath();
		switch(path) {
		//case "/insert"  : insertUser(request,response);
						 //break;
		//case "/validate" :validateadmin(request,response);
						 //break;
		default:loginpage(request,response);
		}
	}

	
	private void validateadmin(HttpServletRequest request, HttpServletResponse response) {
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		
		if (user.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")) {

            try {
				response.sendRedirect("admin.jsp?msg=success");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } else {
            try {
      
				response.sendRedirect("adminlogin.jsp?loginef=failed");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
		
	}


//	private void insertUser(HttpServletRequest request, HttpServletResponse response) {
//		String name = request.getParameter("name");
//		int age = Integer.parseInt(request.getParameter("age"));
//		String email = request.getParameter("email");
//		String mobile = request.getParameter("mobile");
//		String gen = request.getParameter("gender");
//		String address = request.getParameter("address");
//		String password = request.getParameter("pass");
//		
//		User u1 = new User(name,age, email, mobile,gen, address, password);
//		UserDao.insert(u1);
//		
//		boolean isRegistered = true; // Replace this with actual database insertion logic
//
//        if (isRegistered) {
//            try {
//				response.sendRedirect("register.jsp?success=true");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//        } else {
//            try {
//				response.sendRedirect("register.jsp?success=false");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//        }
//		
//		
//	}
//

	
	private void loginpage(HttpServletRequest request, HttpServletResponse response) {
		RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
		try {
			rs.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
