$(function () {
    layui.use(['jquery', 'layer', 'form','laydate'], function () {
        var $ = layui.jquery;
        var layer = layui.layer;
        var form = layui.form;
        var laydate = layui.laydate;
       var $ = layui.jquery;
        laydate.render({
            elem: '#birthday'
            ,type: 'datetime'
        });

        form.on('submit(add)',function(data){
            var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
            var url;
            if(data.field.eid==""){
                url="addEmp";
            }else{
                url="updataEmp";
            }
            console.log(data.field);
            $.ajax({
                url : url,
                dataType : "json",
                data:data.field,
                type : "post",
                async : false,
                success : function(data) {
                    if(data.success){
                        parent.layer.msg(data.message);
                        parent.layer.close(index); //再执行关闭
                        parent.layui.table.reload('test',{page:{curr:1}});
                    }else{
                        parent.layer.msg(data.message);
                        parent.layer.close(index); //再执行关闭
                        parent.layui.table.reload('test',{page:{curr:1}});
                    }
                }
            });
            return false;
        });
    });
    initBm();
});

function initBm(){
    var d = "<option value='' >---请选择部门---</option>";
    $.ajax({
        url : "bMSelect",
        dataType : "json",
        type : "post",
        async : false,
        success : function(data) {
            for (var i = 0; i < data.length; i++) {
                d += "<option value='" + data[i].depid + "' >" + data[i].dname
                    + "</option>";
            }
            $("select[name=depid]").append(d);
        }
    });
}