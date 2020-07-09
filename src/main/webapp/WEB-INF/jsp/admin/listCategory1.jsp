<%--
  Created by IntelliJ IDEA.
  User: 郑高勇
  Date: 2020/2/29
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../include/admin/adminHeader.jsp"%>
<%@include file="../include/admin/adminNavigator.jsp"%>

<script>
    $(function(){

        $("#addForm").submit(function(){
            if(!checkEmpty("name","分类名称"))
                return false;
            if(!checkEmpty("categoryPic","分类图片"))
                return false;
            return true;
        });
    });

</script>
<script>
    $(function(){

        $("#addForm").submit(function(){
            if(!checkEmpty("name","分类名称"))
                return false;
            if(!checkEmpty("categoryPic","分类图片"))
                return false;
            return true;
        });
    });

</script>

<title>游记管理</title>

<div class="workingArea">
    <h1 class="label label-info" >游记管理</h1>
    <br>
    <br>

    <div class="listDataTableDiv">
        <table class="table table-striped table-bordered table-hover  table-condensed">
            <thead>
            <tr class="success">
                <th>ID</th>
                <th>游记标题</th>
                <th>用户名</th>
                <th>发布时间</th>
                <th>删除</th>
            </tr>
            </thead>
            <tbody>
<%--            <c:forEach items="${cs}" var="c">--%>

                <tr>
                    <td>1</td>
                    <td>《三亚攻略》我们牵手旅行，环游海南岛《三亚攻略》</td>
                    <td>asd</td>
                    <td>2019-08-01</td>
                    <td><a deleteLink="true" href="admin_category_delete?id=${c.id}"><span class="   glyphicon glyphicon-trash"></span></a></td>

                </tr>
<tr>
    <td>1</td>
    <td>海南骑行 | 4天450KM</td>
    <td>asd</td>
    <td>2019-05-01</td>
    <td><a deleteLink="true" href="admin_category_delete?id=${c.id}"><span class="   glyphicon glyphicon-trash"></span></a></td>

</tr>
<tr>
    <td>1</td>
    <td>写信告诉你，今天海是什么颜色</td>
    <td>a456</td>
    <td>2019-09-21</td>
    <td><a deleteLink="true" href="admin_category_delete?id=${c.id}"><span class="   glyphicon glyphicon-trash"></span></a></td>

</tr>

<%--            </c:forEach>--%>
            </tbody>
        </table>
    </div>

    <div class="pageDiv">
        <%@include file="../include/admin/adminPage.jsp" %>
    </div>



</div>

<%@include file="../include/admin/adminFooter.jsp"%>