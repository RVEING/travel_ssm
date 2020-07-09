<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix='fmt' %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@include file="../include/top2.jsp" %>

<head>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/fore/style.css" rel="stylesheet">
</head>
<style>
    body{
        font-size: 12px;
        font-family: Arial;
    }
    div.categoryPageDiv{
        max-width: 1080px;
        margin: 10px auto;
    }
    div.categoryProducts{
        padding: 0px 20px 40px 20px;
    }
    div.productUnit{
        width: 238px;
        height: 250px;
        border: 3px solid #fff;
        background-color: white;
        margin: 12px 5px;
        float: left;
    }
    div.productUnit:hover{
        border:3px solid #C40000;
    }
    div.productUnitFrame{
        border:1px solid #eee;
        height:100%;
    }
    div.productUnitFrame:hover{
        border:1px solid #C40000;
    }
    div.productUnit img.productImage{
        width: 100%;
        height: 150px;
    }
    div.productUnit span.productPrice{
        font-size: 20px;
        color: #CC0000;
        display: block;
        padding-left: 4px;
    }
    div.productUnit a.productLink{
        margin: 10px 0px;
        color: #333333;
        display: block;
        height:34px;
    }
    div.productUnit a.productLink:hover{
        text-decoration: underline;
        color: #C40000;
    }
    div.productUnit a.tmallLink{
        margin: 10px 0px;
        color: #999999;
        display:block;
        text-decoration: underline;
    }
    div.productUnit a.tmallLink:hover{
        text-decoration: underline;
        color: #C40000;
    }
    div.productUnit div.productInfo{
        border-top-width: 1px;
        border-top-style: solid;
        border-top-color: #EEEEEE;
        color:#999999;
    }
    div.productUnit span.productDealNumber{
        font-weight: bold;
        color: #B57C5B;
    }
    div.productUnit span.productReview{
        border-left-width: 1px;
        border-left-style: solid;
        border-left-color: #EEEEEE;
        border-right-width: 1px;
        border-right-style: solid;
        border-right-color: #EEEEEE;
    }
    div.productUnit span.productReviewNumber{
        font-weight: bold;
        color: #3388BB;
    }
    div.productUnit span.monthDeal, div.productUnit span.productReview{
        display: inline-block;
        width: 90px;
        height:29px;
        padding-top: 5px;
        padding-left: 5px;
    }
    div.productUnit span.wangwang{
        padding-left: 3px;
    }
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<div class="buyTop" align="center">
    <img src="img/site/kongbai.png">
    <div style="clear:both"></div>
</div>
<div class="categoryPageDiv">
    <div class="categoryProducts">
        <c:forEach items="${ss}" var="s">
        <div price="799.2" class="productUnit">
            <div class="productUnitFrame">
                <a href="#nowhere">
                    <img width="100%" src="img/scenicSpot/${s.firstScenicSpotImage.id}.jpg">
                </a>

                <a class="productLink" href="foreScenicSpot?sid=${s.id}">
                        ${fn:substring(s.sname, 0, 50)}
                </a>
                <span class="productPrice" >¥${s.price}</span>
            </div>
        </div>
        </c:forEach>
        <c:if test="${empty ss}">
            <div class="noMatch">没有满足条件的产品</div>
        </c:if>

        <div style="clear:both"></div>
    </div>
</div>