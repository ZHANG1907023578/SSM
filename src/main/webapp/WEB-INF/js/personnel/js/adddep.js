$(function() {
    //alert(1);
    layui.use(['element','form','layer'],function(){
        var element=layui.element;
        var layer=layui.layer;
        var form=layui.form;
        $('#return').click(function(){
            var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
            parent.layer.close(index); //再执行关闭
        });
        form.on('submit(addSalChan)', function(data){
            var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
        var url;
            if(data.field.depid==""){
                url="addDep";
            }else{
                url="updataDep";
            }
            $.ajax({
                url : url,
                dataType : "json",
                data:data.field,
                type : "post",
                async : false,
                success : function(data) {
                    console.log(data);
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
});
