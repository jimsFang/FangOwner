<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String rootPath = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>springMVC--bootstrap</title>

<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="<%=rootPath%>/source/bootstrap3.3.6/css/bootstrap.min.css">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="<%=rootPath%>/source/bootstrap3.3.6/js/bootstrap.min.js"></script>
</head> 
<body>

    <c:forEach items="${list}" var="rec" varStatus="status">
	<div class="media">
		<div class="media-left">
			<a href="#"> <img class="media-object"
				src="<%=rootPath%>/source/img/icon_imp.png" alt="测试">
			</a>
		</div>
		<div class="media-body">
			<h4 class="media-heading">${rec.NAME}</h4>
			${rec.descrip }
		</div>
	</div>
    </c:forEach>
    
    <div class="jumbotron">
        <h1>Hello, world!</h1>
        <p>...</p>
        <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>
    </div>
	
</body>
</html>
