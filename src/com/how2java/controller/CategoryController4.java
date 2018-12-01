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
public class CategoryController4 {
 

	@RequestMapping("helloip4")
	@ResponseBody
	public void listCategory(String ip) {

		System.out.println("aaaaa");

		  

		RunShell3.openudpPort_IPTABLESL_IP(ip);
		RunShell3.openudpPort_IPTABLESL_IP(ip);

		RunShell3.save();
		
		RunShell3.restart();
		
		System.out.println(ip);
	}

}
