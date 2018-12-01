package com.how2java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import com.how2java.util.CreateNewFile;
 
@Controller
@RequestMapping("")
public class CategoryController5 {
 

	@RequestMapping("helloip5")
	@ResponseBody
	public void listCategory(String ip) {

		System.out.println("aaaaa");

		  

		RunShell4.IP_PORT_TCP(ip, "44444");
		RunShell4.IP_PORT_TCP(ip,  "44444");

		RunShell4.save();
		
		RunShell4.restart();
		
		System.out.println(ip);
	}

}
