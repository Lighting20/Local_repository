<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html> 
  <body>
   <center><a href="Goodstype_List.jsp">商品类别管理</a></center>
   <center><a href="Goodstype_toadd.jsp">商品类别增加</a></center>
    <center><a href="Goods_List.jsp">商品信息管理</a></center>
    <center><a href="Goods_toadd.jsp">商品信息添加</a></center>
    <center><a href="Login.jsp>">系统退出</a></center>
  </body>
</html>
