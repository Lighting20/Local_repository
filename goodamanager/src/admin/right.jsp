<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>  
  <body>
  <% String user=request.getParameter("user");
  if(user!=null||user!=""){
  out.print("欢迎"+user+"使用商品管理系统");
  }
   %>
  
  </body>
</html>
