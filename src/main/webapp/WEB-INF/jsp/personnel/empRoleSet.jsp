
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
    <script type="text/javascript" src="${ctx}/js/personnel/js/empRoleSet.js"></script>
</head>
<body>

<%--<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">--%>
    <%--<legend>简洁风格的Tab</legend>--%>
<%--</fieldset>--%>
a=${User}
<div class="layui-tab layui-tab-brief" lay-filter="docDemoTabBrief">
    <ul class="layui-tab-title">
        <li class="layui-this">我的资料</li>
        <li>修改头像</li>
        <li>修改密码</li>
    </ul>


<div class="layui-tab-content" style="height: 100px;">
        <div class="layui-tab-item layui-show">

            <form class="layui-form layui-form-pane" action="">
                <div class="layui-form-item">
                    <label class="layui-form-label">登录名</label>
                    <div class="layui-input-inline">
                        <input type="text" name="username" value="${User.username}" placeholder="请选择你的登录名"  lay-verify="required" autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label" style="color: red;display: none;">不可为空</label>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">姓名</label>
                    <div class="layui-input-inline">
                        <input type="text" name="ename" value="${User.ename}" placeholder="请选择你的姓名"   lay-verify="required" autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label" style="color: red;display: none; ">不可为空</label>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">手机号</label>
                    <div class="layui-input-inline">
                        <input type="text" name="tele"  value="${User.tele}"   placeholder="请选择你的手机号"   lay-verify="required" autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label" style="color: red;display: none;">不可为空</label>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">邮箱</label>
                    <div class="layui-input-inline">
                        <input type="text" name="email" value="${User.email}"  placeholder="请选择你的邮箱"  lay-verify="required" autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label" style="color: red;display: none;">不可为空</label>
                    </div>
                </div>



                <div class="layui-form-item">
                        <label class="layui-form-label">生日</label>
                        <div class="layui-input-inline">
                            <input type="text" name="birthday" value="${User.timestamp}"  id="date1" placeholder="请选择你的生日" autocomplete="off" class="layui-input">
                        </div>
                    <div class="layui-inline">
                        <label class="layui-form-label" style="color: red;display: none;">不可为空</label>
                    </div>
                </div>
                <div class="layui-form-item" >
                    <label class="layui-form-label">性别</label>
                    <div class="layui-input-inline">
                        <c:if test="${User.gender=='男'}">
                        <input type="radio" name="gender" value="男" title="男" checked="">
                        <input type="radio" name="gender" value="女" title="女">
                        </c:if>
                        <c:if test="${User.gender=='女'}">
                            <input type="radio" name="gender" value="男" title="男" >
                            <input type="radio" name="gender" value="女" title="女" checked="">
                        </c:if>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">地址</label>
                    <div class="layui-input-block">
                        <input type="text" name="address" value="${User.address}"  autocomplete="off" placeholder="请输入地址" class="layui-input">
                    </div>
                </div>
                <input type="hidden" value="${User.eid}">
                <div class="layui-form-item">
                    <button class="layui-btn" lay-submit=""  lay-filter="demo2">确认修改信息</button>
                </div>
            </form>

    </div>

        <div class="layui-tab-item">内容2</div>
        <div class="layui-tab-item">
            <form class="layui-form layui-form-pane" action="">
            <div class="layui-form-item">
                <label class="layui-form-label">新密码</label>
                <div class="layui-input-inline">
                    <input type="password" name="password1" id="pwd" lay-verify="pass" placeholder="请输入密码" autocomplete="off" class="layui-input">
                </div>

            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">确认密码</label>
                <div class="layui-input-inline">
                    <input type="password" name="password2" id="qrpwd" lay-verify="repass" placeholder="请输入再次密码" autocomplete="off" class="layui-input">
                </div>
            </div>
                <div class="layui-form-item">
                    <button class="layui-btn" lay-submit=""  lay-filter="updateMm">修改密码</button>
                </div>
            </form>
        </div>

</div>
</div>
</body>
</html>
