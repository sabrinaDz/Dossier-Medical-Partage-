package com.sihatech.DMP.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class IndexController {
	
	
	
	@RequestMapping({"","/","index.html","index"})
	public String getIndex(){
		
		return "index";
	}
	

}
