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
<title>研究院概况</title>
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
				<li class="chooseTab"><a href="PageAbstractInfo">研究院概况</a></li>
				<li><a href="PageResearchNews">学术动态</a></li>
				<li><a href="PageCommunicationNews">学术交流</a></li>
				<li><a href="PageResult">成果展示</a></li>
				<li><a href="PageRule">管理制度</a></li>
			</ul>
		</div>
		<div class="main">
			<div class="aside">
				<ul>
					<li class="btn" ng-click="changeContent($event,2,1)"
						ng-class="{'chooseContent':showContent == 1}"><span>研究院简介</span></li>
					<li class="btn" ng-click="changeContent($event,2,5)"
						ng-class="{'chooseContent':showContent == 5}"><span>研究院学术委员</span></li>
					<li class="btn" ng-click="changeContent($event,2,3)"
						ng-class="{'chooseContent':showContent % 10 == 3}"><span>研究院学术队伍</span>
						<ul ng-if="showContent % 10 == 3">
							<li class="btn4" ng-click="changeContent($event,2,13)"><span>本院研究员</span></li>
							<li class="btn4" ng-click="changeContent($event,2,23)"><span>特聘研究员</span></li>
						</ul></li>
					<li class="btn" ng-click="changeContent($event,2,4)"
						ng-class="{'chooseContent':showContent % 10 == 4}"><span>研究院机构设置</span>
						<ul ng-if="showContent % 10 == 4">
							<li class="btn4" ng-click="changeContent($event,2,4)"><span>民族语言文字应用对策研究室</span></li>
							<li class="btn4" ng-click="changeContent($event,2,14)"><span>规范化标准化信息化研究室</span></li>
							<li class="btn4" ng-click="changeContent($event,2,24)"><span>综合事务办公室</span></li>
							<li class="btn4" ng-click="changeContent($event,2,34)"><span>多语多文社会与政策研究室</span></li>
						</ul></li>
					<li class="btn" ng-click="changeContent($event,2,6)"
						ng-class="{'chooseContent':showContent == 6}"><span>名誉院长</span></li>
					<li class="btn" ng-click="changeContent($event,2,7)"
						ng-class="{'chooseContent':showContent == 7}"><span>院长</span></li>
				</ul>
			</div>
			<div class="section">
				<div class="header">
					<h3>{{headerText}}</h3>
				</div>
				<div class="content" ng-if=" showContent == 1">${abstractinfo }
				</div>
				<div class="content" ng-if="showContent == 5">
					<div class="committee">
						<c:forEach var="member1" items="${member1}">
						<br />
							<span class="mb"><a href="PageMemberDetail?id=${member1.id }">
									${member1.name } </a> </span>
						</c:forEach>
					</div>
				</div>
				<div class="content" ng-if=" showContent == 3">
					<p>研究院的研究人员，分为专职和兼职两种。除专职研究人员外，研究院根据研究任务和研究计划，聘用部分兼职人员，兼职人员采取特聘教授和研究员方式参与研究院的研究任务，聘期根据项目研究时限而定。先期暂聘下列人员。</p>

				</div>
				<div class="content" style="text-indent:0em;" ng-if=" showContent == 13">
					<div class="committee">
						<c:forEach var="member2" items="${member2}">
						<br />						
								<span class="mb"><a href="PageMemberDetail?id=${member2.id }">${member2.name }
								</a> </span>
						</c:forEach>
					</div>
				</div>
				<div class="content" ng-if=" showContent == 23">
					<p>研究院的研究人员，分为专职和兼职两种。除专职研究人员外，研究院根据研究任务和研究计划，聘用部分兼职人员，兼职人员采取特聘教授和研究员方式参与研究院的研究任务，聘期根据项目研究时限而定。先期暂聘下列人员。</p>
					<div class="committee">
						<c:forEach var="member3" items="${member3}">
							<br />
								<span class="mb"><a href="PageMemberDetail?id=${member3.id }">${member3.name }
								</a> </span>
						</c:forEach>
					</div>
				</div>
				<!--研究院机构详情-->
				<div class="content" ng-if="showContent == 4">
					${policyresearch}</div>
				<div class="content" ng-if=" showContent == 14">
					${standresearch }</div>
				<div class="content" ng-if=" showContent == 24">${multioffice }
				</div>
				<div class="content" ng-if=" showContent == 34">
					${langresearch }</div>
				<!-- 院长 -->
				<div class="content" ng-if=" showContent == 7">${president }</div>
				<div class="content" ng-if=" showContent == 6">
					${honorpresident }</div>
			</div>
		</div>
	</div>

	<div class="foot">版权所有© 国家民委中国民族语言文字应用研究院</div>

	<script src="<%=request.getContextPath()%>/js/angular.min.js"></script>
	<script src="<%=request.getContextPath()%>/js/jquery-3.1.1.min.js"></script>
	<script src="<%=request.getContextPath()%>/js/main.js"></script>
</body>
</html>