//JS窗体加载的事件
//window.onload=function(){
	//获取到所有图片元素和所有蒙版元素
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
//}
//jquery窗体加载事件
//$(function(){
	//获取li执行鼠标上移后蒙版窗口的动画效果
	$(".lanren ul li").hover(function() {
		alert(1)
			$(this).find(".txt").stop().animate({
				height: "198px"
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
//})