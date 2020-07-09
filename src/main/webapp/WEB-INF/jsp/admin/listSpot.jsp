<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../include/admin/adminHeader.jsp"%>
<%@include file="../include/admin/adminNavigator.jsp"%>

<script>
    $(function(){

        $("#addForm").submit(function(){
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


<title>景点管理</title>

<div class="workingArea">
    <h1 class="label label-info" >景点管理</h1>
    <br>
    <br>

    <div class="listDataTableDiv">
        <table class="table table-striped table-bordered table-hover  table-condensed">
            <thead>
            <tr class="success">
                <th>ID</th>
                <th>图片</th>
                <th>景点名称</th>
                <th>价格</th>
                <th>库存数量</th>
                <th>图片管理</th>
                <th>属性管理</th>
                <th>编辑</th>
                <th>删除</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${ss}" var="s">

                <tr>
                    <td>${s.id}</td>
                    <td>
                        <c:if test="${!empty s.firstScenicSpotImage}">
                            <img width="40px" src="img/scenicSpot/${s.firstScenicSpotImage.id}.jpg">
                        </c:if>
                    </td>
                    <td>${s.sname}</td>
                    <td>${s.price}</td>
                    <td>${s.number}</td>

                    <td><a href="admin_spotImage_list?sid=${s.id}"><span class="glyphicon glyphicon-picture"></span></a></td>
                    <td><a href="admin_spotProperty_edit?id=${s.id}"><span class="glyphicon glyphicon-th-list"></span></a></td>
                    <td><a href="admin_spot_edit?id=${s.id}"><span class="glyphicon glyphicon-edit"></span></a></td>
                    <td><a deleteLink="true" href="admin_spot_delete?id=${s.id}"><span class="   glyphicon glyphicon-trash"></span></a></td>

                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

    <div class="pageDiv">
        <%@include file="../include/admin/adminPage.jsp" %>
    </div>

    <div class="panel panel-warning addDiv">
        <div class="panel-heading">新增景点</div>
        <div class="panel-body">
            <form method="post" id="addForm" action="admin_spot_add" enctype="multipart/form-data">
                <table class="addTable">
                    <tr>
                        <td>景点名称</td>
                        <td><input  id="sname" name="sname" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>价格</td>
                        <td><input  id="price" name="price" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>库存数量</td>
                        <td><input  id="number" name="number" type="text" class="form-control"></td>
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