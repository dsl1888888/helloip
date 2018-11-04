<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP page. <br>
    <div>
    <a id="k1139"  url="<%=path%>/listCategory.action"  class="list-group-item " onclick="listCategory.action">				
		<span>11111111111111</span> 
	</a>
	<input id="combox" class="mini-combobox" style="width:150px;" textField="ddcname" valueField="ddcid" emptyText="请选择..."
    url="listCategory" value="cn"  required="true" allowInput="true" showNullItem="true" nullItemText="请选择..."/> 
    </div>
  </body>
</html>
