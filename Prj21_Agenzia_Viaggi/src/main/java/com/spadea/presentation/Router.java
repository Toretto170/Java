package com.spadea.presentation;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;

@Controller
public class Router {

	@GetMapping("/index")
	public String home() {
		return "home";
	}
	@GetMapping("/home")
	public String home3() {
		return "redirect:index";
	}
	@GetMapping("/operatore/{nome}")
	public String home4(@PathVariable("nome") String nomeOperatore,HttpSession session) {
		System.out.println(nomeOperatore);
		session.setAttribute("titolare", nomeOperatore);
		return nomeOperatore;
	}
	@GetMapping("/rispondi")
	@ResponseBody
	public String home2() {
		
		List<String> stringhe = Arrays.asList("fine", "intervallo","pausetta","caffe");
		
		return stringhe.toString();
	}
}
