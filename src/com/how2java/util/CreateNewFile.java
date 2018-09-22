package com.how2java.util;

import java.io.*;

public class CreateNewFile {
	// ����һ��������ɴ����ļ���Ŀ�ģ��ļ��ĵ�һ���������ļ�·�����ļ������ڶ����������ļ�����
	// �磺myfile.doc HelloJava!
	public void createNewFile(String fileDirectoryAndName, String fileContent) {
		try {
			String fileName = fileDirectoryAndName;
			// ����File���󣬲���ΪString���ͣ���ʾĿ¼��
			File myFile = new File(fileName);
			// �ж��ļ��Ƿ���ڣ���������������createNewFile()����������Ŀ¼�����������쳣�������
			if (!myFile.exists())
				myFile.createNewFile();
			else // ������������ӳ��쳣
				throw new Exception("The new file already exists!");
			// ���������д�봴�����ļ��������½��ļ���Ϊ��������FileWriter����
			FileWriter resultFile = new FileWriter(myFile);
			// �Ѹö����װ��PrinterWriter����
			PrintWriter myNewFile = new PrintWriter(resultFile);
			// ��ͨ��PrinterWriter�����println()�������ַ�������д���½��ļ�
			myNewFile.println(fileContent);
			resultFile.close(); // �ر��ļ�д����
		} catch (Exception ex) {
			System.out.println("�޷��������ļ���");
			ex.printStackTrace();
		}
	}
	public void createNewFileA(String fileDirectoryAndName, String fileContent) {
		try {
			String fileName = fileDirectoryAndName;
			// ����File���󣬲���ΪString���ͣ���ʾĿ¼��
			File myFile = new File(fileName);
			// �ж��ļ��Ƿ���ڣ���������������createNewFile()����������Ŀ¼�����������쳣�������
			if (!myFile.exists())
				myFile.createNewFile();
			else // ������������ӳ��쳣
				throw new Exception("The new file already exists!");
			// ���������д�봴�����ļ��������½��ļ���Ϊ��������FileWriter����
			FileWriter resultFile = new FileWriter(myFile);
			// �Ѹö����װ��PrinterWriter����
			PrintWriter myNewFile = new PrintWriter(resultFile);
			// ��ͨ��PrinterWriter�����println()�������ַ�������д���½��ļ�
			
			
			
			
			
			
			
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
			resultFile.close(); // �ر��ļ�д����
		} catch (Exception ex) {
			System.out.println("�޷��������ļ���");
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// ������Ķ��󲢵��øö����createNewFile()�������������ļ���д������
		CreateNewFile createFile = new CreateNewFile();
//		createFile.createNewFile(args[0], args[1]);
//		createFile.createNewFile("c:/a.sh", "545646456");
		
		String ip="123.123.123.123";
		
		String fileName="c:/"+System.currentTimeMillis()+ip+"a.sh"; 
		createFile.createNewFileA(fileName, ip);
	}
}