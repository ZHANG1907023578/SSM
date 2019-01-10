<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/8/008
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
    <script type="text/javascript" src="${ctx}/js/personnel/js/adddep.js"></script>
</head>
<body>
<form action="" method="post" class="layui-form">
    <blockquote class="layui-elem-quote" style="align-content: center;">
        <a class="layui-btn" id="return" ><i class="layui-icon layui-icon-left"></i>返回</a>
        <button class="layui-btn layui-bg-red  layui-icon  layui-icon-chat" lay-submit lay-filter="addSalChan" title="保存">保存</button>
        <input type="hidden" name="chc_id" id="chc_id">
    </blockquote>
    <div class="layui-row">
        <div class="layui-col-xs6 ">
            <div class="grid-demo">
                <div class="layui-form-item">
                    <label class="layui-form-label">部门名称</label>
                    <div class="layui-input-block">
                        <input type="text" id="dname" name="dname"  lay-verify="required" autocomplete="off" placeholder="请输入部门名称" class="layui-input">

                    </div>
                </div>
            </div>
        </div>
        <div class="layui-col-xs6 ">
            <div class="grid-demo">
                <div class="layui-form-item">
                    <label class="layui-form-label">部门电话</label>
                    <div class="layui-input-block">
                        <input type="text" id="tel" name="tel" lay-verify="required" autocomplete="off" placeholder="请输入部门电话" class="layui-input">
                    </div>
                </div>
                <input type="hidden" name="depid" id="depid">
            </div>
        </div>
        </div>
    </div>
</form>
</body>
</html>
