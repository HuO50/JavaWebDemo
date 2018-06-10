<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<title>学术交流</title>
<link rel="stylesheet" href="css/main.css">
<script src="js/angular.min.js"></script>
<link rel="stylesheet" href="css/main.css">
<link href="font-awesome-4.5.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="http://cdn.datatables.net/1.10.15/css/jquery.dataTables.min.css"
	rel="stylesheet" type="text/css" />
<script src="<%=request.getContextPath()%>/js/jquery-3.1.1.min.js"></script>
<script src="<%=request.getContextPath()%>/js/main.js"></script>
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
				<li class="chooseTab"><a href="javascript:void(0)">成果展示</a></li>
				<li><a href="PageRule">管理制度</a></li>
			</ul>
		</div>
		<div class="main">
			<div class="aside">
				<ul>
					<a href="PageProjectNews">
						<li class="btn" ng-click="changeContent($event,5,1)"
						ng-class="{'chooseContent':showContent == 2}"><span>重大项目</span></li>
					</a>
					<a href="PageScienceResearchNews">
						<li class="btn chooseContent" ng-click="changeContent($event,5,2)"
						ng-class="{'chooseContent':showContent == 1}"><span>科学研究</span></li>
					</a>
					<a href="PageCourseNews">
						<li class="btn" ng-click="changeContent($event,5,3)"
						ng-class="{'chooseContent':showContent == 3}"><span>精品课程</span></li>
					</a>
				</ul>
			</div>
			<div class="section">
				<div class="header">
					<h3>{{headerText}}</h3>
				</div>
				<div class="" ng-if="showContent == 1">
					<table id="myTable"
						class=" table table-border table-bordered table-bg table-hover table-sort abc">
						<thead>
							<tr>
								<th style="display: none;"></th>
								<th style="display: none;"></th>
								<th style="display: none;"></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="news" items="${news}">
								<tr class="text-l">
									<td width="80%" class=""><c:if
											test="${news.istop == true}">
											<font size="2" color="red">置顶</font>
										</c:if> &nbsp <a href="PageNews?id=${news.id}"> <c:if
												test="${fn:length(news.title)>'31'}">  
                   							 		${fn:substring(news.title,0,31)}...  
           					 					</c:if> <c:if test="${fn:length(news.title)<='31'}">  
               							 			${news.title}  
            								</c:if>
									</a></td>
									<td width="20%" class="text-c"><span class="text-c">${news.time}</span></td>
									<td style="display: none;">${news.sortid }</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

	<div class="foot">版权所有© 国家民委中国民族语言文字应用研究院</div>


	<script type="text/javascript" src="layer/layer.js"></script>
	<script type="text/javascript"
		src="datatables/1.10.0/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="js/main.js"></script>
	<script type="text/javascript" src="js/jquery.page.js"></script>
	<script>
		$(document).ready(function() {
			var table = $('#myTable').DataTable({
				"order" : [ [ 2, "asc" ] ],
		        bFilter: false,    //去掉搜索框方法三：这种方法可以
		        bLengthChange: false,   //去掉每页显示多少条数据方法 
			});
		});
	</script>
</body>
</html>