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
public class CategoryController3 {
 

	@RequestMapping("helloip3")
	@ResponseBody
	public void listCategory(String ip) {

		System.out.println("aaaaa");

		  

		RunShell2.opentcpPort_IPTABLESL(ip, "22221");
		RunShell2.openudpPort_IPTABLESL(ip, "22221");

		RunShell2.save();
		
		RunShell2.restart();
		
		System.out.println(ip);
	}

}
