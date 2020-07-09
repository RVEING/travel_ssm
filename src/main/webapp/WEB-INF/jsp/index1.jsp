<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<head>
    <title>海南自助旅游平台</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="https://how2j.cn/study/js/jquery/2.0.0/jquery.min.js"></script>
    <link href="https://how2j.cn/study/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="https://how2j.cn/study/js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/index/yui-reset.css">
    <link rel="stylesheet" href="css/index/index.css">
    <link rel="stylesheet" href="css/index/base.css">
</head>

<%@include file="include/top2.jsp" %>


<style>
    div.categoryWithCarousel{
        width: 100%;
        position:relative;
    }
    div.categoryWithCarousel div.headbar{
        background-color: #DD2727;
    }
    div.categoryWithCarousel div.head{
        width: 200px;
        background-color: #C60A0A;
        height: 36px;
        line-height: 36px;
        font-size: 16px;
        font-weight: bold;
        color: white;
        margin-left: 20px;
        display: inline-block;
    }
    div.categoryWithCarousel div.rightMenu{
        display: inline-block;
    }
    div.categoryWithCarousel div.rightMenu a{
        font-size: 16px;
        color: white;
        text-decoration:none;
    }
    div.categoryWithCarousel div.rightMenu span{
        margin: 0px 20px 0px 20px;
    }
    div.categoryWithCarousel div.rightMenu img{
        height: 30px;
    }
    div.carousel-of-product{
        height: 510px;
        width:1024px;
        margin:0px auto;
    }
    img.carouselImage{
        height: 510px !important;
    }
    div.carouselBackgroundDiv{
        width:100%;
        height:510px;
        background-color:#E8E8E8;
        position:absolute;
        top:36px;
        z-index:-1;
    }

</style>

<div class="buyTop" align="center">
    <img src="img/site/kongbai.png">
    <div style="clear:both"></div>
</div>






<div class="content">

    <div class="right_part">
        <div class="hd">
            <div class="left">
                <h4>游记</h4>

            </div>

        </div>


            <div class="grid">
                <div class="rect"></div>

                <div class="tu">
                    <a href="fore3">
                        <img width="253px" height="153px" src="img/scenicSpot/36.jpg" alt="1">
                    </a>
                </div>
                <div class="wen">

                    <h4>
                        <a href="fore3">
                            三亚，以梦为马，趁诗酒年华
                        </a>
                    </h4>
                    <p class="brief">
                        <a href="fore3">每次出去玩回来说写游记，宋先森都是“好呀好呀，我拍照，你来写！”呵呵，每次都是不了了之，这次 三亚 行是嘻嘻出生后的第一次长途旅行，所以出发前就持续心理建设：一定要记下来！
                            宋先森平时很忙，加上这两年怀孕生子，我们基本没有出过远门，7月底的某一天我俩头脑一热，临时决定趁着嘻嘻一周岁生日，出去浪一次~</a>
                    </p>

                </div>
            </div>
        <div class="grid">
            <div class="rect"></div>

            <div class="tu">
                <a href="fore4">
                    <img width="253px" height="153px" src="img/scenicSpot/37.jpg" alt="1">
                </a>
            </div>
            <div class="wen">

                <h4>
                    <a href="fore4">
                        海南环岛-错过的日出与夕阳
                    </a>
                </h4>
                <p class="brief">
                    <a href="fore4">【背景】 转眼间，距上一次远行已经过去两年，但那时进藏的画面却时不时浮现在脑海中，一路的点滴、数不尽的美景、沿途的文化、一路遇到的人、经历的困难……
                        说实话这次出行其实是没有多少动力的，太远的地方时间不够，太近的地方又没有什么好的选择。</a>
                </p>

            </div>
        </div>
        <div class="grid">
            <div class="rect"></div>

            <div class="tu">
                <a href="fore3">
                    <img width="253px" height="153px" src="img/scenicSpot/38.jpg" alt="1">
                </a>
            </div>
            <div class="wen">

                <h4>
                    <a href="fore3">
                        一别数年的国境之南
                    </a>
                </h4>
                <p class="brief">
                    <a href="fore3">海南 对于我，
                        有着略复杂的感情，
                        像一个认识多年的姑娘，
                        你看着她，
                        从淳朴走向妖娆。
                        当然她肯定是美丽的，
                        或者说是美好的，
                        但你见过她柴火妞的样子，
                        所以后来即使她傍上了大款，
                        一身名牌香气逼人，
                        你也很难有太多的艳羡之心。</a>
                </p>

            </div>
        </div>
        <div class="grid">
            <div class="rect"></div>

            <div class="tu">
                <a href="fore3">
                    <img width="253px" height="153px" src="img/scenicSpot/40.jpg" alt="1">
                </a>
            </div>
            <div class="wen">

                <h4>
                    <a href="fore3">
                        说走就走的海南之旅，
                    </a>
                </h4>
                <p class="brief">
                    <a href="fore3}">看个朋友圈的时间决定一次出行，难得这样随心所欲，说走就走……
                        想着现在是没有寒暑假的人，月底必须修完的年假，还是出去走走吧。。。没有想要去太遥远的地方，便寻思着就近有没有想去的地方，翻看朋友圈的功夫有个小伙伴约我去 琼中 做志愿者，想都没想就答应了：嗯，就这样，去 海南 ！！</a>
                </p>

            </div>
        </div>

    </div>
</div>

