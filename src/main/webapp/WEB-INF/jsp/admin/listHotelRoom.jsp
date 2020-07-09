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


<title>酒店房间管理</title>

<div class="workingArea">
    <h1 class="label label-info" >酒店房间管理</h1>
    <br>
    <br>

    <div class="listDataTableDiv">
        <table class="table table-striped table-bordered table-hover  table-condensed">
            <thead>
            <tr class="success">
                <th>ID</th>
                <th>图片</th>
                <th>房间名称</th>
                <th>房间类型</th>
                <th>房间价格</th>
                <th>图片管理</th>
                <th>属性管理</th>
                <th>删除</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${rs}" var="r">

                <tr>
                    <td>${r.id}</td>
                    <td>
                        <c:if test="${!empty r.firstHotelRoomImage}">
                            <img width="40px" src="img/HotelRoom/${r.firstHotelRoomImage.id}.jpg">
                        </c:if>
                    </td>
                    <td>${r.rname}</td>
                    <td>${r.bedType}</td>
                    <td>${r.price}</td>

                    <td><a href="admin_hotelRoomImage_list?rid=${r.id}"><span class="glyphicon glyphicon-picture"></span></a></td>
                    <td><a href="admin_hotelRoom_edit?id=${r.id}"><span class="glyphicon glyphicon-th-list"></span></a></td>
                    <td><a deleteLink="true" href="admin_hotelRoom_delete?id=${r.id}"><span class="   glyphicon glyphicon-trash"></span></a></td>

                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

    <div class="pageDiv">
        <%@include file="../include/admin/adminPage.jsp" %>
    </div>

    <div class="panel panel-warning addDiv">
        <div class="panel-heading">新增房间</div>
        <div class="panel-body">
            <form method="post" id="addForm" action="admin_hotelRoom_add" enctype="multipart/form-data">
                <table class="addTable">
                    <tr>
                        <td>房间名称</td>
                        <td><input  id="rname" name="rname" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>房间类型</td>
                        <td><input  id="bedType" name="bedType" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>房间价格</td>
                        <td><input  id="price" name="price" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>房间数量</td>
                        <td><input  id="number" name="number" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>房间面积</td>
                        <td><input  id="area" name="area" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>最多人数</td>
                        <td><input  id="peopleNum" name="peopleNum" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>政策</td>
                        <td><input  id="policy" name="policy" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>有无窗户</td>
                        <td><input  id="window" name="window" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>有无宽带</td>
                        <td><input  id="broadband" name="broadband" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>有无早餐</td>
                        <td><input  id="breakfast" name="breakfast" type="text" class="form-control"></td>
                    </tr>
                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <input type="hidden" name="hid" value="${h.id}">
                            <button type="submit" class="btn btn-success">提 交</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>

</div>

<%@include file="../include/admin/adminFooter.jsp"%>