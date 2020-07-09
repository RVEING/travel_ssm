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
    <span class="spotTitle">三亚，以梦为马，趁诗酒年华</span>
    <span class="asd22"><button class="buyButton">喜欢</button></span>
</div>
<div class="imgAndInfo1">
    <div>
        <span>
            <H4>【背景】 每次出去玩回来说写游记，宋先森都是“好呀好呀，我拍照，你来写！”呵呵，每次都是不了了之，这次 三亚 行是嘻嘻出生后的第一次长途旅行，所以出发前就持续心理建设：一定要记下来！
宋先森平时很忙，加上这两年怀孕生子，我们基本没有出过远门，7月底的某一天我俩头脑一热，临时决定趁着嘻嘻一周岁生日，出去浪一次~
一拍即合选定 三亚 ，因为我2017年初曾经跟小伙伴去过 三亚 ，两个妹子， 三亚 的景点基本都去了，加上这次带着刚满一岁的嘻嘻，加上宋先森也只是想轻松度个假，所以我们没有安排景点，就打算玩玩沙，趟趟水，吹吹海风~</H4>
        </span>
    </div>
    <div>
        <span>
            <H4>【交通】提前一嗨租车上订车，唯一不便是一嗨凤凰机场店不能直接在机场提车/还车，而是要在机场对面停车场乘坐摆渡车往返提车/还车点，不过好在距离都不远，尚可接受，服务也不错~
全程自驾，后面住 海棠湾 就很方便，想去哪里去哪里， 海棠湾 68美食街的餐厅基本都可以免费接送（针对 海棠湾 沿岸的酒店），如果没有租车，就打车，或者联系餐厅接送接好了~</H4>
        </span>
    </div>
    <div>
        <span>
            <H4>Day 1 在机场候机时买的一个小汽车 ，嘻嘻很喜欢，质感很好，车轮很滑，在候机母婴室一直玩这个，结果下飞机就找不到了，不知道掉哪里了。。。</H4>
        </span>
    </div>
    <div>
        <span>
            <img src="img/site/1.jpg">
        </span>
    </div>
    <div>
        <span>
            <H4>Day 2 下午在沙滩边玩，穿的新衣服，第一次穿，玩完换完衣服后把衣服落下了。。。又丢了，就是下图这件笑脸，宋先森选的。。。
（谁让你平时都没时间给娃买衣服的，久不久买一次就是这种结局，哈哈~）</H4>
        </span>
    </div>
    <div>
        <span>
            <img src="img/site/2.jpg">
        </span>
    </div>
    <div>
        <span>
            <H4>Day 3 今天上午嘻嘻把我的手机屏幕摔碎了。。。好吧，可能是想给妈妈换个手机
    今天午餐的时候宋先森接了个电话，回来一脸沉重：我明天要去一趟 北京 ，你是改签提前回去还是改签推迟回去等我来接你们？
    Day 4----Day7，都在紧张中度过，生怕每天再发生个啥
    Day 8 中午到达机场，恰逢暴雨，机场滞留了很多航班，所以我们华丽丽的晚点2.5小时。。。好在最后顺利回 成都</H4>
        </span>
    </div>




    <div style="clear:both"></div>

</div>





<




<%@include file="../include/footer.jsp" %>