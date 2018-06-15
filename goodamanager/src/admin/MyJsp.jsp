<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<frameset rows="25,*" cols="*" frameborder="no" border="0" framespacing="0"></frameset>
	<frame src="top.jsp" name="topFrame" scrolling="No" noresize="noresize" id="topFrame"/>
<frameset cols="25,*" frameborder="no" border="0" framespacing="0">
    <frame src="left.jsp" name="leftFrame" scrolling="No" noresize="noresize" id="leftFrame"/>
    <frame src="main.jsp" name="mainFrame" id="mainFrame"/>
    </frameset>

  <body>
  </body>
</html>
