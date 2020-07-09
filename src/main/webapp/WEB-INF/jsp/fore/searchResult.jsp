<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
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


<div class="searchProducts">

    <c:forEach items="${ss}" var="s">
    <div class="productUnit" price="${s.price}">
        <a href="foreproduct?pid=${s.id}">
            <img class="productImage" src="img/lunbo/11.png">
        </a>
        <span class="productPrice">¥<fmt:formatNumber type="number" value="${s.price}" minFractionDigits="2"/></span>
        <a class="productLink" href="foreproduct?pid=${s.id}">
                ${fn:substring(s.sname, 0, 50)}
        </a>

        <a class="tmallLink" href="foreproduct?pid=${s.id}"></a>

        <div class="productInfo">
            <span class="monthDeal ">月成交 <span class="productDealNumber">1笔</span></span>
            <span class="productReview">评价<span class="productReviewNumber">1</span></span>
            <span class="wangwang"><img src="img/site/wangwang.png"></span>
        </div>

    </div>
    </c:forEach>
    <c:if test="${empty ss}">
        <div class="noMatch">没有满足条件的产品</div>
    </c:if>
        <div style="clear:both"></div>
</div>