window.onload=function(){
	var ullist=document.querySelector(".ullist")//获取ul的元素节点
	var lilist=ullist.getElementsByTagName("li")//获取ul下面的所有li
	var emailph = document.querySelector(".emailph");
	var loginbtn = document.querySelector(".loginbtn");
	var pwd = document.querySelector(".pwd")
	var la1 = document.querySelector(".la1");
	var la2 = document.querySelector(".la2");
	var login=document.querySelector(".login")
	var nameflag=false
	var pwdflag=false
	//正则表达式 判断邮箱和手机号
	var reg = /[^\._-][\w\.-]+@(?:[A-Za-z0-9]+\.)+[A-Za-z]+$|^0\d{2,3}\d{7,8}$|^1[358]\d{9}$|^147\d{8}$/
	//正则表达 验证密码 6-16位
	var regpwd = /^[0-9a-zA-Z!@#$^]{6,16}$/;
	//手机号的正则表达式
	var ipong=/^[0-9]{11}$/
	//不能包含特殊符号的正则表达式
	var zcname=/^\w+$/
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
		
		var flag = false;
		// 得到input中的cass
		var btn = document.querySelector(".btn");
		var btn1 = document.querySelector(".btn1");
		var username = document.querySelector(".username");
		var userpwd = document.querySelector(".userpwd");
		var phonp = document.querySelector(".phonp");
		var yanzheng = document.querySelector(".yanzheng");
		//输入用户名时 btn的背景颜色改变
		username.onkeyup = function() {
			panduan()
		}
		//输入密码时 btn的背景颜色改变
		userpwd.onkeyup = function() {
			panduan()
		}
		//输入手机号 btn的背景颜色改变
		phonp.onkeyup = function() {
			panduan()
			var phonp1 = document.querySelector(".phonp").value;
			var phonpLength = phonp1.length;
			if (phonpLength==11) {
				$(".btn").removeAttr("disabled");
				$(".btn").css("background", "#697ed9");
			} else {
				$(".btn").attr("disabled", "disabled");
				$(".btn").css("background","rgba(0,0,0,0.2)")
				flag = true;
			}
		}
		//输入验证码时 btn背景颜色改变
		yanzheng.onkeyup = function() {
			panduan()
			
		}
		
		function panduan(){
			var username1 = document.querySelector(".username").value;
			var nameLength = username1.length;
			var userpwd1 = document.querySelector(".userpwd").value;
			var pwdLength = userpwd1.length;
			var phonp1 = document.querySelector(".phonp").value;
			var phonpLength = phonp1.length;
			var yanzheng1 = document.querySelector(".yanzheng").value;
			var btnLength = yanzheng1.length;
			if(nameLength > 0 && nameLength <= 5 && pwdLength > 0 && pwdLength <= 15 && phonpLength==11 && btnLength > 0 && btnLength <= 6){
				$(".btn1").removeAttr("disabled");
				$(".btn1").css("background", "#04eaf5");
				flag=true
			}else{
				$(".btn1").attr("disabled", "disabled");
				$(".btn1").css("background","rgba(0,0,0,0.3)")
			}
		}
		
		btn1.onclick = function() {
			var phonp=document.querySelector(".phonp").value
			var username=document.querySelector(".username")
			if(ipong.test(phonp)){
				if(zcname.test(username)){
					
				}else{
					alert("请输入正确的用户名")
				}
			}else{
				alert("请输入正确的手机号")
			}
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
			window.location.href="../index.html"
			return;
		} else {
			alert("登录失败");
		}
	}
	
}
