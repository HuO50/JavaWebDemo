<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
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
		<div class="mt-20">
			<table
				class="table table-border table-bordered table-bg table-hover table-sort">
				<thead>
					<tr class="text-c">
						<th width="45%">规章制度</th>

						<th width="15%">操作</th>
					</tr>
				</thead>
				<tbody>
					<!-- 修改 聘任条例 -->
					<tr class="text-c">
						<td width="45%" style="text-align: center;"><a
							style="text-decoration: none; cursor: pointer; color: black;"
							href="javascript:void(0)"
							onclick="layer_show('研究人员聘任条例','RuleRecruitDetail','800','800')">
								研究人员聘任条例</a></td>
						<td class="f-14 td-manage"><a style="text-decoration: none"
							class="ml-5"
							onClick="article_edit('修改聘任条例制度','RuleRecruitModify')"
							href="javascript:;" title="编辑"> <i class="fa fa-pencil"></i>
						</a> &nbsp;&nbsp;&nbsp;&nbsp;</td>
					</tr>
					<!-- 修改 聘任合同  -->
					<tr class="text-c">
						<td width="45%" style="text-align: center;"><a
							style="text-decoration: none; cursor: pointer; color: black;"
							href="javascript:void(0)"
							onclick="layer_show('研究人员聘任合同','RuleContractDetail','800','800')">
								研究人员聘任合同</a></td>
						<td class="f-14 td-manage"><a style="text-decoration: none"
							class="ml-5"
							onClick="article_edit('修改聘任合同制度','RuleContractModify')"
							href="javascript:;" title="编辑"> <i class="fa fa-pencil"></i>
						</a> &nbsp;&nbsp;&nbsp;&nbsp;</td>
					</tr>

				</tbody>
			</table>
		</div>
	</div>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="layer/layer.js"></script>

	<script type="text/javascript" src="js/H-ui.js"></script>
	<script type="text/javascript" src="js/H-ui.admin.js"></script>
	<script type="text/javascript">
	
		/*资讯-编辑*/
		function article_edit(title, url, w, h) {
			var index = layer.open({
				type : 2,
				title : title,
				content : url
			});
			layer.full(index);
		}

		function layer_show(title, url, w, h) {
			if (title == null || title == '') {
				title = false;
			}
			;
			if (url == null || url == '') {
				url = "404.html";
			}
			;
			var h = window.screen.availHeight - 300;
			layer.open({
				type : 2,
				area : [ w + 'px', h + 'px' ],
				fix : true,
				shift : 0,
				maxmin : true,
				shade : 0.4,
				title : false,
				content : url
			});
		}
	</script>
</body>
</html>