<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../include/admin/adminHeader.jsp"%>
<%@include file="../include/top2.jsp" %>
<head>
    <title>我的信息</title>
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



<script>
    $(function(){

        $("#editForm").submit(function(){
            if(!checkEmpty("sname","景点名称"))
                return false;
            if(!checkNumber("price","景点价格"))
                return false;
            if(!checkInt("number","库存数量"))
                return false;
            return true;
        });
    });

</script>
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

<div class="workingArea">



    <div class="panel panel-warning editDiv">
        <div class="panel-heading">我的信息</div>
        <div class="panel-body">
            <form method="post" id="editForm" action="foreUpdateInfo"  enctype="multipart/form-data">
                <table class="editTable">
                    <tr>
                        <td>用户名</td>
                        <td><input  id="hname" name="hname" value="${u.uname}" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>居住地址</td>
                        <td><input  id="address" name="address" value="${u.address}" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>x性别</td>
                        <td><input  id="sex" name="sex" value="${u.sex}" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>电话</td>
                        <td><input  id="phone_number" name="phone_number" value="${u.phone_number}" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>邮箱</td>
                        <td><input  id="email" name="email" value="${u.email}" type="text" class="form-control"></td>
                    </tr>

                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <input type="hidden" name="id" value="${u.id}">
                            <button type="submit" class="btn btn-success">保 存</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>
