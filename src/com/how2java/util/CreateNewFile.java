package com.how2java.util;

import java.io.*;

public class CreateNewFile {
	// 创建一个方法完成创建文件的目的，文件的第一个参数是文件路径和文件名，第二个参数是文件内容
	// 如：myfile.doc HelloJava!
	public void createNewFile(String fileDirectoryAndName, String fileContent) {
		try {
			String fileName = fileDirectoryAndName;
			// 创建File对象，参数为String类型，表示目录名
			File myFile = new File(fileName);
			// 判断文件是否存在，如果不存在则调用createNewFile()方法创建新目录，否则跳至异常处理代码
			if (!myFile.exists())
				myFile.createNewFile();
			else // 如果不存在则扔出异常
				throw new Exception("The new file already exists!");
			// 下面把数据写入创建的文件，首先新建文件名为参数创建FileWriter对象
			FileWriter resultFile = new FileWriter(myFile);
			// 把该对象包装进PrinterWriter对象
			PrintWriter myNewFile = new PrintWriter(resultFile);
			// 再通过PrinterWriter对象的println()方法把字符串数据写入新建文件
			myNewFile.println(fileContent);
			resultFile.close(); // 关闭文件写入流
		} catch (Exception ex) {
			System.out.println("无法创建新文件！");
			ex.printStackTrace();
		}
	}
	public void createNewFileA(String fileDirectoryAndName, String fileContent) {
		try {
			String fileName = fileDirectoryAndName;
			// 创建File对象，参数为String类型，表示目录名
			File myFile = new File(fileName);
			// 判断文件是否存在，如果不存在则调用createNewFile()方法创建新目录，否则跳至异常处理代码
			if (!myFile.exists())
				myFile.createNewFile();
			else // 如果不存在则扔出异常
				throw new Exception("The new file already exists!");
			// 下面把数据写入创建的文件，首先新建文件名为参数创建FileWriter对象
			FileWriter resultFile = new FileWriter(myFile);
			// 把该对象包装进PrinterWriter对象
			PrintWriter myNewFile = new PrintWriter(resultFile);
			// 再通过PrinterWriter对象的println()方法把字符串数据写入新建文件
			
			
			
			
			
			
			
			String aaaaaaa="iptables -A INPUT -m state --state NEW -m tcp -p tcp -s "+fileContent+" --dport 222222 -j ACCEPT " + 
					"iptables -A INPUT -m state --state NEW -m tcp -p tcp -s "+fileContent+" --dport 914 -j ACCEPT " + 
					"iptables -A INPUT -m state --state NEW -m tcp -p tcp -s "+fileContent+" --dport 915 -j ACCEPT " + 
					"iptables -A INPUT -m state --state NEW -m tcp -p tcp -s "+fileContent+" --dport 916 -j ACCEPT " + 
					"iptables -A INPUT -m state --state NEW -m tcp -p tcp -s "+fileContent+" --dport 917 -j ACCEPT " + 
					"iptables -A INPUT -m state --state NEW -m tcp -p tcp -s "+fileContent+" --dport 943 -j ACCEPT " + 
					"iptables -A INPUT -m state --state NEW -m tcp -p tcp -s "+fileContent+" --dport 443 -j ACCEPT " + 
					"iptables -A INPUT -m state --state NEW -m udp -p udp -s "+fileContent+" --dport 222222 -j ACCEPT " + 
					"iptables -A INPUT -m state --state NEW -m udp -p udp -s "+fileContent+" --dport 914 -j ACCEPT " + 
					"iptables -A INPUT -m state --state NEW -m udp -p udp -s "+fileContent+" --dport 915 -j ACCEPT " + 
					"iptables -A INPUT -m state --state NEW -m udp -p udp -s "+fileContent+" --dport 916 -j ACCEPT " + 
					"iptables -A INPUT -m state --state NEW -m udp -p udp -s "+fileContent+" --dport 917 -j ACCEPT " + 
					"iptables -A INPUT -m state --state NEW -m udp -p udp -s "+fileContent+" --dport 943 -j ACCEPT " + 
					"iptables -A INPUT -m state --state NEW -m udp -p udp -s "+fileContent+" --dport 443 -j ACCEPT " + 
					" " + 
					"su root service iptables save " + 
					"su root service iptables restart";
			
			
		 
//			aaaaaaa.replaceAll(""+fileContent+"",fileContent );
			
			
			
			
//			myNewFile.println(fileContent);
			myNewFile.println(aaaaaaa);
			resultFile.close(); // 关闭文件写入流
		} catch (Exception ex) {
			System.out.println("无法创建新文件！");
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// 创建类的对象并调用该对象的createNewFile()方法，创建新文件并写入数据
		CreateNewFile createFile = new CreateNewFile();
//		createFile.createNewFile(args[0], args[1]);
//		createFile.createNewFile("c:/a.sh", "545646456");
		
		String ip="123.123.123.123";
		
		String fileName="c:/"+System.currentTimeMillis()+ip+"a.sh"; 
		createFile.createNewFileA(fileName, ip);
	}
}