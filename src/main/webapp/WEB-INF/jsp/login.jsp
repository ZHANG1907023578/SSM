<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/11/011
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
    <script type="text/javascript" src="${ctx}/js/util/login.js"></script>
    <link href="${ctx}/js/util/css/font-awesome.css" rel="stylesheet"><!-- Font-awesome-CSS -->
    <link href="${ctx}/js/util/css/style.css" rel='stylesheet' type='text/css'/><!-- style.css -->
</head>
<script src="${ctx}/js/util/js/jquery.min.js"></script>
<script type="application/x-javascript">
    addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
    function hideURLbar(){ window.scrollTo(0,1); }
</script>
<script>$(document).ready(function(c) {
    $('.alert-close').on('click', function(c){
        $('.main-agile').fadeOut('slow', function(c){
            $('.main-agile').remove();
        });
    });
});
</script>
<body>
<h1>无 名 蓝 云 ERP 管 理 系 统</h1>
<div class="main-agile">
    <div class="alert-close"> </div>
    <div class="content-wthree">
        <div class="circle-w3layouts"></div>
        <h2>Login</h2>
        <form action="#" method="post">
            <div class="inputs-w3ls">
                <i class="fa fa-user" aria-hidden="true"></i>
                <input type="text" id="Username" name="Username" placeholder="Username" required=""/>
            </div>
            <div class="inputs-w3ls">
                <i class="fa fa-key" aria-hidden="true"></i>
                <input type="password" id="Password" name="Password" placeholder="Password" required=""/>
            </div>
            <input type="button" id="btn"  value="登录">

        </form>
    </div>
</div>
<div class="footer-w3l">
    <p class="agileinfo"> &copy; 2017 Basic Login Form. All Rights Reserved | Design by </p>
</div>
</body>
</html>
