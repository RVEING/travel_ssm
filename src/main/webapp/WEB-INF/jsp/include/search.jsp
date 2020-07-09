<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="https://how2j.cn/study/js/jquery/2.0.0/jquery.min.js"></script>
    <link href="https://how2j.cn/study/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="https://how2j.cn/study/js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>
<style>
    div.searchDiv{
        background-color: #C40000;
        width: 400px;
        margin: 10px auto;
        padding: 1px;
        height: 40px;
        display: block;
    }
    div.searchDiv input{
        width: 275px;
        border: 1px solid transparent;
        height: 36px;
        margin: 1px;
        outline:none;
    }
    div.searchDiv button{
        width: 110px;
        border: 1px solid transparent;
        background-color: #C40000;
        color: white;
        font-size: 20px;
        font-weight: bold;
    }
    div.searchBelow{
        margin-top: 3px;
        margin-left: -20px;
    }
    div.searchBelow span{
        color: #999;
    }
    div.searchBelow a{
        padding: 0px 20px 0px 20px;
        font-size: 14px;
    }
    img.logo{
        position: absolute;
        left: 0px;
        top: 30px;
        z-index:-1;
    }
    body{
        font-size:12px;
        font-family:Arial;
    }
    a{
        color:#999;
    }
    a:hover{
        text-decoration:none;
        color:#C40000;
    }
    input.radio {
        float: left;

    }
    span.asd{
        margin: 10px 10px;
    }
</style>

<form action="foresearchAll" method="post" >
    <div class="searchDiv">
        <input name="keyword" type="text" value="${param.keyword}" placeholder="三亚天涯海角  鹿回头 ">
        <button  type="submit" class="searchButton">搜索</button>
        <div class="searchBelow">
            <span class="asd"><input name="choose" class="radio" type="radio" checked="checked" value="1"  style="width:15px;height:15px"/></span>
            <span><input name="choose" class="radio" type="radio"  value="2" style="width:15px;height:15px"/></span>
            <span><input name="choose" class="radio" type="radio"  value="3" style="width:15px;height:15px"/></span>
            <span><input name="choose" class="radio" type="radio"  value="4" style="width:15px;height:15px"/></span>
        </div>
    </div>
</form>

<div style="height:50px"></div>