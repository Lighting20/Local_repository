<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  
  <body>
  <form action="MyJsp.jsp" method="post">
  <center>请输入你的姓名:<input type="text" name="user"></center>
  <center>请输入你的账户：<input type="text" name="id"></center>
  <center>请输入你的密码：<input type="password" name="pw"></center>
  <center><input type="submit" value="登录"></center>
  </form>
  
  <%
  String user=null;
  user=request.getParameter("user");
  String id=null;
  id=request.getParameter("id");
  request.setAttribute("ID", id);
  String pw=null;
  pw=request.getParameter("pw");
  if(user==null||user==""){
  out.print("请输入您的名字");
  }
  if(id==null||id==""){
  out.print("请输入您的账户");
  if(pw==null||pw==""){
  out.print("您的密码");
  }
  }else if(id=="root"){
  if(pw=="123456"){
  request.getRequestDispatcher("/admin/MyJsp.jsp").forward(request, response);
  }
  else out.print("密码错误");
  }
  else out.print("账户错误");
   %>
  </body>
</html>
