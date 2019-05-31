package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
     @RequestMapping("/save")
	public String m() {
		System.out.println("helllo...");
		return "Helllo ....";
	}
}
