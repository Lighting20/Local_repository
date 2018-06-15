<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
   <h3>商品类别管理列表</h3>
	<table>
		<tr>
			<td>商品类别编号</td>
			<td>类别名称</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${requestScope.goodstype}" var="goodtype">
			<tr>
				<td>${goodstype.typeid}</td>
				<td>${goodstype.typename}</td>
				<td>
				<a href="${pageContext.request.contextPath}/admin/todel.do?id=${goodstype.typeid}">删除</a>
				<a href="${pageContext.request.contextPath}/admin/touodate.do?id=${goodstype.typeid}">修改</a></td>
			</tr>
		</c:forEach>
	</table>
  </body>
</html>
