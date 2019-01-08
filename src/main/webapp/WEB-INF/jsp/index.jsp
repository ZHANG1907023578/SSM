<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/6/006
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
    <script type="text/javascript" src="${ctx}/js/permissions/js/Menu.js"></script>
    <link rel="stylesheet" type="text/css" href="${ctx}/js/permissions/css/Menu.css">
</head>


<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">客户关系管理系统</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <%--<ul class="layui-nav layui-layout-left">--%>
            <%--<li class="layui-nav-item"><a href="javascript:;">其它系统</a>--%>
                <%--<dl class="layui-nav-child">--%>
                    <%--<dd>--%>
                        <%--<a href="">邮件管理</a>--%>
                    <%--</dd>--%>
                    <%--<dd>--%>
                        <%--<a href="">消息管理</a>--%>
                    <%--</dd>--%>
                    <%--<dd>--%>
                        <%--<a href="">授权管理</a>--%>
                    <%--</dd>--%>
                <%--</dl></li>--%>
        <%--</ul>--%>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item"><a href="javascript:;"> <img
                    src="${image}" class="layui-nav-img"> ${username }
            </a>
                <dl class="layui-nav-child">
                    <dd>
                        <a href="javascript:false" id="zl">暂无功能</a>
                    </dd>
                </dl></li>
            <li class="layui-nav-item"><a href="loginOut">退了</a></li>
        </ul>
    </div>





    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll ">
            <div id="sidemenubar" lay-filter="test"></div>
        </div>
    </div>


    <div class="layui-body">
        <div class="layui-tab" lay-filter="tabs" lay-allowClose="true">
            <ul class="layui-tab-title">
            </ul>
            <div class="layui-tab-content"></div>

        </div>

        <div class="layui-footer">
            <!-- 底部固定区域 -->
            © 来自com.zking.T213 -
        </div>

    </div>

</div>
</body>
</html>
