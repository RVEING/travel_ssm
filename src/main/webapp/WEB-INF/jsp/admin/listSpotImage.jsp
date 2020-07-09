<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../include/admin/adminHeader.jsp"%>
<%@include file="../include/admin/adminNavigator.jsp"%>

<script>
    $(function(){
        $(".addFormSingle").submit(function(){
            if(checkEmpty("filepathSingle","图片文件")){
                $("#filepathSingle").value("");
                return true;
            }
            return false;
        });
        $(".addFormDetail").submit(function(){
            if(checkEmpty("filepathDetail","图片文件"))
                return true;
            return false;
        });
    });

</script>

<title>景点图片管理</title>

<div class="workingArea">
    <ol class="breadcrumb">
        <li><a href="admin_spot_list">所有景点</a></li>
        <li class="active">${s.sname}</li>
        <li class="active">景点图片管理</li>
    </ol>

    <table class="addPictureTable" align="center">
        <tr>
            <td class="addPictureTableTD">
                <div>
                    <div class="panel panel-warning addPictureDiv">
                        <div class="panel-heading">新增景点<b class="text-primary"> 单个 </b>图片</div>
                        <div class="panel-body">
                            <form method="post" class="addFormSingle" action="admin_spotImage_add" enctype="multipart/form-data">
                                <table class="addTable">
                                    <tr>
                                        <td>请选择本地图片 尺寸400X400 为佳</td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input id="filepathSingle" type="file" name="image" />
                                        </td>
                                    </tr>
                                    <tr class="submitTR">
                                        <td align="center">
                                            <input type="hidden" name="scenic_spot_id" value="${s.id}" />
                                            <button type="submit" class="btn btn-success">提 交</button>
                                        </td>
                                    </tr>
                                </table>
                            </form>
                        </div>
                    </div>
                    <table class="table table-striped table-bordered table-hover  table-condensed">
                        <thead>
                        <tr class="success">
                            <th>ID</th>
                            <th>景点单个图片缩略图</th>
                            <th>删除</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${spotSingle}" var="si">
                            <tr>
                                <td>${si.id}</td>
                                <td>
                                    <a title="点击查看原图" href="img/scenicSpot/${si.id}.jpg"><img height="50px" src="img/scenicSpot/${si.id}.jpg"></a>
                                </td>
                                <td><a deleteLink="true"
                                       href="admin_spotImage_delete?id=${si.id}"><span
                                        class="     glyphicon glyphicon-trash"></span></a></td>

                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>

                </div>
            </td>
        </tr>
    </table>

</div>

<%@include file="../include/admin/adminFooter.jsp"%>