<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix='fmt' %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<head>
    <meta charset="utf-8" />

</head>


<link rel="stylesheet" href="cssjs/css/index.css" />
<script type="text/javascript" src="cssjs/js/jquery-2.1.0.js"></script>

<link rel="stylesheet" href="cssjs/css/swiper.min.css" />
<script type="text/javascript" src="cssjs/js/swiper.min.js"></script>
<link rel="stylesheet" href="cssjs/css/btomlunbo.css" />
<link rel="stylesheet" href="cssjs/css/index_one.css" />
<link rel="stylesheet" href="cssjs/css/index_two.css" />
<link rel="stylesheet" href="cssjs/css/index_threr.css" />
<link rel="stylesheet" href="cssjs/css/index_four.css" />
<!--<script type="text/javascript" src="js/mouserol.js" ></script>-->
<script type="text/javascript" src="cssjs/js/fxlunbo.js"></script>
<link rel="stylesheet" href="cssjs/css/index_frame.css" />
<script type="text/javascript" src="cssjs/js/index.js"></script>

<body>
<center>
    <!--
    描述：标题头部
-->
    <header class="header">
        <div class="mb"></div>
        <div class="header_nav">
            <div class="header_div">
                <a href="forehome"></a>
                <ul class="ullist">
                    <li><a href="forehome">首页</a></li>
                    <li><a href="foreNavSpot">景点</a></li>
                    <li><a href="foreNavHotel">酒店</a></li>
                    <li><a href="fore6">游记</a></li>
                    <li><a href="foreMyInfo">个人中心</a></li>
                    <li><a href="forebought">我的订单</a></li>
                </ul>
                <span class="long">

                    <c:if test="${!empty user}">
                        <a href="loginPage">${user.uname}</a>
                        <a href="forelogout">退出</a>
                    </c:if>

                    <c:if test="${empty user}">
                        <a class="login" href="loginPage">登录</a>|<a  href="registerPage">注册</a>
                    </c:if>
                </span>
                <span class="long"><a href="adminLoginPage">| 管理员登录</a></span>
            </div>
        </div>
    </header>
    <!--
    标题头部结束
-->


</center>

</body>


<script type="text/javascript">
    $(function() {
        $('#box').movingBoxes({
            startPanel: 1,
            reducedSize: .5,
            wrap: true,
            buildNav: false, //true
            navFormatter: function() {
                return "&#9679;";
            } // function which returns the navigation text for each panel
        });
    });
</script>

</html>