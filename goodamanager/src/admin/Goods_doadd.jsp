<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  
  <body>
  <form action="Goodsmanager?op=doadd" method="post">
  <center>商品名：<input type="text" name="goods_name"></center>
  <center><select name="typeid">
  <option value="1">办公用品
  <option value="2">体育用品
  <option value="3">生活用品
  </select></center>
  <center>商品价格：<input type="text" name="goods_price"></center>
  <center>商品描述：<input type="text" border=5 name="goods_desc"></center>
  <center><input type="submit" value="提交"></center>
  </form>
  </body>
</html>
