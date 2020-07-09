<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix='fmt' %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@include file="../include/top2.jsp" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<base href="<%=basePath%>">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>发布游记</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <!-------------jquery库-------------->
    <script type="text/javascript" src="js/js/jquery-1.8.3.min.js"></script>
    <!-------------Amazeui--------------->
    <script type="text/javascript" src="js/js/amazeui.js"></script>
    <link rel="stylesheet" type="text/css" href="css/css/amazeui.css">
    <!------------核心样式-------------->
    <link rel="stylesheet" type="text/css" href="css/css/user.css">
    <link href="css/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="js/js/jquery.min.js"></script>
    <script type="text/javascript" src="js/js/bootstrap.min.js"></script>
    <link href="css/css/editor.css" type="text/css" rel="stylesheet" />

</head>
<body>
<div class="buyTop" align="center">
    <img src="img/site/kongbai.png">
    <div style="clear:both"></div>
</div>

<div id="quick_nav">
    <%-- <a href="${pageContext.request.contextPath}/travel/my_index"><span
        class="ico1"><img src="images/nav_ico1.png" /></span>个人主页</a> --%>
    <a href="foreMyInfo"><span class="ico3"><img src="img/site/user_number.png" /></span>我的信息</a>

    <a href="fore2"><span class="ico2"><img src="img/site/nav_ico2.png" /></span>发布游记</a>
    <a href=""><span class="ico7"><img src="img/site/nav_ico7.png" /></span>我的游记</a>

</div>
<!-----------------发布封面---------------->
<div id="write_cover">
    <div class="replace_name">
        <form action="${pageContext.request.contextPath }/uploadTravel.action" method="post" enctype="multipart/form-data">
            <div id="div1" class="form-group">
                <label for="name">*标题</label> <input type="text" name="title"
                                                     class="form-control" id="name" placeholder="请输入游记的标题" value="">
                <textarea name="describle1" class="form-control" rows="3"
                          placeholder="请输入描述一"></textarea>
                <textarea name="describle2" class="form-control" rows="3"
                          placeholder="请输入描述二"></textarea>
                <textarea name="describle3" class="form-control" rows="3"
                          placeholder="请输入描述三"></textarea>
            </div>
            <table class="addPictureTable" align="center">
                <tr>
                    <td class="addPictureTableTD">
                        <div>
                            <div class="panel panel-warning addPictureDiv">
                                <div class="panel-heading">新增景点<b class="text-primary"> 单个 </b>图片</div>
                                <div class="panel-body">
                                    <form method="post" class="addFormSingle" action="admin_spotImage_add" enctype="multipart/form-data">
                                        <table class="addTable">
                                            <tr>
                                                <td>请选择本地图片 尺寸400X400 为佳</td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <input id="filepathSingle" type="file" name="image" />
                                                </td>
                                            </tr>
                                            <tr class="submitTR">
                                                <td align="center">
                                                    <input type="hidden" name="scenic_spot_id" value="${s.id}" />
                                                    <button type="submit" class="btn btn-success">提 交</button>
                                                </td>
                                            </tr>
                                        </table>
                                    </form>
                                </div>
                            </div>
                            <table class="table table-striped table-bordered table-hover  table-condensed">
                                <thead>
                                <tr class="success">
                                    <th>ID</th>
                                    <th>景点单个图片缩略图</th>
                                    <th>删除</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${spotSingle}" var="si">
                                    <tr>
                                        <td>${si.id}</td>
                                        <td>
                                            <a title="点击查看原图" href="img/scenicSpot/${si.id}.jpg"><img height="50px" src="img/scenicSpot/${si.id}.jpg"></a>
                                        </td>
                                        <td><a deleteLink="true"
                                               href="admin_spotImage_delete?id=${si.id}"><span
                                                class="     glyphicon glyphicon-trash"></span></a></td>

                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>

                        </div>
                    </td>
                </tr>
            </table>
            <div class="clear"></div>
            <!-- ---------------发布按钮-------------- -->
            <div id="write_button">
                <a class="exit" href="#">退出</a>
                <input type="submit" class="express" value="发表" />
                <div class="clear"></div>
            </div>
        </form>
    </div>
</div>
<div class="clear"></div>

</body>
</html>