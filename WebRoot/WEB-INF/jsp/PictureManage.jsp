<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<link href="<%=request.getContextPath()%>/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<title>上传轮播图片</title>
</head>
<body>

	<div>
		<form method="post" action="UploadPicture" enctype=multipart/form-data>
			<div class="row cl">
			
				<div class="formControls col-1"
					style="width: 25%; padding-top: 5%; padding-left: 10%;">
					<span>轮播图像1选择</span>
				</div>
				<div class="col-3" style="padding-top: 5%;">
					<input type="file" name="uploadFile" />
				</div>
				<div style="padding-top: 5%;">
					<input type="submit" value="上传" />
				</div>
			</div>
		</form>
</div>
	<div>
		<form method="post" action="UploadPicture2" enctype=multipart/form-data>
			<div class="row cl">
			
				<div class="formControls col-1"
					style="width: 25%; padding-top: 5%; padding-left: 10%;">
					<span>轮播图像2选择</span>
				</div>
				<div class="col-3" style="padding-top: 5%;">
					<input type="file" name="uploadFile" />
				</div>
				<div style="padding-top: 5%;">
					<input type="submit" value="上传" />
				</div>
			</div>
		</form>
</div>
	<div>
		<form method="post" action="UploadPicture3" enctype=multipart/form-data>
			<div class="row cl">
			
				<div class="formControls col-1"
					style="width: 25%; padding-top: 5%; padding-left: 10%;">
					<span>轮播图像3选择</span>
				</div>
				<div class="col-3" style="padding-top: 5%;">
					<input type="file" name="uploadFile" />
				</div>
				<div style="padding-top: 5%;">
					<input type="submit" value="上传" />
				</div>
			</div>
		</form>
</div>

	<div>
		<form method="post" action="UploadPicture4" enctype=multipart/form-data>
			<div class="row cl">
			
				<div class="formControls col-1"
					style="width: 25%; padding-top: 5%; padding-left: 10%;">
					<span>研究院概括</span>
				</div>
				<div class="col-3" style="padding-top: 5%;">
					<input type="file" name="uploadFile" />
				</div>
				<div style="padding-top: 5%;">
					<input type="submit" value="上传" />
				</div>
			</div>
		</form>
</div>
	<div>
		<form method="post" action="UploadPicture5" enctype=multipart/form-data>
			<div class="row cl">
			
				<div class="formControls col-1"
					style="width: 25%; padding-top: 5%; padding-left: 10%;">
					<span>学术动态</span>
				</div>
				<div class="col-3" style="padding-top: 5%;">
					<input type="file" name="uploadFile" />
				</div>
				<div style="padding-top: 5%;">
					<input type="submit" value="上传" />
				</div>
			</div>
		</form>
</div>
	<div>
		<form method="post" action="UploadPicture6" enctype=multipart/form-data>
			<div class="row cl">
			
				<div class="formControls col-1"
					style="width: 25%; padding-top: 5%; padding-left: 10%;">
					<span>学术交流</span>
				</div>
				<div class="col-3" style="padding-top: 5%;">
					<input type="file" name="uploadFile" />
				</div>
				<div style="padding-top: 5%;">
					<input type="submit" value="上传" />
				</div>
			</div>
		</form>
</div>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="layer/layer.js"></script>
	<script type="text/javascript"
		src="datatables/1.10.0/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="js/H-ui.js"></script>
	<script type="text/javascript" src="js/H-ui.admin.js"></script>

</body>
</html>