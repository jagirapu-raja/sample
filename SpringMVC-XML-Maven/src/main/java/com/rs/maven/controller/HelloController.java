package com.rs.maven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String show() {
		return "Login";
	}

	@RequestMapping("/login")
	public String printLogin() {
		return "Login";
	}

	@RequestMapping("/register")
	public String printRegister() {
		return "Register";
	}

	@RequestMapping("/loginProcess")
	public String printLoginPrecess() {
		return "LoginProcess";
	}
}
