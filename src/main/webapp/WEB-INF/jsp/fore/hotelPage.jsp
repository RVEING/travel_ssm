<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix='fmt' %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<head>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/fore/style.css" rel="stylesheet">
</head>

<%@include file="../include/top.jsp" %>

<script>

    $(function(){
        var stock = ${p.stock};
        $(".productNumberSetting").keyup(function(){
            var num= $(".productNumberSetting").val();
            num = parseInt(num);
            if(isNaN(num))
                num= 1;
            if(num<=0)
                num = 1;
            if(num>stock)
                num = stock;
            $(".productNumberSetting").val(num);
        });

        $(".increaseNumber").click(function(){
            var num= $(".productNumberSetting").val();
            num++;
            if(num>stock)
                num = stock;
            $(".productNumberSetting").val(num);
        });
        $(".decreaseNumber").click(function(){
            var num= $(".productNumberSetting").val();
            --num;
            if(num<=0)
                num=1;
            $(".productNumberSetting").val(num);
        });

        $(".buyLink").click(function(){
            var page = "forecheckLogin";
            $.get(
                page,
                function(result){
                    if("success"==result){
                        var num = $(".productNumberSetting").val();
                        location.href= $(".buyLink").attr("href")+"&num="+num;
                    }
                    else{
                        $("#loginModal").modal('show');
                    }
                }
            );
            return false;
        });

        $("button.loginSubmitButton").click(function(){
            var name = $("#name").val();
            var password = $("#password").val();

            if(0==name.length||0==password.length){
                $("span.errorMessage").html("请输入账号密码");
                $("div.loginErrorMessageDiv").show();
                return false;
            }

            var page = "foreloginAjax";
            $.get(
                page,
                {"name":name,"password":password},
                function(result){
                    if("success"==result){
                        location.reload();
                    }
                    else{
                        $("span.errorMessage").html("账号密码错误");
                        $("div.loginErrorMessageDiv").show();
                    }
                }
            );

            return true;
        });

        $("img.smallImage").mouseenter(function(){
            var bigImageURL = $(this).attr("bigImageURL");
            $("img.bigImg").attr("src",bigImageURL);
        });

        $("img.bigImg").load(
            function(){
                $("img.smallImage").each(function(){
                    var bigImageURL = $(this).attr("bigImageURL");
                    img = new Image();
                    img.src = bigImageURL;

                    img.onload = function(){
                        console.log(bigImageURL);
                        $("div.img4load").append($(img));
                    };
                });
            }
        );
    });

</script>


<div class="Title">
    <span class="spotTitle">${h.hname}</span>

</div>
<div class="imgAndInfo">

    <div class="imgInimgAndInfo">
        <img src="img/site/28.jpg" class="bigImg">
        <div class="smallImageDiv">
            <c:forEach items="${h.singleImages}" var="hi">
                <img src="img/Hotel_small/${hi.id}.jpg" bigImageURL="img/Hotel/${hi.id}.jpg" class="smallImage">
            </c:forEach>
        </div>
        <div class="img4load hidden" ></div>
    </div>

    <div class="infoInimgAndInfo">

        <div class="spotaddress">
            <span class="word1">景点地址：</span>
            <span class="word2">${h.address}</span>
        </div>

        <div class="spotPhoneNum">
            <span class="word1">电话号码：</span>
            <span class="word2">${h.mobile}</span>
        </div>

    </div>

    <div style="clear:both"></div>

</div>
<div class="bottom"></div>

<div class="spotSummary">
    ${h.summary}
</div>
<div class="bottom"></div>
<div class="menpiao">
    <span class="word1">房间选择</span>
</div>

<div class="buy">

    <c:forEach items="${rs}" var="r">
        <div>
            <span><img src="img/Hotel_small/1.jpg" bigImageURL="img/Hotel/1.jpg" class="smallImage"></span>

            <span>面积${r.area}平方米</span>
            <span>最大入住${r.peopleNum}人</span>
        </div>
        <table class="table table-striped table-bordered table-hover  table-condensed">
            <thead>
            <tr>
                <th>商品名称</th>
                <th>床型</th>
                <th>早餐</th>
                <th>窗户</th>
                <th>宽带</th>
                <th>政策</th>
                <th>房价</th>
                <th></th>
            </tr>
            </thead>

            <tbody>

                <tr>
                    <td>${r.rname}</td>
                    <td>${r.bedType}</td>
                    <td>${r.breakfast}</td>
                    <td>${r.window}</td>
                    <td>${r.broadband}</td>
                    <td>${r.policy}</td>
                    <td>${r.price}</td>
                    <td><a href="forebuyone?sid=${s.id}&num=1" ><button >立即购买</button></a></td>
                </tr>
            </tbody>
        </table>
    </c:forEach>
</div>


<%@include file="../include/footer.jsp" %>