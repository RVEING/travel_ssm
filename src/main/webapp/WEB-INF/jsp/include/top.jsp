<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix='fmt' %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>

<head>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/fore/style.css" rel="stylesheet">
</head>

<nav class="top ">
    <a href="forehome">
        <span style="color:#C40000;margin:0px" class=" glyphicon glyphicon-home redColor"></span>
        去吧首页
    </a>

    <span>喵，欢迎来去吧</span>

    <c:if test="${!empty user}">
        <a href="loginPage">${user.uname}</a>
        <a href="forelogout">退出</a>
    </c:if>

    <c:if test="${empty user}">
        <a href="loginPage">请登录</a>
        <a href="registerPage">免费注册</a>
    </c:if>

    <a href="/travel_ssm_war_exploded/admin_category_list">后台管理</a>

    <span class="pull-right">
            <a href="forebought">我的订单</a>
            <a href="foreMyInfo">我的信息</a>
        </span>

</nav>

