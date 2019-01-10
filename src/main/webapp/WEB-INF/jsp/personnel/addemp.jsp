<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
    <script type="text/javascript" src="${ctx}/js/personnel/js/addemp.js"></script>
</head>
<body>
<form action="" class="layui-form" >
<blockquote class="layui-elem-quote">
    <button class="layui-btn layui-bg-red  layui-icon " lay-submit lay-filter="add" title="保存">添加员工</button>
</blockquote>

<div class="layui-row ">
    <div class="layui-col-xs6">
        <div class="grid-demo grid-demo-bg1">
            <div class="layui-form-item">
            <label class="layui-form-label">登录名</label>
            <div class="layui-input-block">
                <input type="text" name="username" id="username"  autocomplete="off" placeholder="请输入登录名" class="layui-input" required>
            </div>
        </div>
    </div>
    </div>

    <div class="layui-col-xs6">
        <div class="grid-demo">
            <div class="layui-form-item">
            <label class="layui-form-label">真实姓名</label>
            <div class="layui-input-block">
                <input type="text" name="ename" id="ename"  autocomplete="off" placeholder="请输入真实姓名" class="layui-input" required>
            </div>
        </div>
    </div>
    </div>

    <div class="layui-col-xs6">
        <div class="grid-demo ">
            <div class="layui-form-item"> <label class="layui-form-label">性别</label>
            <div class="layui-input-block">
                <input type="radio" name="gender"  id="man" value="男" title="男" checked="checked">
                <input type="radio" name="gender" id="sex"  value="女" title="女" >

            </div>
        </div>
    </div>
    </div>
    <div class="layui-col-xs6">
        <div class="grid-demo">
            <div class="layui-form-item">
            <label class="layui-form-label">email</label>
            <div class="layui-input-block">
                <input type="text" name="email" id="email"  autocomplete="off" placeholder="请输入email" class="layui-input" required>
            </div>
        </div>
    </div>
    </div>
    <div class="layui-col-xs6">
        <div class="grid-demo grid-demo-bg1">
            <div class="layui-form-item"> <label class="layui-form-label">电话</label>
            <div class="layui-input-block">
                <input type="text" name="tele" id="tele"  autocomplete="off" placeholder="请输入电话" class="layui-input" required>
            </div>
        </div>
        </div>
    </div>
    <div class="layui-col-xs6">
        <div class="grid-demo">
            <div class="layui-form-item">
            <label class="layui-form-label">地址</label>
            <div class="layui-input-block">
                <input type="text" name="address" id="address"  autocomplete="off" placeholder="请输入地址" class="layui-input" required>
            </div>
        </div>
        </div>
    </div>
    <div class="layui-col-xs6">
        <div class="grid-demo grid-demo-bg1">
            <div class="layui-form-item">
            <label class="layui-form-label">出生日期</label>
            <div class="layui-input-block">
                <input type="text" id="birthday" name="birthday" class="layui-input" placeholder="yyyy-MM-dd HH:mm:ss" required>
            </div>
            </div>
        </div>
    </div>
    <div class="layui-col-xs6">
        <div class="grid-demo">
            <div class="layui-form-item">
            <label class="layui-form-label">部门</label>
            <div class="layui-input-block">
                <select name="depid"  id="depid" required>
                </select>
            </div>
        </div>
    </div>
    </div>
</div>
    <input type="hidden" id="eid" name="eid">
    <input type="hidden" id="pwd" name="pwd">
</form>
</body>
</html>
