<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<base href="<%=basePath%>"></base>
<meta charset="UTF-8">
<title>学术动态</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css">
</head>
<body ng-controller="mainController" style="position: relative">
	<div class="wrap">
		<div class="head">
			<h1>国家民委中国民族语言文字应用研究院</h1>
		</div>
		<div class="nav">
			<ul>
				<li class="chooseTab"><a href="PageIndex">首页</a></li>
				<li><a href="PageAbstractInfo">研究院概况</a></li>
				<li><a href="PageResearchNews">学术动态</a></li>
				<li><a href="PageCommunicationNews">学术交流</a></li>
				<li><a href="PageResult">成果展示</a></li>
				<li><a href="PageRule">管理制度</a></li>
			</ul>
		</div>
		<div class="main">
			<div class="main-index">
				<div class="top">
					<div class="top-left">
						<div class="loop-box">
							<div class="list">
								<img src="${picture1 }"> <img src="${picture2}"> <img
									src="${picture3 }"> <img src="${picture1}">
							</div>
							<div class="page">
								<span class="active">1</span> <span>2</span> <span>3</span>
							</div>
							<div class="toPage">
								<a href="javascript:void(0)"></a> <a href="javascript:void(0)">></a>
							</div>
						</div>
					</div>
					<div class="top-right">
						<img style="max-width: 100%; height: 150px" src="${picture4 }"
							alt="">
						<div class="columns">
							<div class="column-general-head">
								<br> <br>
								<h4 style="width: 69%; float: left;">研究院概况</h4>
								<h4 style="width: 30%; float: right; text-align: right;">
									<a href="PageAbstractInfo">MORE>></a>
								</h4>
							</div>
						</div>
						<div class="column-general">
							
							<p style="text-indent: 2em;">国家民委中国民族语言文字应用研究院为中央民族大学非独立的科研平台实体研究机构，2017年12月29日正式成立，是国家民委民族语言文字工作的重要的科研基地。</p>
							<p style="text-indent: 2em;">研究院始终紧紧围绕国家民族团结进步事业和民族地区社会发展的重大需求及民族语言文字应用领域的主要问题，开展语言国情、语言政策、语言战略、语言安全、民族语言文字的规范化、标准化、信息化等的研究，为国家和民族地区语言文字事业的发展提供支撑。</p>
						</div>
					</div>
				</div>
				<div class="columns">
					<!-- 插入学术动态新闻 -->
					<div class="column-news">
						<div class="column-general-head">
							<br> <br> <br>
							<h4 style="width: 88%; float: left;">学术动态</h4>
							<h4 style="width: 11%; float: right; text-align: right;">
								<!-- more对应学术动态页面 -->
								<a href="PageResearchNews">MORE>></a>
							</h4>
						</div>
						
							<div class="communication-root">
								<img style="max-width: 350px;" alt="" src="${picture5 }">
								<div class="communication-content">
								
								<c:forEach var="news1" items="${news1}" begin="0" end="3">
									<div class="news-text">
										<div class="news-header">
											<a href="PageNews?id=${news1.id }" style="color: rgb(25, 80, 199)">${news1.title}</a>
										</div>
										<p>${news1.time }</p>
									</div>
								</c:forEach>
								</div>
							</div>
							
					</div>
					<!-- 插入学术交流新闻 -->
					<div class="column-communication">
						<div class="column-general-head">
							<br> <br>
							<h4 style="width: 88%; float: left;">学术交流</h4>
							<h4 style="width: 11%; float: right; text-align: right;">
								<!-- 对应学术交流页面 -->
								<a href="PageCommunicationNews">MORE>></a>
							</h4>
						</div>
						<div class="communication-root">
							<img style="max-width: 350px;" alt="" src="${picture6 }">
							<div class="communication-content">
							
								<c:forEach var="news2" items="${news2 }" begin="0" end="3">
								<div class="news-text">
									<div class="news-header">
										<a href="PageNews?id=${news2.id }"
											style="color: rgb(25, 80, 199)">${news2.title }</a>
									</div>
									<p>${news2.time }</p>
								</div>
								</c:forEach>
								

							</div>
						</div>
						
						
						<!--                <p><a href="page/communication-content.html?id=1">不宜将国家通用语言称作“国语”“官方语言”</a></p>
                    <p><a href="page/communication-content.html?id=2">关于我国少数民族语言文字政策的思考</a></p>
                    <p><a href="page/communication-content.html?id=3">少数民族语言文字的标准化和信息化建设</a></p>
                    <a href="page/communication.html" class="btn-more" ng-click="changeTab(4)">了解更多</a>-->
					</div>
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