<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/10/010
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
    <script type="text/javascript" src="${ctx}/js/repertory/storedetail.js"></script>
</head>
<body>
<form class="layui-form" action="">
<div class="layui-row">
    <div class="layui-col-md4">
        <div class="grid-demo grid-demo-bg1">
            <label class="layui-form-label">仓库</label>
            <div class="layui-input-block">
                <select name="stid"  id="stid" lay-filter="stid" >
                </select>
            </div>
        </div>
    </div>
    <div class="layui-col-md4">
    <div class="grid-demo">
        <label class="layui-form-label">商品</label>
        <div class="layui-input-block">
            <select name="gid"  id="gid" >
                <option value="">----请选择商品----</option>
            </select>
        </div>

    </div>
</div>
    <div class="layui-col-md4">
        <div class="grid-demo">
            &nbsp;&nbsp;         &nbsp;&nbsp;
            <button class="layui-btn layui-bg-red  layui-icon  layui-icon-chat" lay-submit lay-filter="query" title="查询">查询</button>
        </div>
    </div>
    </div>
</form>
<table class="layui-hide" id="test" lay-filter="test"></table>
</body>
</html>
