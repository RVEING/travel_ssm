<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../include/admin/adminHeader.jsp"%>
<%@include file="../include/admin/adminNavigator.jsp"%>

<title>编辑管理员</title>

<script>
    $(function(){

        $("#editForm").submit(function(){
            if(!checkEmpty("sname","景点名称"))
                return false;
            if(!checkNumber("price","景点价格"))
                return false;
            if(!checkInt("number","库存数量"))
                return false;
            return true;
        });
    });

</script>

<div class="workingArea">

    <ol class="breadcrumb">
        <li><a href="admin_spot_list">所有管理员</a></li>
        <li class="active">编辑属性</li>
    </ol>

    <div class="panel panel-warning editDiv">
        <div class="panel-heading">编辑属性</div>
        <div class="panel-body">
            <form method="post" id="editForm" action="admin_admin_update"  enctype="multipart/form-data">
                <table class="editTable">
                    <tr>
                        <td>管理员用户名</td>
                        <td><input  id="name" name="name" type="text" value="${a.name}" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>密码</td>
                        <td><input  id="password" name="password" type="text" value="${a.password}" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>邮箱</td>
                        <td><input  id="eamil" name="eamli" type="text" value="${a.email}" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>电话</td>
                        <td><input  id="mobile" name="mobile" type="text" value="${a.mobile}" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>性别</td>
                        <td><input  id="sex" name="sex" type="text" value="${a.sex}" class="form-control"></td>
                    </tr>
                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <input type="hidden" name="id" value="${a.id}">
                            <button type="submit" class="btn btn-success">提 交</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>
