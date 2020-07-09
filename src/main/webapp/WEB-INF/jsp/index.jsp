<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<head>
    <title>去吧</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="https://how2j.cn/study/js/jquery/2.0.0/jquery.min.js"></script>
    <link href="https://how2j.cn/study/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="https://how2j.cn/study/js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/index/yui-reset.css">
    <link rel="stylesheet" href="css/index/index.css">
    <link rel="stylesheet" href="css/index/base.css">
</head>

<%@include file="include/top.jsp" %>
<%@include file="include/search.jsp" %>

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


<div class="categoryWithCarousel">

    <div data-ride="carousel" class="carousel-of-product carousel slide" id="carousel-of-product">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li class="active" data-slide-to="0" data-target="#carousel-of-product"></li>
            <li data-slide-to="1" data-target="#carousel-of-product" class=""></li>
            <li data-slide-to="2" data-target="#carousel-of-product" class=""></li>
            <li data-slide-to="3" data-target="#carousel-of-product" class=""></li>
        </ol>
        <!-- Wrapper for slides -->
        <div role="listbox" class="carousel-inner">
            <div class="item active">
                <img src="img/lunbo/11.png" class="carousel carouselImage">
            </div>
            <div class="item">
                <img src="img/lunbo/22.png" class="carouselImage">
            </div>
            <div class="item">
                <img src="img/lunbo/33.png" class="carouselImage">
            </div>
            <div class="item">
                <img src="img/lunbo/44.png" class="carouselImage">
            </div>
        </div>
    </div>
    <div class="carouselBackgroundDiv">
    </div>
</div>

<div class="cb h20"></div>

