<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link href="css/newsdetail.css" rel="stylesheet">

</head>
<body style="font-family: tamoha, Arial, 瀹嬩綋; font-size: 12px;">
	<div class="newsdisp">
		<h1 class="newsdisp_title" style="text-align: center">${news.title}</h1>
		<p class="time_author_click" style="text-align: center;">
			<span id="tzggb.viewfbrth">作者：${news.author}</span> 
			<span id="tzggb.viewfbrqth">发布日期：${news.time}</span>
			<span id="tzggb.viewfbrqth">发布栏目：${news.mark}</span>
		</p>
		${news.content}
	</div>
</body>
</html>
