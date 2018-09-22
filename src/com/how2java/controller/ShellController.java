package com.how2java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import com.how2java.util.CreateNewFile;

// 告诉spring mvc这是�?个控制器�?
@Controller
@RequestMapping("shell")
public class ShellController {
//	@Autowired
//	CategoryService categoryService;

	@RequestMapping("addip")
	public void listCategory(String ip) {

		System.out.println("aaaaa");

//		CreateNewFile createFile = new CreateNewFile();
//		createFile.createNewFile(args[0], args[1]);
//		createFile.createNewFile("c:/a.sh", "545646456");

//		String fileName = "/root/" + System.currentTimeMillis()+"aaa" + ip + ".sh";
//		createFile.createNewFileA(fileName, ip);

//		RunShell.chmod755(fileName);
//		RunShell.aaaaaaaaaa(fileName);

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
		
		
		
		RunShell.opentcpPort(ip, "22222");
		RunShell.openudpPort(ip, "22222");
		RunShell.save();
		RunShell.restart();
		
		
		RunShell.opentcpPort(ip, "1194");
		RunShell.openudpPort(ip, "1194");
		RunShell.save();
		RunShell.restart();

//		RunShell.openAllProtocolPort(ip, "443");
//		RunShell.save();
//		RunShell.restart();
//		RunShell.openAllProtocolPort(ip, "1194");
//		RunShell.save();
//		RunShell.restart();
//		RunShell.openAllProtocolPort(ip, "943");
//		RunShell.save();
//		RunShell.restart();
//		RunShell.openAllProtocolPort(ip, "914");
//		RunShell.save();
//		RunShell.restart();
//		RunShell.openAllProtocolPort(ip, "915");
//		RunShell.save();
//		RunShell.restart();
//		RunShell.openAllProtocolPort(ip, "916");
//		RunShell.save();
//		RunShell.restart();
//		RunShell.openAllProtocolPort(ip, "917");
//		RunShell.save();
//		RunShell.restart();
//		RunShell.openAllProtocolPort(ip, "22222");
//
//		RunShell.save();
//		RunShell.restart();

	}

	@RequestMapping("addipv1")
	public void listCategory1(String ip) {

	}

}
