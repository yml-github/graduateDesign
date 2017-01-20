package priv.yml.gd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import priv.yml.gd.Constants;

@Controller("/")
public class LoginController {
	
	@RequestMapping("/showloginpage")
	public String showLoginPage(){
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(String email, String password, HttpServletRequest request){
		HttpSession session = request.getSession();
		
		if(email == null || password == null){
			return "redirect:showloginpage";
		}
		
		session.setAttribute(Constants.USERNAME, email);
		session.setAttribute(Constants.PASSWORD, password);
		
		return "redirect:showhomepage";
	}
	
	@RequestMapping("showhomepage")
	public String showHomePage(){
		return "home";
	}
}
