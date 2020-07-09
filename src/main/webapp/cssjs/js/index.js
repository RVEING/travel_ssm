//窗体加载的事件
window.onload=function(){
			var fhtext=document.querySelector(".fhtext")//获取“放回顶部”的元素节点
			var fhimg=document.querySelector(".fhimg")//获取黑色img图像的元素节点
			var lianxi=document.querySelector(".lianxi")//获取联系头像的元素节点
			var ullist=document.querySelector(".ullist")//获取ul的元素节点
			var lilist=ullist.getElementsByTagName("li")//获取ul下面的所有li
			var iframe=document.querySelector(".iframe")
//			var iframe_two=document.querySelector(".iframe_two")
//			var dzy=document.querySelector(".dzy")
			var emailph = document.querySelector(".emailph");
			var loginbtn = document.querySelector(".loginbtn");
			var pwd = document.querySelector(".pwd")
			var la1 = document.querySelector(".la1");
			var la2 = document.querySelector(".la2");
			var login=document.querySelector(".login")
			var nameflag=false
			var pwdflag=false
			var data;//定时器
			var flag=true;//接收判断
			//正则表达式 判断邮箱和手机号
			var reg = /[^\._-][\w\.-]+@(?:[A-Za-z0-9]+\.)+[A-Za-z]+$|^0\d{2,3}\d{7,8}$|^1[358]\d{9}$|^147\d{8}$/
			//正则表达 验证密码 6-16位
			var regpwd = /^[0-9a-zA-Z!@#$^]{6,16}$/;
//			iframe_two.height=document.documentElement.clientHeight;
//			dzy.onclick=function(){
//				iframe_two.style.display="block"
//				iframe.style.display="none"
//				var str="html/personal.html"
//				iframe.style.height="100px"
//				iframe.setAttribute("src","html/personal.html")
//			}
			//放回顶部的点击事件
			fhtext.onclick=function(){
				 fhtop()
			}
			//黑色img图像的点击事件
			fhimg.onclick=function(){
				 fhtop()
			}
			//黑色img图像的鼠标移上事件
		fhimg.onmousemove=function(){
			fhtext.innerHTML="返回顶部"//fhtext的值变换为“返回顶部”
			fhtext.style.opacity="1"//给个显示透明度
			fhtext.style.transform="translateY(-90px)"//想上移动到90px位置
		}
		//黑色img图像的鼠标移开事件
		fhimg.onmouseout=function(){
			fhtext.style.opacity="0"//透明度为0，使之透明
			fhtext.style.transform="translateY(0px)"//移动到Y轴0px的位置
		}
		//联系头像的鼠标移上事件
		lianxi.onmousemove=function(){
			fhtext.innerHTML="联系客服"//fhtext的值变换为“联系客服”
			fhtext.style.opacity="1"//给个显示透明度
			fhtext.style.transform="translateY(-90px)"//想上移动到90px位置
		}
		//联系头像的鼠标移开事件
		lianxi.onmouseout=function(){
			fhtext.style.opacity="0"//透明度为0，使之透明
			fhtext.style.transform="translateY(0px)"//移动到Y轴0px的位置
		}
		//给li添加鼠标移上移下的事件
		for(var i = 0; i < lilist.length; i++) {
			(function(index) {
				lilist[index].onmousemove = function() {
					for(var i = 0; i < lilist.length; i++) {
						lilist[i].removeAttribute("class")
					}
					lilist[index].setAttribute("class", "addclass")
				}
				lilist[index].onmouseover = function() {
					lilist[index].removeAttribute("class")
				}
			})(i)
		}
	//窗体滚动的事件
	window.onscroll=function(){
		var dtop=document.querySelector(".dtop")//获取整个回到顶部的DIV
			var clientHeight = document.documentElement.clientHeight//获取网页课件高度
			var scoltop=document.body.scrollTop//获取滚动条对上的距离
			//判断 如果滚动条比可见高度高  返回顶部按钮就出现，否则就隐藏
		if(scoltop>=clientHeight){
			dtop.style.display="block"
		}else{
			dtop.style.display="none"
		}
		//如果flag为假 就清除定时器
		if(!flag){
			clearInterval(data);
		}
		//并且把flag变换为false
		flag=false
	}
	//动态回到顶部的方法
	function fhtop(){
		//定义一个定时器  没45秒执行一次
		data=setInterval(function(){
			//得到滚动条对顶部的高度
			var scoltop = document.body.scrollTop;
			//等到一个回滚的速度值
            var speed = Math.floor(-scoltop / 6);
            //对顶上的距离开始赋值移动
            document.documentElement.scrollTop = document.body.scrollTop = scoltop + speed;
            //flag变换成真来执行定时器
            flag =true;
            //如果到达了顶部
            if(scoltop == 0){
            	//清除定时器
                clearInterval(data);
            }
		},45)
	}
	
	//关闭按钮的清除表单数据和隐藏显示表单事件
	$(function() {
			$(".login").click(function() {
				$(".login_box").toggle();
			})
			$(".tuichu").click(function() {
				if(emailph.value!="" ||pwd.value!=""){
					emailph.value=""
					pwd.value=""
					la2.innerHTML=""
					la1.innerHTML=""
					$(".login_box").hide();
				}else{
					la1.innerHTML=""
					la2.innerHTML=""
					$(".login_box").hide();
				}
			})
			
			$(".lanren ul li").hover(function() {
			$(this).find(".txt").stop().animate({
				height: "250px"
			}, 400);
			$(this).find(".txt h3").stop().animate({
				paddingTop: "60px"
			}, 400);
			}, function() {
			$(this).find(".txt").stop().animate({
				height: "45px"
			}, 400);
			$(this).find(".txt h3").stop().animate({
				paddingTop: "0px"
			}, 400);
		})
			
			
		})
	//文本框鼠标失去焦点执行的方法
	emailph.onblur = function() {
		if (emailph.value == "") {
			la1.innerHTML = "<font style='color: #FF4C4C;'>不能为空</font>";
			return;
		} else {
			if (reg.test(emailph.value)) {
				la1.innerHTML = "<font style='color: #12a206;'>√</font>";
				nameflag=true
			} else {
				la1.innerHTML = "<font style='color: #FF4C4C;'>输入错误</font>";
				return;
			}
		}
	}
	//密码框鼠标失去焦点执行的方法
	pwd.onblur = function() {
		if (pwd.value == "") {
			la2.innerHTML = "<font style='color: #FF4C4C; '>不能为空</font>";
			return;
		} else {
			if (regpwd.test(pwd.value)) {
				la2.innerHTML = "<font style='color: #12a206;'>√</font>";
				pwdflag=true
			} else {
				la2.innerHTML = "<font style='color: #FF4C4C;'>输入错误</font>";
				return;
			}
		}
	}
	//登录按钮判断登录是否成功的事件
	loginbtn.onclick = function() {
		if (nameflag == true && pwdflag == true) {
			alert("登录成功");
			nameflag=false
			pwdflag=false
			window.location.href="index.html"
			return;
		} else {
			alert("登录失败");
		}
	}
	
	
	var moban = document.querySelectorAll(".moban");
	var lispic = document.querySelectorAll(".lispic");
	//用循环闭包的方式得到当前的元素
	for(var i=0;i<=lispic.length;i++){
		(function(index){
			//当前的图片元素的鼠标移上后的方法
			lispic[index].onmousemove=function(){
				//显示当前蒙版
				moban[index].style.display="block"
			}
			//当前的图片元素的鼠标移开后的方法
			lispic[index].onmouseleave=function(){
				//隐藏当前蒙版
				moban[index].style.display = "none";
			}
		})(i)
	}
}