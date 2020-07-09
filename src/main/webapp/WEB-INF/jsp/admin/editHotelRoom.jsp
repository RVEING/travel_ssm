<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../include/admin/adminHeader.jsp"%>
<%@include file="../include/admin/adminNavigator.jsp"%>

<title>编辑房间</title>

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
        <li><a href="admin_hotel_list">所有酒店</a></li>
        <li class="active">编辑房间</li>
    </ol>

    <div class="panel panel-warning editDiv">
        <div class="panel-heading">编辑房间</div>
        <div class="panel-body">
            <form method="post" id="editForm" action="admin_hotelRoom_update"  enctype="multipart/form-data">
                <table class="editTable">
                    <tr>
                        <td>房间名称</td>
                        <td><input  id="rname" name="rname" type="text" class="form-control" value="${r.rname}"></td>
                    </tr>
                    <tr>
                        <td>房间类型</td>
                        <td><input  id="bedType" name="bedType" type="text" class="form-control" value="${r.bedType}"></td>
                    </tr>
                    <tr>
                        <td>房间价格</td>
                        <td><input  id="price" name="price" type="text" class="form-control" value="${r.price}"></td>
                    </tr>
                    <tr>
                        <td>房间数量</td>
                        <td><input  id="number" name="number" type="text" class="form-control" value="${r.number}"></td>
                    </tr>
                    <tr>
                        <td>房间面积</td>
                        <td><input  id="area" name="area" type="text" class="form-control" value="${r.area}"></td>
                    </tr>
                    <tr>
                        <td>最多人数</td>
                        <td><input  id="peopleNum" name="peopleNum" type="text" class="form-control" value="${r.peopleNum}"></td>
                    </tr>
                    <tr>
                        <td>政策</td>
                        <td><input  id="policy" name="policy" type="text" class="form-control" value="${r.policy}"></td>
                    </tr>
                    <tr>
                        <td>有无窗户</td>
                        <td><input  id="window" name="window" type="text" class="form-control" value="${r.window}"></td>
                    </tr>
                    <tr>
                        <td>有无宽带</td>
                        <td><input  id="broadband" name="broadband" type="text" class="form-control" value="${r.broadband}"></td>
                    </tr>
                    <tr>
                        <td>有无早餐</td>
                        <td><input  id="breakfast" name="breakfast" type="text" class="form-control" value="${r.breakfast}"></td>
                    </tr>
                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <input type="hidden" name="id" value="${r.id}">
                            <button type="submit" class="btn btn-success">提 交</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>
