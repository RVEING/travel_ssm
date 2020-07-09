<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../include/admin/adminHeader.jsp"%>
<%@include file="../include/admin/adminNavigator.jsp"%>

<title>编辑酒店属性</title>

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
        <li><a href="admin_spot_list">所有酒店</a></li>
        <li class="active">编辑酒店属性</li>
    </ol>

    <div class="panel panel-warning editDiv">
        <div class="panel-heading">编辑酒店属性</div>
        <div class="panel-body">
            <form method="post" id="editForm" action="admin_hotel_update"  enctype="multipart/form-data">
                <table class="editTable">
                    <tr>
                        <td>酒店名称</td>
                        <td><input  id="hname" name="hname" value="${h.hname}" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>酒店介绍</td>
                        <td><textarea id="summary" name="summary"  type="text" class="form-control" >${h.summary}</textarea></td>
                    </tr>
                    <tr>
                        <td>酒店位置</td>
                        <td><input  id="address" name="address" value="${h.address}" type="text" class="form-control"></td>
                    </tr>

                    <tr>
                        <td>电话</td>
                        <td><input  id="mobile" name="mobile" value="${h.mobile}" type="text" class="form-control"></td>
                    </tr>
                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <input type="hidden" name="id" value="${h.id}">
                            <button type="submit" class="btn btn-success">提 交</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>
