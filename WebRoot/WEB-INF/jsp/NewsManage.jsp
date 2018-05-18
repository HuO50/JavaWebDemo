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
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link href="css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="font-awesome-4.5.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<title>资讯列表</title>
</head>
<body>
	<div class="breadcrumb">
		<a class=" r mr-20" style="padding-top: 6px"
			href="javascript:location.replace(location.href);"> <i
			class="fa fa-refresh fa-2x" style="color: #5eb95e"></i>
		</a>
	</div>
	<div class="pd-20">
		<div class="cl pd-5 bg-1 bk-gray mt-20">
			<span class="l">
				<a class="btn btn-primary radius"
				onclick="article_add('发布新闻','NewsRelease')" href="javascript:;">
					<i class="fa fa-plus"></i> 发布新闻
				</a>
			</span> 
			<span class="r">共有数据：<strong>${fn:length(newslist)}</strong>条
			</span>
		</div>
		<div class="mt-20">
			<table
				class="table table-border table-bordered table-bg table-hover table-sort">
				<thead>
					<tr class="text-c">
						<th width="5%">ID</th>
						<th width="45%">新闻标题</th>
						<th width="10%">栏目</th>
						<th width="10%">作者</th>
						<th width="15%">发布时间</th>
						<th width="15%">操作</th>
					</tr>
				</thead>
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
			</table>
		</div>
	</div>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="layer/layer.js"></script>
	<script type="text/javascript"
		src="datatables/1.10.0/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="js/H-ui.js"></script>
	<script type="text/javascript" src="js/H-ui.admin.js"></script>
	<script type="text/javascript">
		$('.table-sort').dataTable({
			"aaSorting" : [ [ 0, "asc" ] ],//默认第几个排序
			"bStateSave" : true,//状态保存
			"aoColumnDefs" : [
			//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
			{
				"orderable" : false,
				"aTargets" : [ 1, 4 ]
			} // 制定列不参与排序
			]
		});

		/*资讯-添加*/
		function article_add(title, url, w, h) {
			var index = layer.open({
				type : 2,
				title : title,
				content : url
			});
			layer.full(index);
		}
		/*资讯-编辑*/
		function article_edit(title, url, w, h) {
			var index = layer.open({
				type : 2,
				title : title,
				content : url
			});
			layer.full(index);
		}
		/*资讯-删除*/
		function article_del(title, url, w, h) {
			var index = layer.open({
				type : 2,
				title : title,
				content : url
			});
		}
		
		function layer_show(title,url,w,h){
			if (title == null || title == '') {
				title=false;
			};
			if (url == null || url == '') {
				url="404.html";
			};
			var h = window.screen.availHeight - 300;
			layer.open({
				type:2,
				area: [w+'px', h +'px'],
				fix: true,
				shift:0,
				maxmin: true,
				shade:0.4,
				title: false,
				content: url
			});
		}
	</script>
</body>
</html>