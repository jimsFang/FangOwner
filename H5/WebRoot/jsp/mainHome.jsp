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
<script type="text/javascript">

function navTop(id){
	if(id!=''&&id!=null&&id=='jokeImg'){
		iframecenter.location="<%=rootPath%>/jokeImg";
	}else if(id!=''&&id!=null&&id=='history'){
		iframecenter.location="<%=rootPath%>/history";
	}else{
		iframecenter.location="http://www.baidu.com";
	}	
}


//iframe高度自适应，小于500时高500
function dyniframesize(down) { 
	var pTar = null; 
	if (document.getElementById){ 
		pTar = document.getElementById(down); 
	} 
	else{ 
		eval('pTar = ' + down + ';'); 
	} 
	if (pTar && !window.opera){ 
	//begin resizing iframe 
	pTar.style.display="block" 
		if (pTar.contentDocument && pTar.contentDocument.body.offsetHeight){ 
		//ns6 syntax 
			if(pTar.contentDocument.body.offsetHeight +20<500){
				pTar.height = 500;
			}else{
				pTar.height = pTar.contentDocument.body.offsetHeight +20; 
			}
		//pTar.width = pTar.contentDocument.body.scrollWidth+20; 
		} 
		else if (pTar.Document && pTar.Document.body.scrollHeight){ 
		//ie5+ syntax 
			if(pTar.Document.body.scrollHeight<500){
				pTar.height = 500;
			}else{
				pTar.height = pTar.Document.body.scrollHeight; 
			}
		//pTar.width = pTar.Document.body.scrollWidth; 
		} 
	} 
}

</script>
</head>
<body>
    <div class="panel panel-default">
<!--         <nav class="navbar navbar-default"> -->
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#"><button type="button" onclick="navTop('jokeImg')" class="btn btn-success">搞笑图</button></a> 
                    <a class="navbar-brand" href="#"> <button type="button" onclick="navTop('history')" class="btn btn-success">历史</button></a> 
                    <a class="navbar-brand" href="#"> <button type="button" onclick="navTop()" class="btn btn-success">天猫</button></a>
                </div>
            </div>
<!--         </nav> -->
    </div>
    
    <div  style="width: 100%;margin:0px auto;">
        <iframe src="#" id="iframecenter" name="iframecenter" frameborder=0 scrolling="auto" width="100%" onload="javascript:dyniframesize('iframecenter');" ></iframe>
        
    </div>
</body>
</html>
