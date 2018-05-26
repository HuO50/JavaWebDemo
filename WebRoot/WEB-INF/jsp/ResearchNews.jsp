<!-- 这个页面待删除处理 -->

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; 
charset=UTF-8">
<title>学术动态</title>
<link rel="stylesheet" href="css/main.css">

</head>
<body ng-controller="mainController">
	<div class="wrap">
		<div class="head">
			<h1>国家民委中国民族语言文字应用研究院</h1>
		</div>
		<div class="nav">
			<ul>
				<li><a href="../index.html">首页</a></li>
				<li><a href="general.html">研究院概况</a></li>
				<li class="chooseTab"><a href="javascript:void(0)">学术动态</a></li>
				<li><a href="communication.html">学术交流</a></li>
				<li><a href="achievements.html">成果展示</a></li>
				<li><a href="management.html">管理制度</a></li>
			</ul>
		</div>
		<div class="main">
			<div class="section">
				<div class="header">
					<h3>学术动态</h3>
				</div>
				<ul>
					<tbody>
					<c:forEach var="news" items="${newslist}">
						<tr class="text-c">
							<td width="5%">${news.id }</td>
							<td width="45%" style="text-align: left;">
								<a style="text-decoration: none; cursor: pointer; color: black;" 
                        		href="javascript:void(0)" 
                        		onclick="layer_show('${news.title}','NewsDetail?newsid=${news.id}','800','800')">
                       			${news.title }</a>
                       		</td>
                       		<td width="10%">${news.mark }</td>
							<td width="10%">${news.author }</td>
							<td width="15%">${news.time }</td>
							<td class="f-14 td-manage"><a style="text-decoration:none"
								class="ml-5"
								onClick="article_edit('修改新闻','NewsModify?newsid=${news.id}')"
								href="javascript:;" title="编辑"> <i class="fa fa-pencil"></i>
							</a> &nbsp;&nbsp;&nbsp;&nbsp; <a style="text-decoration:none"
								class="ml-5" onClick="article_del('删除新闻','NewsDelete?newsid=${news.id}')"
								href="javascript:;" title="删除"> <i class="fa fa-trash"></i>
							</a></td>
						</tr>
					</c:forEach>
				</tbody>
				</ul>

			</div>
		</div>
	</div>

	<div class="foot">版权所有© 国家民委中国民族语言文字应用研究院</div>

	<script src="js/angular.min.js"></script>
	<script src="js/jquery-3.1.1.min.js"></script>
	<script src="js/main.js"></script>
</body>
</html>