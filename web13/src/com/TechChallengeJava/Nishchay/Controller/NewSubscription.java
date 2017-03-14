package com.TechChallengeJava.Nishchay.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.TechChallengeJava.Nishchay.Bean.ParentBeans;
import com.TechChallengeJava.Nishchay.Domain.UserData;
import com.TechChallengeJava.Nishchay.Model.ResponseSuccess;
import com.TechChallengeJava.Nishchay.Service.CreateSubscriptionServiceLayer;
import com.TechChallengeJava.Nishchay.utils.ExtractDomain;
import com.TechChallengeJava.Nishchay.utils.OAuth;

/**
 * Servlet implementation class NewSubscription
 */
@WebServlet("/NewSubscription")
public class NewSubscription extends HttpServlet {
	private String eventUrl;
	public String geteventUrl() {
		return eventUrl;
	}

	public void seteventUrl(String eventUrl) {
		this.eventUrl = eventUrl;
	}
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		String eventUrl = (String) request.getParameter("eventUrl");
		seteventUrl(eventUrl);
		ObjectMapper mapper = new ObjectMapper();
		response.setStatus(200);
		ResponseSuccess responseObject = new ResponseSuccess(true,"new-account-identifier");
		String json = mapper.writeValueAsString(responseObject);
		out.print(json);
		System.out.println(eventUrl);
		
		String myUrl = request.getParameter("eventUrl");
		ParentBeans parentBeansObject = new OAuth().sign(myUrl);
		
		System.out.println(parentBeansObject.getCreator().getEmail()+"->Servlet");
		
		ExtractDomain ed = new ExtractDomain();
		ed.extractDomain(parentBeansObject);
		
		UserData ud = new UserData();
		System.out.println(ud.getEmail()+"-<Email");
		
		CreateSubscriptionServiceLayer cs = new CreateSubscriptionServiceLayer();
		cs.InsertValues();	
	}
}
