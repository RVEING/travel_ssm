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
    <span class="spotTitle">海南环岛-错过的日出与夕阳</span>
    <span class="asd22"><button class="buyButton">喜欢</button></span>
</div>
<div class="imgAndInfo1">
    <div>
        <span>
            <H4>【背景】 转眼间，距上一次远行已经过去两年，但那时进藏的画面却时不时浮现在脑海中，一路的点滴、数不尽的美景、沿途的文化、一路遇到的人、经历的困难……
说实话这次出行其实是没有多少动力的，太远的地方时间不够，太近的地方又没有什么好的选择。

临行前看了看 海南 的天气，按照行程到的那几天有雨，这一下就惆怅了，然后赶紧翻出了以前的 大理 - 丽江 - 雨崩 路书当备选方案。心想着如果下雨就去 云南 算了，其实去 海南 、 云南 直飞简直不要方便太多，不仅机票便宜（相对自驾来说），更节约时间，可以留更多时间去游玩。

但是偏执的人却偏偏选择了既不经济也不实惠的自驾行。</H4>
        </span>
    </div>
    <div>
        <span>
            <H4>【路线图】
                从 湖南 到 海南 可选择的高速不多。
经过 广西 的：二广-包茂-沈海高速
经过 广东 的：二广-汕湛-沈海高速
两条路线差别不到100公里，为了不走重复线路，我选择了去时走 广西 ，回时走 广东 。
环岛选择了逆时针方向，先西线从 海口 一路玩到 三亚 ，再东线从 三亚 玩到 海口 。~</H4>
        </span>
    </div>
    <div>
        <span>
            <H4>Day 1 在机场候机时买的一个小汽车 ，嘻嘻很喜欢，质感很好，车轮很滑，在候机母婴室一直玩这个，结果下飞机就找不到了，不知道掉哪里了。。。</H4>
        </span>
    </div>
    <div>
        <span>
            <img src="img/site/3.jpeg">
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
            <img src="img/site/4.jpeg">
        </span>
    </div>
    <div>
        <span>
            <H4>既定周末出发，设置好早上7点的闹钟，早（lan）早（chuang）出（wan）门（qi）避免高速上的堵车。


第一天的路程是到达 广西 的 梧州 市，沿途经过二广-夏蓉-道贺-包茂高速到达 梧州 。全程高速，车辆很少，但是二广限速100实在是恼火，路面特别好，车辆还少，所以特别容易犯困。

在翻 越南 岭山脉开始进入 广西 境内后瞌睡已经完全散去了，随之而来的各种山路、弯道多了起来，而最明显的变化要数地貌了，山岭连绵、岭谷相间远看似乎来到了 桂林 ，虽然 桂林 此时距我们有近300km。夕阳在山岭间时隐时现，迟迟不肯落下，似怕落得太快无法照亮我们的前路，到达 梧州 的时候天已经黑了。然后住了此行性价比最高的一个酒店（龙湖广场附近），100多的价格，环境和条件都非常好（感觉有3-4星的样子），比之后住的都要好太多了。

第二天从 梧州 出发继续南下，今天路程只有470km，6个小时左右应该可以到达 海安 港，所以不用很早起来赶路。
广西 位于云贵高原东南边缘，地处两广丘陵西部，南临 北部湾 海面，整个地势自 西北 向东南倾斜，所以在离开 梧州 后走了几百公里的下坡山路和隧道，一个个隧道像无底洞一样，隧道内不断略过的路灯仿佛时光隧道一样令人迷幻，而沿途车辆依旧很少很少，也不知过了多久道路渐渐平缓起来，随之而来的温度明显感觉热起来了，打开车窗亚热带的风一阵阵扑面而来，似乎已经可以闻到海洋的味道。看着笔直的高速路一直伸向远方，想到路的尽头就是祖国大陆的最南端，我们也渐渐兴奋了起来，经过一个服务区的时候用自带的炉具煮了一碗方便面，吃了点水果补充能量，顺便把长裤外套统统换成了短袖短裤，整个人轻松舒爽了很多。</H4>
        </span>
    </div>




    <div style="clear:both"></div>

</div>





<




<%@include file="../include/footer.jsp" %>