<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h3>商品管理列表</h3>
	<table>
		<tr>
			<td>编号</td>
			<td>商品名称</td>
			<td>商品价格</td>
			<td>类别</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${requestScope.goods}" var="good">
			<tr>
				<td>${good.id}</td>
				<td>${good.name}</td>
				<td>${good.price}</td>
					<td>${good.type}</td>
				<td>
				<a href="${pageContext.request.contextPath}/admin/dodel.do?id=${good.id}">删除</a>
				<a href="${pageContext.request.contextPath}/admin/doupdate.do?id=${good.id}">修改</a></td>
			</tr>
		</c:forEach>
	</table>




</body>
</html>