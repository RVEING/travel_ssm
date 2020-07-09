<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix='fmt' %>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="https://how2j.cn/study/js/jquery/2.0.0/jquery.min.js"></script>
    <link href="https://how2j.cn/study/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="https://how2j.cn/study/js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>

<style>
    div.registerDiv{
        margin: 10px 20px;
        text-align: center;
    }
    table.registerTable{
        color: #3C3C3C;
        font-size: 16px;
        table-layout: fixed;
        margin-top: 50px;
    }
    table.registerTable td{
        padding: 10px 30px;
    }
    table.registerTable input{
        border: 1px solid #DEDEDE;
        width: 213px;
        height: 36px;
        font-size: 14px;
    }
    table.registerTable button{
        width: 170px;
        height: 36px;
        border-radius: 2px;
        color: white;
        background-color: #C40000;
        border-width: 0px;
    }
    td.registerTip{
        font-weight: bold;
    }
    td.registerTableLeftTD{
        width: 300px;
        text-align: right;
    }
    td.registerTableRightTD{
        width: 300px;
        text-align: left;
    }
    td.registerButtonTD{
        text-align: center;
    }
</style>

<script>
    $(function(){

        <c:if test="${!empty msg}">
        $("span.errorMessage").html("${msg}");
        $("div.registerErrorMessageDiv").css("visibility","visible");
        </c:if>

        $(".registerForm").submit(function(){
            if(0==$("#name").val().length){
                $("span.errorMessage").html("请输入用户名");
                $("div.registerErrorMessageDiv").css("visibility","visible");
                return false;
            }
            if(0==$("#password").val().length){
                $("span.errorMessage").html("请输入密码");
                $("div.registerErrorMessageDiv").css("visibility","visible");
                return false;
            }
            if(0==$("#repeatpassword").val().length){
                $("span.errorMessage").html("请输入重复密码");
                $("div.registerErrorMessageDiv").css("visibility","visible");
                return false;
            }
            if($("#password").val() !=$("#repeatpassword").val()){
                $("span.errorMessage").html("重复密码不一致");
                $("div.registerErrorMessageDiv").css("visibility","visible");
                return false;
            }

            return true;
        });
    })
</script>



<form method="post" action="foreregister" class="registerForm">

    <div class="registerDiv">
        <div class="registerErrorMessageDiv">
            <div class="alert alert-danger" role="alert">
                <button type="button" class="close" data-dismiss="alert" aria-label="Close"></button>
                <span class="errorMessage"></span>
            </div>
        </div>

        <table class="registerTable" align="center">
            <tr>
                <td  class="registerTip registerTableLeftTD">设置会员名</td>
                <td></td>
            </tr>
            <tr>
                <td class="registerTableLeftTD">登陆名</td>
                <td  class="registerTableRightTD"><input id="uname" name="uname" placeholder="会员名一旦设置成功，无法修改" > </td>
            </tr>
            <tr>
                <td  class="registerTip registerTableLeftTD">设置登陆密码</td>
                <td  class="registerTableRightTD">登陆时验证，保护账号信息</td>
            </tr>
            <tr>
                <td class="registerTableLeftTD">登陆密码</td>
                <td class="registerTableRightTD"><input id="password" name="password" type="password"  placeholder="设置你的登陆密码" > </td>
            </tr>
            <tr>
                <td class="registerTableLeftTD">密码确认</td>
                <td class="registerTableRightTD"><input id="repeatpassword" type="password"   placeholder="请再次输入你的密码" > </td>
            </tr>

            <tr>
                <td colspan="2" class="registerButtonTD">
                    <a href="registerSuccess.jsp"><button>提   交</button></a>
                </td>
            </tr>
        </table>
    </div>
</form>