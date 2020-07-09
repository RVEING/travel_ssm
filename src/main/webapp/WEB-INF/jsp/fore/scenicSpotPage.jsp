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

<%@include file="../include/top2.jsp" %>

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

        $(".addCartLink").click(function(){
            var page = "forecheckLogin";
            $.get(
                page,
                function(result){
                    if("success"==result){
                        var pid = ${p.id};
                        var num= $(".productNumberSetting").val();
                        var addCartpage = "foreaddCart";
                        $.get(
                            addCartpage,
                            {"pid":pid,"num":num},
                            function(result){
                                if("success"==result){
                                    $(".addCartButton").html("已加入购物车");
                                    $(".addCartButton").attr("disabled","disabled");
                                    $(".addCartButton").css("background-color","lightgray")
                                    $(".addCartButton").css("border-color","lightgray")
                                    $(".addCartButton").css("color","black")

                                }
                                else{

                                }
                            }
                        );
                    }
                    else{
                        $("#loginModal").modal('show');
                    }
                }
            );
            return false;
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

<div class="buyTop" align="center">
    <img src="img/site/kongbai.png">
    <div style="clear:both"></div>
</div>
<div class="Title">
    <span class="spotTitle">${s.sname}</span>
    <span class="asd22"><button class="buyButton">喜欢</button></span>
</div>
<div class="imgAndInfo">

    <div class="imgInimgAndInfo">
        <img src="img/scenicSpot/${s.firstScenicSpotImage.id}.jpg" class="bigImg">
        <div class="smallImageDiv">
            <c:forEach items="${s.singleImages}" var="si">
                <img src="img/scenicSpot_small/${si.id}.jpg" bigImageURL="img/scenicSpot/${si.id}.jpg" class="smallImage">
            </c:forEach>
        </div>
        <div class="img4load hidden" ></div>
    </div>

    <div class="infoInimgAndInfo">

        <div class="productPrice">
            <div class="juhuasuan">
                <span class="juhuasuanBig" >${s.sname}</span>
            </div>
            <div class="productPriceDiv">
                <div class="gouwujuanDiv">
                    <span> 凭身份证进入景点</span>

                </div>

                <div class="promotionDiv">
                    <span class="promotionPriceDesc">价格 </span>
                    <span class="promotionPriceYuan">¥</span>
                    <span class="promotionPrice">
						<fmt:formatNumber type="number" value="${s.price}" minFractionDigits="2"/>
					</span>
                </div>
            </div>
        </div>
        <div class="productSaleAndReviewNumber">
            <div>名称 <span class="redColor boldWord"> 门票</span></div>
            <div>类型 <span class="redColor boldWord"> 成人票</span></div>
        </div>
        <div class="productNumber">
            <span class="boldWord">提前预定时间：最早可订明日</span>

            <span class="boldWord">仅支持支付宝支付</span>
        </div>
        <div class="serviceCommitment">
            <span class="serviceCommitmentDesc">服务承诺</span>
            <span class="serviceCommitmentLink">
				<a href="#nowhere">正品保证</a>
				<a href="#nowhere">极速退款</a>
				<a href="#nowhere">赠运费险</a>
				<a href="#nowhere">七天无理由退换</a>
			</span>
        </div>

        <div class="buyDiv">
            <a class="buyLink" href="forebuyone?sid=${s.id}&num=1"><button class="buyButton">立即购买</button></a>

        </div>
    </div>

    <div style="clear:both"></div>

</div>
<div class="bottom"></div>

<div class="spotSummary">
    ${s.summary}
</div>
<div class="bottom"></div>


<div>
    <div class="spotSummary">
        <div class="productSaleAndReviewNumber">
            <div >
                <span>名称：</span>
                <span>${s.phone_number}</span>
            </div>
            <div class="summary2">
                <span>用时参考：</span>
                <span>1-3小时</span>
            </div>
        </div>
    </div>
    <div class="spotSummary">
        <span>景点地址：</span>
        <span>${s.address}</span>
    </div>
    <div class="spotSummary">
        <span>营业时间：</span>
        <span>${s.businessDate}</span>
    </div>
    <div class="spotSummary">
        <span>景点交通：</span>
        <span>${s.traffic}</span>
    </div>
    <div class="spotSummary">
        <span>有效时间：</span>
        <span>(有效期内可入景点一次)指定当天游玩日有效</span>
    </div>
</div>




<%@include file="../include/footer.jsp" %>