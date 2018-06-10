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
	<div style="float: left; height: 60%;">
		<form action="InfoMultiOfficeModifyResult" method="post"
			class="form form-horizontal" id="form-article-add">
			<div class="row cl" style="padding-left:40%">
				<button onClick="layer_open();" class="btn btn-primary radius"
					type="submit">
					<i class="fa fa-check"></i>
					&nbsp;&nbsp;修&nbsp;&nbsp;&nbsp;&nbsp;改&nbsp;&nbsp;
				</button>
				&nbsp;&nbsp;&nbsp;
				<button onClick="layer_close();" style="text-aligh: right;"
					class="btn btn-default radius" type="button">
					<i class="fa fa-close"></i>&nbsp;&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;&nbsp;
				</button>
			</div>
			<div class="row cl" style="padding-left:20%">

				<div class="formControls col-11" style="width: 80%">
					<script id="content" name="multioffice" type="text/plain"
						style="width: 100%; height: 200px;">
					${multioffice}
				</script>
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
                autoClearinitialContent: true, //focus时自动清空初始化时的内容
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