package com.reg.login.app.regloginapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegLoginController {
	
	private UserServiceDetailsImpl userService;
	
	@Autowired
	public RegLoginController(UserServiceDetailsImpl userService) {
		this.userService=userService;
	}
	
	@GetMapping("/")
	public String viewHomePage() {
		return "index";
	}
	@GetMapping("/register")
	public String showRegForm(Model model) {
		model.addAttribute("user_details", new UserRegDetails());
		return "register";
	}
	@PostMapping("process_register")
	public String processRegister(UserRegDetails user)  throws UserAlreadyExistsException {
		userService.registerUser(user);
		return "register_success";
		
	}
	@GetMapping("/login")
	public String showLoginForm(Model model) {
		model.addAttribute("user_details",new UserRegDetails());
		return "login_form";
	}
	
	@PostMapping("process_login")
	public String processRegister(UserRegDetails user,Model model) throws InvalidUsernameUsedException,InvalidPasswordUsedException{
		model.addAttribute("username", user.getUsername());
		userService.loginUser(user);
		return "login_success";
		
	}
	
	
	

}
