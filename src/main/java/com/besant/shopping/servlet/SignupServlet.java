package com.besant.shopping.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.besant.shopping.pojo.Userprofile;
import com.besant.shopping.repo.SignUpRepository;
import com.besant.shopping.service.SignUpService;

/**
 * Servlet implementation class SignupServlet
 */
@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String userId=request.getParameter("userId");
		String email=request.getParameter("email");
		String psw=request.getParameter("psw");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		
		Userprofile user= new Userprofile();
		user.setName(name);
		user.setUserId(userId);
		user.setPsw(psw);
		user.setEmail(email);
		user.setAddress(address);
		user.setPhone(phone);
		
		SignUpService signupService= new SignUpService();
		Boolean result = signupService.signUp(user);
		if(result)
			System.out.println("RECORDS INSERTED");
		
		
	}

}
