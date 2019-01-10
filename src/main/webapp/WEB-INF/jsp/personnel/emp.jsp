<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
    <script type="text/javascript" src="${ctx}/js/personnel/js/emp.js"></script>
</head>
<body style="margin:0;padding:0;">
<form class="layui-form" action="">
    <div class="layui-row">
        <div class="layui-col-md4">
            <div class="grid-demo grid-demo-bg1">
                <label class="layui-form-label">员工编号</label>
                <div class="layui-input-block">
                    <input type="text" name="eid" id="eid"  autocomplete="off" placeholder="请输入员工编号" class="layui-input">
                </div>
            </div>
        </div>
        <div class="layui-col-md4">
            <div class="grid-demo">
                <label class="layui-form-label">员工名称</label>
                <div class="layui-input-block">
                    <input type="text" name="ename" id="ename"  autocomplete="off" placeholder="请输入员工姓名" class="layui-input">
                </div>
            </div>
        </div>
        <div class="layui-col-md4">
            <div class="grid-demo grid-demo-bg1">
                <label class="layui-form-label">员工性别</label>
                <div class="layui-input-block">
                    <input type="radio" name="gender"  id="gender" value="男" title="男" checked>
                    <input type="radio" name="gender"  value="女" title="女" >
                </div>
            </div>
        </div>
    </div>
    <br/>
    <div class="layui-row">
        <div class="layui-col-md4">
            <div class="grid-demo grid-demo-bg1">
                <label class="layui-form-label">员工电话</label>
                <div class="layui-input-block">
                    <input type="text" name="tele" id="tele"  autocomplete="off" placeholder="请输入员工电话" class="layui-input">
                </div>
            </div>
        </div>
        <div class="layui-col-md4">
            <div class="grid-demo">
                <label class="layui-form-label">员工部门</label>
                <div class="layui-input-block">
                    <select name="depid"  id="depid" >

                    </select>
                </div>
            </div>
        </div>
        <div class="layui-col-md4">
            <div class="grid-demo grid-demo-bg1">
                &nbsp;&nbsp;&nbsp;&nbsp;
                <button class="layui-btn layui-bg-red  layui-icon  layui-icon-chat" lay-submit lay-filter="query" title="查询员工信息">查询员工信息</button>
                <button class="layui-btn layui-bg-red  layui-icon " lay-submit lay-filter="add" title="添加员工">添加员工</button>
                <button class="layui-btn layui-bg-red  layui-icon  layui-icon-chat" lay-submit lay-filter="exal" title="导出Excel">导出Excel</button>

            </div>
        </div>
    </div>
</form>
<script type="text/html" id="barDemo">
    <a  lay-event="edit" title="修改"><i class="fa fa-edit fa-2x"></i></a>
    &nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;
    <a  lay-event="delete" title="删除"><i class="fa fa-remove fa-2x"></i></a>
</script>
<table class="layui-hide" id="test" lay-filter="test"></table>
</body>
</html>
