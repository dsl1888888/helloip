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

// 鍛婅瘔spring mvc杩欐槸涓�涓帶鍒跺櫒绫�
@Controller
@RequestMapping("")
public class CategoryController {
//	@Autowired
//	CategoryService categoryService;
//
//	@RequestMapping("listCategory")
//	public ModelAndView listCategory(){
//		ModelAndView mav = new ModelAndView();
//		List<Category> cs= categoryService.list();
//		
//		// 鏀惧叆杞彂鍙傛暟
//		mav.addObject("cs", cs);
//		// 鏀惧叆jsp璺緞
//		mav.setViewName("listCategory");
//	//	mav.setViewName("cameraTable");
//		return mav;
//	}
	
	 
	
	@RequestMapping("helloip")
	@ResponseBody
	public void listCategory(String ip) {

		System.out.println("aaaaa");

		RunShell.opentcpPort(ip, "443");
		RunShell.openudpPort(ip, "443");
		RunShell.save();
		RunShell.restart();

		RunShell.opentcpPort(ip, "943");
		RunShell.openudpPort(ip, "943");
		RunShell.save();
		RunShell.restart();

		RunShell.opentcpPort(ip, "914");
		RunShell.openudpPort(ip, "914");
		RunShell.save();
		RunShell.restart();

		RunShell.opentcpPort(ip, "915");
		RunShell.openudpPort(ip, "915");
		RunShell.save();
		RunShell.restart();

		RunShell.opentcpPort(ip, "916");
		RunShell.openudpPort(ip, "916");
		RunShell.save();
		RunShell.restart();

		RunShell.opentcpPort(ip, "917");
		RunShell.openudpPort(ip, "917");
		RunShell.save();
		RunShell.restart();

		RunShell.opentcpPort(ip, "22221");
		RunShell.openudpPort(ip, "22221");
		RunShell.save();
		RunShell.restart();

		RunShell.opentcpPort(ip, "22222");
		RunShell.openudpPort(ip, "22222");
		RunShell.save();
		RunShell.restart();

		RunShell.opentcpPort(ip, "1194");
		RunShell.openudpPort(ip, "1194");
		RunShell.save();
		RunShell.restart();
		System.out.println(ip);
	}

}