<div class="content">
    <div class="left_part">
        <div class="tip">
            <a href="">出境游知识安全提示</a>
        </div>

        <div class="grid">
            <div class="hd">
                <h3>推荐酒店</h3>
                <span class="right_span">
						<a href="fore1">查看所有</a>
					</span>
            </div>
            <div class="bd carousel">
                <a href="foreHotel?hid=1"><img src="img/Hotel_middle/7.jpg"></a>
            </div>
            <div class="words">
                <span class="hotel1" >
                    <h4 class="">
                        <a href="foreHotel?hid=1">三亚亚特兰蒂斯</a>
                    </h4>
                </span>
                <span class="hotel2" ><h4>￥<fmt:formatNumber type="number" value="1652" minFractionDigits="2"/></h4></span>
            </div>
            <div class="bd carousel">
                <a href=""><img src="img/Hotel_middle/8.jpg"></a>
            </div>
            <div class="words">
                <span class="hotel1" >
                    <h4 class="">
                        <a href="foreScenicSpot?sid=10000000">三亚君然温泉度假酒店</a>
                    </h4>
                </span>
                <span class="hotel2" ><h4>￥<fmt:formatNumber type="number" value="178" minFractionDigits="2"/></h4></span>
            </div>
            <div class="bd carousel">
                <a href=""><img src="img/Hotel_middle/9.jpg"></a>
            </div>
            <div class="words">
                <span class="hotel1" >
                    <h4 class="">
                        <a href="foreScenicSpot?sid=10000000">三亚夏威夷大酒店</a>
                    </h4>
                </span>
                <span class="hotel2" ><h4>￥<fmt:formatNumber type="number" value="99" minFractionDigits="2"/></h4></span>
            </div>
        </div>

    </div>
    <div class="right_part">
        <div class="hd">
            <div class="left">
                <h4>推荐景点</h4>

            </div>

        </div>

    <c:forEach items="${recomends}" var="recomend">
        <div class="grid">
            <div class="rect"></div>

            <div class="tu">
                <a href="foreScenicSpot?sid=${recomend.id}">
                    <img src="img/site/123.png" alt="1">
                </a>
            </div>
            <div class="wen">
                <h4>
                    <a href="">
                        ${recomend.sname}
                    </a>
                </h4>
                <p class="brief">
                    <a href="">${recomend.summary}</a>
                </p>

            </div>
        </div>
    </c:forEach>
        <div class="grid">
            <div class="rect"></div>

            <div class="tu">
                <a href="">
                    <img src="http://p3-q.mafengwo.net/s14/M00/37/08/wKgE2lz4_A2AXcTfACCeVaXcMOQ119.jpg?imageMogr2%2Fthumbnail%2F%21220x150r%2Fstrip%2Fgravity%2FCenter%2Fcrop%2F%21220x150%2Fquality%2F90" alt="">
                </a>
            </div>
            <div class="wen">
                <h4>
                    <a href="">
                        标题2
                    </a>
                </h4>
                <p class="brief">
                    <a href="">沉船、海底花园、冲浪、跳岛、渔猎、夜潜、马荣火山、帐篷露营、洪门（天地会）、寻麻疹、 云顶 世界赌场、睡机场厕所.... 出行前 一个不寻常的路线，不要问我为什么这样制定，我也不知道.. ...</a>
                </p>
                <div class="bottom">
                    <div class="l_b">
                        <b class="icon_pos"></b>

                        <a href="" class="a_pos">济州岛</a>
                        ，&nbsp;&nbsp;by
                        <b class="icon_avatar">
                            <img src="http://p2-q.mafengwo.net/s10/M00/0D/8D/wKgBZ1iKzNyAOFDyAAB2b28YfuA17.jpeg?imageMogr2%2Fthumbnail%2F%2116x16r%2Fgravity%2FCenter%2Fcrop%2F%2116x16%2Fquality%2F90" alt="">
                        </b>
                        <a href="" class="a_name">小海参&nbsp;&nbsp;</a>
                        <b class="icon_eye"></b>
                        1726/33
                    </div>
                    <div class="r_b">
                        85
                        <b class="icon_ding"></b>
                    </div>
                </div>
            </div>
        </div>


        <div class="grid">
            <div class="rect"></div>

            <div class="tu">
                <a href="">
                    <img src="http://p3-q.mafengwo.net/s14/M00/37/08/wKgE2lz4_A2AXcTfACCeVaXcMOQ119.jpg?imageMogr2%2Fthumbnail%2F%21220x150r%2Fstrip%2Fgravity%2FCenter%2Fcrop%2F%21220x150%2Fquality%2F90" alt="">
                </a>
            </div>
            <div class="wen">
                <h4>
                    <a href="">
                        标题标题标题标题标题标题标题标题标题
                    </a>
                </h4>
                <p class="brief">
                    <a href="">沉船、海底花园、冲浪、跳岛、渔猎、夜潜、马荣火山、帐篷露营、洪门（天地会）、寻麻疹、 云顶 世界赌场、睡机场厕所.... 出行前 一个不寻常的路线，不要问我为什么这样制定，我也不知道.. ...</a>
                </p>
                <div class="bottom">
                    <div class="l_b">
                        <b class="icon_pos"></b>

                        <a href="" class="a_pos">济州岛</a>
                        ，&nbsp;&nbsp;by
                        <b class="icon_avatar">
                            <img src="http://p2-q.mafengwo.net/s10/M00/0D/8D/wKgBZ1iKzNyAOFDyAAB2b28YfuA17.jpeg?imageMogr2%2Fthumbnail%2F%2116x16r%2Fgravity%2FCenter%2Fcrop%2F%2116x16%2Fquality%2F90" alt="">
                        </b>
                        <a href="" class="a_name">小海参&nbsp;&nbsp;</a>
                        <b class="icon_eye"></b>
                        1726/33
                    </div>
                    <div class="r_b">
                        85
                        <b class="icon_ding"></b>
                    </div>
                </div>
            </div>
        </div>

        <div class="grid">
            <div class="rect"></div>

            <div class="tu">
                <a href="">
                    <img src="http://p3-q.mafengwo.net/s14/M00/37/08/wKgE2lz4_A2AXcTfACCeVaXcMOQ119.jpg?imageMogr2%2Fthumbnail%2F%21220x150r%2Fstrip%2Fgravity%2FCenter%2Fcrop%2F%21220x150%2Fquality%2F90" alt="">
                </a>
            </div>
            <div class="wen">
                <h4>
                    <a href="">
                        标题标题标题标题标题标题标题标题标题
                    </a>
                </h4>
                <p class="brief">
                    <a href="">沉船、海底花园、冲浪、跳岛、渔猎、夜潜、马荣火山、帐篷露营、洪门（天地会）、寻麻疹、 云顶 世界赌场、睡机场厕所.... 出行前 一个不寻常的路线，不要问我为什么这样制定，我也不知道.. ...</a>
                </p>
                <div class="bottom">
                    <div class="l_b">
                        <b class="icon_pos"></b>

                        <a href="" class="a_pos">济州岛</a>
                        ，&nbsp;&nbsp;by
                        <b class="icon_avatar">
                            <img src="http://p2-q.mafengwo.net/s10/M00/0D/8D/wKgBZ1iKzNyAOFDyAAB2b28YfuA17.jpeg?imageMogr2%2Fthumbnail%2F%2116x16r%2Fgravity%2FCenter%2Fcrop%2F%2116x16%2Fquality%2F90" alt="">
                        </b>
                        <a href="" class="a_name">小海参&nbsp;&nbsp;</a>
                        <b class="icon_eye"></b>
                        1726/33
                    </div>
                    <div class="r_b">
                        85
                        <b class="icon_ding"></b>
                    </div>
                </div>
            </div>
        </div>

        <div class="grid">
            <div class="rect"></div>

            <div class="tu">
                <a href="">
                    <img src="http://p3-q.mafengwo.net/s14/M00/37/08/wKgE2lz4_A2AXcTfACCeVaXcMOQ119.jpg?imageMogr2%2Fthumbnail%2F%21220x150r%2Fstrip%2Fgravity%2FCenter%2Fcrop%2F%21220x150%2Fquality%2F90" alt="">
                </a>
            </div>
            <div class="wen">
                <h4>
                    <a href="">
                        标题标题标题标题标题标题标题标题标题
                    </a>
                </h4>
                <p class="brief">
                    <a href="">沉船、海底花园、冲浪、跳岛、渔猎、夜潜、马荣火山、帐篷露营、洪门（天地会）、寻麻疹、 云顶 世界赌场、睡机场厕所.... 出行前 一个不寻常的路线，不要问我为什么这样制定，我也不知道.. ...</a>
                </p>
                <div class="bottom">
                    <div class="l_b">
                        <b class="icon_pos"></b>

                        <a href="" class="a_pos">济州岛</a>
                        ，&nbsp;&nbsp;by
                        <b class="icon_avatar">
                            <img src="http://p2-q.mafengwo.net/s10/M00/0D/8D/wKgBZ1iKzNyAOFDyAAB2b28YfuA17.jpeg?imageMogr2%2Fthumbnail%2F%2116x16r%2Fgravity%2FCenter%2Fcrop%2F%2116x16%2Fquality%2F90" alt="">
                        </b>
                        <a href="" class="a_name">小海参&nbsp;&nbsp;</a>
                        <b class="icon_eye"></b>
                        1726/33
                    </div>
                    <div class="r_b">
                        85
                        <b class="icon_ding"></b>
                    </div>
                </div>
            </div>
        </div>

        <div class="grid">
            <div class="rect"></div>

            <div class="tu">
                <a href="">
                    <img src="http://p3-q.mafengwo.net/s14/M00/37/08/wKgE2lz4_A2AXcTfACCeVaXcMOQ119.jpg?imageMogr2%2Fthumbnail%2F%21220x150r%2Fstrip%2Fgravity%2FCenter%2Fcrop%2F%21220x150%2Fquality%2F90" alt="">
                </a>
            </div>
            <div class="wen">
                <h4>
                    <a href="">
                        标题标题标题标题标题标题标题标题标题
                    </a>
                </h4>
                <p class="brief">
                    <a href="">沉船、海底花园、冲浪、跳岛、渔猎、夜潜、马荣火山、帐篷露营、洪门（天地会）、寻麻疹、 云顶 世界赌场、睡机场厕所.... 出行前 一个不寻常的路线，不要问我为什么这样制定，我也不知道.. ...</a>
                </p>
                <div class="bottom">
                    <div class="l_b">
                        <b class="icon_pos"></b>

                        <a href="" class="a_pos">济州岛</a>
                        ，&nbsp;&nbsp;by
                        <b class="icon_avatar">
                            <img src="http://p2-q.mafengwo.net/s10/M00/0D/8D/wKgBZ1iKzNyAOFDyAAB2b28YfuA17.jpeg?imageMogr2%2Fthumbnail%2F%2116x16r%2Fgravity%2FCenter%2Fcrop%2F%2116x16%2Fquality%2F90" alt="">
                        </b>
                        <a href="" class="a_name">小海参&nbsp;&nbsp;</a>
                        <b class="icon_eye"></b>
                        1726/33
                    </div>
                    <div class="r_b">
                        85
                        <b class="icon_ding"></b>
                    </div>
                </div>
            </div>
        </div>



    </div>
</div>

