<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../include/admin/adminHeader.jsp"%>
<%@include file="../include/admin/adminNavigator.jsp"%>

<script>
</script>

<title>管理员管理</title>

<div class="workingArea">
    <h1 class="label label-info" >管理员管理</h1>

    <br>
    <br>

    <div class="listDataTableDiv">
        <table class="table table-striped table-bordered table-hover  table-condensed">
            <thead>
            <tr class="success">
                <th>ID</th>
                <th>管理员用户名</th>
                <th>邮箱</th>
                <th>电话</th>
                <th>性别</th>
                <th>属性管理</th>
                <th>删除</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${as}" var="a">
                <tr>
                    <td>${a.id}</td>
                    <td>${a.name}</td>
                    <td>${a.email}</td>
                    <td>${a.mobile}</td>
                    <td>${a.sex}</td>
                    <td><a href="admin_adminProperty_edit?id=${a.id}"><span class="glyphicon glyphicon-th-list"></span></a></td>
                    <td><a deleteLink="true" href="admin_admin_delete?id=${a.id}"><span class="   glyphicon glyphicon-trash"></span></a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

    <div class="pageDiv">
        <%@include file="../include/admin/adminPage.jsp" %>
    </div>

    <div class="panel panel-warning addDiv">
        <div class="panel-heading">新增管理员</div>
        <div class="panel-body">
            <form method="post" id="addForm" action="admin_admin_add" enctype="multipart/form-data">
                <table class="addTable">
                    <tr>
                        <td>管理员用户名</td>
                        <td><input  id="name" name="name" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>密码</td>
                        <td><input  id="password" name="password" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>邮箱</td>
                        <td><input  id="eamil" name="eamli" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>电话</td>
                        <td><input  id="mobile" name="mobile" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>性别</td>
                        <td><input  id="sex" name="sex" type="text" class="form-control"></td>
                    </tr>
                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <button type="submit" class="btn btn-success">提 交</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>

<%@include file="../include/admin/adminFooter.jsp"%>
