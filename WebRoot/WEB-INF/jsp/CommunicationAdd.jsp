<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link href="css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="font-awesome-4.5.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>新增文章</title>
</head>
<body>
	<div style="float: center;">
		<form action="CommunicationAddResult" method="post"
			class="form form-horizontal" id="form-article-add">
			<div class="row cl">
				<label class="form-label col-1"><span class="c-red">*</span>文章标题：</label>
				<div class="formControls col-11" style="width: 80%">
					<input type="text" class="input-text" value="" placeholder=""
						id="title" name="title">
				</div>
			</div>
			<div class="row cl">
				<div>
					<label class="form-label col-1">文章作者：</label>
					<div class="formControls col-1" style="width: 10%">
						<input type="text" class="input-text" value="研究院"
							id="author" name="author">
					</div>
				</div>
				<div>
					<label class="form-label col-1">所属栏目：</label>
					<div class="formControls col-1" style="width: 10%;">
						<span class="select-box"> <select class="select" id="mark"
							name="mark">
								<option value="xsjl">学术交流</option>
								<option value="hzyj">合作研究</option>
						</select>
						</span>
					</div>
				</div>
				<div>
					<label class="form-label col-1">是否置顶：</label>
					<div class="formControls col-1" style="width: 10%;">
						<span class="select-box"> <select class="select" id="istop"
							name="istop">
								<option value="true">置顶</option>
								<option value="false" selected>不置顶</option>
						</select>
						</span>
					</div>
				</div>
				<div>
					<button onClick="layer_open();" class="btn btn-primary radius"
						type="submit">
						<i class="fa fa-check"></i>
						&nbsp;&nbsp;发&nbsp;&nbsp;&nbsp;&nbsp;布&nbsp;&nbsp;
					</button>
					&nbsp;&nbsp;&nbsp;
					<button onClick="layer_close();" style="text-aligh: right;"
						class="btn btn-default radius" type="button">
						<i class="fa fa-close"></i>&nbsp;&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;&nbsp;
					</button>
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-1">文章内容：</label>
				<div class="formControls col-11" style="width: 80%">
					<script id="content" name="content" type="text/plain"
						style="width: 100%; height: 400px;"></script>
				</div>
			</div>

		</form>
	</div>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="Validform/5.3.2/Validform.min.js"></script>
	<script type="text/javascript" src="ueditor/1.4.3/ueditor.config.js"></script>
	<script type="text/javascript" src="ueditor/1.4.3/ueditor.all.min.js"></script>
	<script type="text/javascript" src="ueditor/1.4.3/lang/zh-cn/zh-cn.js"></script>
	<script type="text/javascript" src="js/H-ui.js"></script>
	<script type="text/javascript" src="js/H-ui.admin.js"></script>
	<script type="text/javascript">
    var ue = new baidu.editor.ui.Editor(
            {
                //initialFrameWeight:100%,
                initialFrameHeight:600,
                textarea: 'content',      //设置提交时编辑器内容的名字

                autoFloatEnabled: false,
                focus:false,
                autoHeightEnabled: false,
                sourceEditor: true,
                wordCount: false,               //关闭字数统计
                elementPathEnabled: false,      //关闭elementPath
                maximumWords: 10240
            }
        );
  ue.render("content");
	</script>
</body>
</html>