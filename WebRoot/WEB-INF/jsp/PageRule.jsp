<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<title>管理制度</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css">
</head>
<body ng-controller="mainController">
	<div class="wrap">
		<div class="head">
			<h1>国家民委中国民族语言文字应用研究院</h1>
		</div>
		<div class="nav">
			<ul>
				<li><a href="PageIndex">首页</a></li>
				<li><a href="PageAbstractInfo">研究院概况</a></li>
				<li><a href="PageResearchNews">学术动态</a></li>
				<li><a href="PageCommunicationNews">学术交流</a></li>
				<li><a href="PageResult">成果展示</a></li>
				<li class="chooseTab"><a href="PageRule">管理制度</a></li>
			</ul>
		</div>
		<div class="main">
			<div class="aside">
				<ul>
					<li class="btn" ng-click="changeContent($event,6,1)"
						ng-class="{'chooseContent':showContent == 1}"><span>研究人员聘任条例</span></li>
					<li class="btn" ng-click="changeContent($event,6,2)"
						ng-class="{'chooseContent':showContent == 2}"><span>研究人员聘任合同</span></li>
				</ul>
			</div>
			<div class="section">
				<div class="header">
					<h3>管理制度</h3>
				</div>

				<div class="content" ng-if="showContent == 1" name="recruit">
					<p>${recruit}</p>
				</div>
				<div class="content" ng-if="showContent == 2" name="concract">
					<p>${concract}</p>
				</div>

			</div>
		</div>
	</div>

	<div class="foot">版权所有© 国家民委中国民族语言文字应用研究院</div>

	<script src="<%=request.getContextPath()%>/js/angular.min.js"></script>
	<script src="<%=request.getContextPath()%>/js/jquery-3.1.1.min.js"></script>
	<script src="<%=request.getContextPath()%>/js/main.js"></script>
</body>
</html>