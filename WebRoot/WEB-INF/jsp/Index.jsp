<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>系统管理中心</title>

<link rel="stylesheet" href="css/index.css" type="text/css"
	media="screen" />
<link href="font-awesome-4.5.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/tendina.min.js"></script>
<script type="text/javascript" src="js/common.js"></script>

</head>
<body>
	<!--顶部-->
	<div class="top">
		<div style="float: left">
			<span
				style="font-size: 20px; line-height: 45px; padding-left: 15px; color: #fff">
				系统管理中心 </span>
		</div>
		<div id="ad_setting" class="ad_setting">
			<a class="ad_setting_a" href="javascript:; ">管理员：&nbsp;&nbsp;${username}</a>
			<ul class="dropdown-menu-uu" style="display: none" id="ad_setting_ul">
				<li class="ad_setting_ul_li"><a href="javascript:;">
						设&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;置</a></li>
				<li class="ad_setting_ul_li"><a href="Logout"> <span
						class="font-bold">退出</span>
				</a></li>
			</ul>
			<img class="use_xl" src="images/right_menu.png" />
		</div>
	</div>
	<!--顶部结束-->
	<!--菜单-->
	<div class="left-menu">
		<ul id="menu">
			<li class="menu-list"><a style="cursor: pointer" class="firsta">
					<s class="sz"></s>管理中心<i class="glyph-icon xlcd"></i>
			</a>
				<ul>
					<li><a href="PictureManage" target="menuFrame"><i
							class="fa fa-picture-o"></i>轮播图片</a></li>
					<li><a href="InfoManage" target="menuFrame"><i
							class="fa fa-user"></i> 研究院概况</a></li>
					<li><a href="NewsManage" target="menuFrame"><i
							class="fa fa-newspaper-o"></i>学术动态</a></li>
					<li><a href="CommunicationManage" target="menuFrame"><i
							class="fa fa-keyboard-o"></i>学术交流</a></li>
					<li><a href="ResultManage" target="menuFrame"><i
							class="fa fa-flag-o"></i>成果展示</a></li>
					<li class="menu-list"><a href="RuleManage" target="menuFrame"><i
							class="fa fa-star"></i>管理制度</a></li>
					<li class="menu-list"><a href="LinkManage" target="menuFrame"><i
							class="fa fa-email"></i>友情链接</a></li>
				</ul></li>
		</ul>
	</div>

	<!--菜单右边的iframe页面-->
	<div id="right-content" class="right-content">
		<div class="content">
			<div id="page_content">
				<iframe id="menuFrame" name="menuFrame" src="Welcome"
					style="overflow: visible;" scrolling="yes" frameborder="no"
					width="100%" height="100%"></iframe>
			</div>
		</div>
	</div>
</body>
</html>