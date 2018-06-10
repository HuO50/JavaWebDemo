<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link href="css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="font-awesome-4.5.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>新增文章</title>
</head>
<body>
	<div style="padding-left: 20%; padding-right: 20%">
		<form method="post" action="LinkAddResult">
			<div>
				<span><h3>请输入链接名：</h3></span> 
				<input id="name" name="name" type="text" 
					class="input-text radius size-L"> 
				<span><h3>请输入地址：</h3></span>
				
				<input id="link" name="link" type="text"
					class="input-text radius size-L ">
					
				<div class="text-c mt-20">
					<input class="btn btn-primary size-L radius" type="submit"
						value="添加"> 
					<input class="btn btn-default size-L radius" type="button" 
						value="取消">
				</div>
			</div>
			<div></div>
		</form>
	</div>

	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="Validform/5.3.2/Validform.min.js"></script>
	<script type="text/javascript" src="ueditor/1.4.3/ueditor.config.js"></script>
	<script type="text/javascript" src="ueditor/1.4.3/ueditor.all.min.js"></script>
	<script type="text/javascript" src="ueditor/1.4.3/lang/zh-cn/zh-cn.js"></script>
	<script type="text/javascript" src="js/H-ui.js"></script>
	<script type="text/javascript" src="js/H-ui.admin.js"></script>
	<script type="text/javascript">
		
	</script>
</body>
</html>