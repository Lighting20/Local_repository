<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html> 
  <body>
   <form action="GoodsServlet?op=toupdate" method="post">
    <center><input type="text" name="typename"></center>
    <center><input type="submit" value="提交"></center>
    </form>
  </body>
</html>
