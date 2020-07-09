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


<title>酒店管理</title>

<div class="workingArea">
    <h1 class="label label-info" >酒店管理</h1>
    <br>
    <br>

    <div class="listDataTableDiv">
        <table class="table table-striped table-bordered table-hover  table-condensed">
            <thead>
            <tr class="success">
                <th>ID</th>
                <th>图片</th>
                <th>酒店名称</th>
                <th>房间管理</th>
                <th>图片管理</th>
                <th>属性管理</th>
                <th>删除</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${hs}" var="h">

                <tr>
                    <td>${h.id}</td>
                    <td>
                        <c:if test="${!empty h.firstHotelImage}">
                            <img width="40px" src="img/Hotel/${h.firstHotelImage.id}.jpg">
                        </c:if>
                    </td>
                    <td>${h.hname}</td>

                    <td><a href="admin_hotelRoom_list?hid=${h.id}"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>
                    <td><a href="admin_hotelImage_list?hid=${h.id}"><span class="glyphicon glyphicon-picture"></span></a></td>
                    <td><a href="admin_hotelProperty_edit?id=${h.id}"><span class="glyphicon glyphicon-th-list"></span></a></td>
                    <td><a deleteLink="true" href="admin_hotel_delete?id=${h.id}"><span class="   glyphicon glyphicon-trash"></span></a></td>

                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

    <div class="pageDiv">
        <%@include file="../include/admin/adminPage.jsp" %>
    </div>

    <div class="panel panel-warning addDiv">
        <div class="panel-heading">新增酒店</div>
        <div class="panel-body">
            <form method="post" id="addForm" action="admin_hotel_add" enctype="multipart/form-data">
                <table class="addTable">
                    <tr>
                        <td>酒店名称</td>
                        <td><input  id="hname" name="hname" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>酒店介绍</td>
                        <td><input  id="summary" name="summary" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>酒店位置</td>
                        <td><input  id="address" name="address" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>酒店电话</td>
                        <td><input  id="mobile" name="mobile" type="text" class="form-control"></td>
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