package com.minipro207.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


//@Controller
//public class DasarController {
//
//	@RequestMapping("/")
//	public String awal() {
//		return "awal";
//	}
//	
//}

@Controller
public class DasarController {
	@RequestMapping("/")
	public String home() {

		return ("home");
	}
}

