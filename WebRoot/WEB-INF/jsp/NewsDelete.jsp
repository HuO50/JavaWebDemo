<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
   	<meta name="renderer" content="webkit|ie-comp|ie-stand">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport"
		content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
	<meta http-equiv="Cache-Control" content="no-siteapp" />
	<link href="css/H-ui.admin.css" rel="stylesheet" type="text/css" />
	<link href="css/H-ui.min.css" rel="stylesheet" type="text/css" />
	<link href="css/style.css" rel="stylesheet" type="text/css" />
	<link href="layer/skin/layer.css" rel="stylesheet" type="text/css" />
	<link href="font-awesome-4.5.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
  </head>
  
  <body>
  	<br>
  	<div class="layui-layer-content" style="text-align: center; font-size: 16px">确认要删除吗？</div>
  	<br><br>
  	<div class="layui-layer-btn" style="text-align: center;">
  		<a class="layui-layer-btn0" href="NewsDetailResult?newsid=${newsid}">确定</a>
  		<a class="layui-layer-btn1" onclick="layer_close();">取消</a>
  	</div>
  
 	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="layer/layer.js"></script>
	<script type="text/javascript" src="js/H-ui.js"></script>
	<script type="text/javascript" src="js/H-ui.admin.js"></script>
	<script type="text/javascript">
	</script> 
  </body>
</html>
