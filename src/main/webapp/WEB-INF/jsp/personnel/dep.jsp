<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/6/006
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
    <script type="text/javascript" src="${ctx}/js/personnel/js/dep.js"></script>
</head>
<body>
<div class="layui-row layui-form">
    <div class="layui-col-xs3">
        <div class="grid-demo">
            <div class="layui-form-item">
                <label class="layui-form-label">部门名称</label>
                <div class="layui-input-block">
                    <input type="text" name="dname"
                           placeholder="请输入部门名称"	autocomplete="off" class="layui-input" >
                </div>
            </div>

        </div>
    </div>
    <div class="layui-col-xs3">
        <div class="grid-demo grid-demo-bg1">
            <div class="layui-form-item">
                <label class="layui-form-label">部门电话</label>
                <div class="layui-input-block">
                    <input type="text" name="tel"
                           placeholder="请输入部门电话"		autocomplete="off" class="layui-input" >
                </div>
            </div>
        </div>
    </div>
    <div class="layui-col-xs3">
        <div class="grid-demo">
            &nbsp;&nbsp;&nbsp;
            <button
                    class="layui-btn  layui-btn-normal layui-icon  layui-icon-search"
                    lay-filter="query" lay-submit>查询</button>
            <button class="layui-btn   layui-icon  layui-icon-add-circle"
                    lay-filter="add" lay-submit>新增</button>
        </div>
    </div>
</div>
<script type="text/html" id="barDemo">
    &nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;
    <a  lay-event="edit" title="修改"><i class="fa fa-edit fa-2x"></i></a>
    &nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;
    <a  lay-event="delete" title="删除"><i class="fa fa-remove fa-2x"></i></a>
</script>
<table class="layui-hide" id="test" lay-filter="test"></table>

</body>
</html>
