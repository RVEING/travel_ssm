<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix='fmt' %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<head>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.47/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/fore/style.css" rel="stylesheet">
    <script src="js/moment-with-locales.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.47/js/bootstrap-datetimepicker.min.js"></script>
</head>

<script>
    $(function(){
        $(".orderItemNumberSetting").keyup(function(){
            var sid=$(this).attr("sid");
            var stock= $("span.orderItemStock[sid="+sid+"]").text();
            var price= $("span.orderItemPromotePrice[sid="+sid+"]").text();

            var num= $(".orderItemNumberSetting[sid="+sid+"]").val();
            num = parseInt(num);
            if(isNaN(num))
                num= 1;
            if(num<=0)
                num = 1;
            if(num>stock)
                num = stock;

            syncPrice(sid,num,price);
        });

        $(".numberPlus").click(function(){

            var sid=$(this).attr("sid");
            var stock= $("span.orderItemStock[sid="+sid+"]").text();
            var price= $("span.orderItemPromotePrice[sid="+sid+"]").text();
            var num= $(".orderItemNumberSetting[sid="+sid+"]").val();

            num++;
            if(num>stock)
                num = stock;
            syncPrice(sid,num,price);
        });
        $(".numberMinus").click(function(){
            var sid=$(this).attr("sid");
            var stock= $("span.orderItemStock[sid="+sid+"]").text();
            var price= $("span.orderItemPromotePrice[sid="+sid+"]").text();

            var num= $(".orderItemNumberSetting[sid="+sid+"]").val();
            --num;
            if(num<=0)
                num=1;
            syncPrice(sid,num,price);
        });
    })

    function syncPrice(sid,num,price){
        $(".orderItemNumberSetting[sid="+sid+"]").val(num);
        var SumPrice= num*price;
        $(".orderItemUnitSum[sid="+sid+"]").html("￥"+SumPrice);
        $(".orderItemTotalSumSpan").html("￥"+SumPrice);

        var page = "forechangeOrderItem";
        $.post(
            page,
            {"sid":sid,"number":num},
            function(result){
                if("success"!=result){
                    location.href="loginPage";
                }
            }
        );

    }
    $(function () {
        $('#datetimepicker1').datetimepicker({
            format: 'YYYY-MM-DD',
            locale: moment.locale('zh-cn')
        });
        $('#datetimepicker2').datetimepicker({
            format: 'YYYY-MM-DD hh:mm',
            locale: moment.locale('zh-cn')
        });
    });
</script>

<div class="buyTop" align="center">
    <img src="img/site/buytop.png">
    <div style="clear:both"></div>
</div>
<div class="buyPageDiv">
    <form action="forecreateOrder" method="post">

        <div class="address">
            <div class="addressTip">用户信息</div>
            <div>

                <table class="addressTable">

                    <tr>
                        <td>中文姓名：<span class="redStar">*</span></td>
                        <td><input  name="receiver"  placeholder="请输入姓名" type="text"></td>
                    </tr>
                    <tr>
                        <td>手机号码： <span class="redStar">*</span></td>
                        <td><input name="mobile"  placeholder="请输入11位手机号码" type="text"></td>
                    </tr>
                    <tr>
                        <td>身份证号码：<span class="redStar">*</span></td>
                        <td><input  name="id_number" placeholder="请输入证件号码" type="text"></td>
                    </tr>
                    <tr>
                        <td>日期：<span class="redStar">*</span></td>
                        <td>
                            <div class='input-group date' id='datetimepicker1'>

                                <span class="input-group-addon">
                                    <span class="glyphicon glyphicon-calendar"></span>
                                </span>
                                <input type='text' class="form-control" style="width:160px;" name="iinDate"/>
                            </div>
                        </td>
                    </tr>

                </table>

            </div>

        </div>
        <div class="productList">
            <div class="productListTip">确认订单信息</div>

            <table class="productListTable">
                <thead>
                <tr>
                    <th colspan="2" class="productListTableFirstColumn">

                        <a class="marketLink" href="#nowhere"></a>
                        <a class="wangwanglink" href="#nowhere"> <span class="wangwangGif"></span> </a>
                    </th>
                    <th>单价</th>
                    <th>数量</th>
                    <th>小计</th>

                </tr>
                <tr class="rowborder">
                    <td  colspan="2" ></td>
                    <td></td>
                    <td></td>
                    <td></td>

                </tr>
                </thead>
                <tbody class="productListTableTbody">
                <c:forEach items="${ois}" var="oi" varStatus="st" >
                    <tr class="orderItemTR">
                        <td class="orderItemFirstTD"><img class="orderItemImg" src="img/scenicSpot_middle/22.jpg"></td>
                        <td class="orderItemProductInfo">
                            <a  href="foreScenicSpot?sid=${oi.scenic_spot.id}" class="orderItemProductLink">
                                    ${oi.scenic_spot.sname}
                            </a>

                            <img src="img/site/creditcard.png" title="支持信用卡支付">
                            <img src="img/site/7day.png" title="消费者保障服务,承诺7天退货">
                            <img src="img/site/promise.png" title="消费者保障服务,承诺如实描述">

                        </td>
                        <td>

                            <span class="orderItemProductPrice">￥<fmt:formatNumber type="number" value="${oi.scenic_spot.price}" minFractionDigits="2"/></span>
                        </td>

                        <td>
                            <div class="cartProductChangeNumberDiv">
                                <span class="hidden orderItemStock " sid="${oi.scenic_spot.id}">${oi.scenic_spot.number}</span>
                                <span class="hidden orderItemPromotePrice " sid="${oi.scenic_spot.id}">${oi.scenic_spot.price}</span>
                                <a  sid="${oi.scenic_spot.id}" class="numberMinus" href="#nowhere">-</a>
                                <input sid="${oi.scenic_spot.id}" oiid="${oi.id}" class="orderItemNumberSetting" autocomplete="off" value="${oi.number}" name="num">
                                <a  stock="${oi.scenic_spot.number}" sid="${oi.scenic_spot.id}" class="numberPlus" href="#nowhere">+</a>
                            </div>
                        </td>

                        <td><span class="orderItemUnitSum" sid="${oi.scenic_spot.id}">
                        ￥<fmt:formatNumber type="number" value="${oi.number*oi.scenic_spot.price}" minFractionDigits="2"/>
                        </span></td>

                        <input name="spotPrice" class="hidden" value="${oi.scenic_spot.price}">
                    </tr>
                </c:forEach>

                </tbody>

            </table>
            <div class="orderItemSumDiv">

            </div>

        </div>

        <div class="orderItemTotalSumDiv">
            <div class="pull-right">
                <span>实付款：</span>
                <span class="orderItemTotalSumSpan" >￥<fmt:formatNumber type="number" value="${total}" minFractionDigits="2"/></span>
            </div>
        </div>

        <div class="submitOrderDiv">
            <button type="submit" class="submitOrderButton">提交订单</button>
        </div>

    </form>
</div>