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
public class CategoryController2 {
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

	@RequestMapping("helloip2")
	@ResponseBody
	public void listCategory(String ip) {

		System.out.println("aaaaa");

		RunShell.opentcpPort_IPTABLESL(ip, "443");
		RunShell.openudpPort_IPTABLESL(ip, "443");

		RunShell.opentcpPort_IPTABLESL(ip, "943");
		RunShell.openudpPort_IPTABLESL(ip, "943");

		

		RunShell.opentcpPort_IPTABLESL(ip, "914");
		RunShell.openudpPort_IPTABLESL(ip, "914");

		

		RunShell.opentcpPort_IPTABLESL(ip, "915");
		RunShell.openudpPort_IPTABLESL(ip, "915");

		

		RunShell.opentcpPort_IPTABLESL(ip, "916");
		RunShell.openudpPort_IPTABLESL(ip, "916");

		

		RunShell.opentcpPort_IPTABLESL(ip, "917");
		RunShell.openudpPort_IPTABLESL(ip, "917");

		

		RunShell.opentcpPort_IPTABLESL(ip, "22221");
		RunShell.openudpPort_IPTABLESL(ip, "22221");

		

		RunShell.opentcpPort_IPTABLESL(ip, "22222");
		RunShell.openudpPort_IPTABLESL(ip, "22222");

		

//		RunShell.opentcpPort_IPTABLESL(ip, "1194");
//		RunShell.openudpPort_IPTABLESL(ip, "1194");

		
		System.out.println(ip);
	}

}
