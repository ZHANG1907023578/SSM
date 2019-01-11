$(function(){
    layui.use(['jquery', 'layer', 'form'], function () {
        var $ = layui.jquery;
        var layer = layui.layer;
        var form = layui.form;


$("#btn").click(function () {
    $.ajax({
        url : "loginUser",
        dataType : "json",
        data:{"username":$("#Username").val(),"pwd":$("#Password").val()},
        type : "post",
        async : false,
        success : function(data) {
            if(data.success){
                layer.msg(data.message, {
                    icon: 6,//提示的样式
                    time: 1000, //2秒关闭（如果不配置，默认是3秒）//设置后不需要自己写定时关闭了，单位是毫秒
                    end:function(){
                        location.href='index.shtml';
                    }
                });
            }else{
                layer.msg(data.message);
            }
        }
    });

});
});
});