<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
	<meta http-equiv="Cache-Control" content="no-siteapp" />

  </head>
  
  <body onload="layermsg()">
    <script type="text/javascript" src="js/jquery.min.js"></script> 
	<script type="text/javascript" src="layer/layer.js"></script> 
	<script type="text/javascript">
		function layermsg(){
			layer.msg('学术交流发布成功', {
				  icon: 1,
				  time: 20//2秒关闭（如果不配置，默认是3秒）
				}, function(){
					parent.location.reload(); 
				});   
			
		}
	</script> 
  </body>
</html>
