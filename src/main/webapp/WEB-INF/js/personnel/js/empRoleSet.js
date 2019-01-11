$(function () {
    layui.use('element', function(){
        var $ = layui.jquery
            ,element = layui.element; //Tab的切换功能，切换事件监听等，需要依赖element模块
        //触发事件
        var active = {
            tabAdd: function(){
                //新增一个Tab项
                element.tabAdd('demo', {
                    title: '新选项'+ (Math.random()*1000|0) //用于演示
                    ,content: '内容'+ (Math.random()*1000|0)
                    ,id: new Date().getTime() //实际使用一般是规定好的id，这里以时间戳模拟下
                })
            }
            ,tabDelete: function(othis){
                //删除指定Tab项
                element.tabDelete('demo', '44'); //删除：“商品管理”
                othis.addClass('layui-btn-disabled');
            }
            ,tabChange: function(){
                //切换到指定Tab项
                element.tabChange('demo', '22'); //切换到：用户管理
            }
        };

        $('.site-demo-active').on('click', function(){
            var othis = $(this), type = othis.data('type');
            active[type] ? active[type].call(this, othis) : '';
        });
        //Hash地址的定位
        var layid = location.hash.replace(/^#test=/, '');
        element.tabChange('test', layid);

        element.on('tab(test)', function(elem){
            location.hash = 'test='+ $(this).attr('lay-id');
        });
    });
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;

        laydate.render({
            elem: '#date1',
            type:'datetime'
        });
        //自定义验证规则
        form.verify({
            title: function(value){
                if(value.length < 5){
                    return '标题至少得5个字符啊';
                }
            }
            ,pass: [
                /^[\S]{6,12}$/
                ,'密码必须6到12位，且不能出现空格'
            ]
            ,content: function(value){
                layedit.sync(editIndex);
            }
        });



        //监听提交
        form.on('submit(demo1)', function(data){
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            })
            return false;
        });
    });
    $(".layui-input").keydown(function () {
        $(".layui-form-label").css("display", "block");

    });
    layui.use(['jquery', 'layer', 'form'], function () {
        var $ = layui.jquery;
        var layer = layui.layer;
        var form = layui.form;

        form.on('submit(demo2)',function (data) {
            $.ajax({
                url : "updatOurUser",
                dataType : "json",
                data:data.field,
                type : "post",
                async : false,
                success : function(data) {
                    if(data.message){
                            layer.msg(data.message, {
                                icon: 1,//提示的样式
                                time: 1000, //2秒关闭（如果不配置，默认是3秒）//设置后不需要自己写定时关闭了，单位是毫秒
                                end:function(){
                                    window.location.reload();
                                }
                            });

                    }else{
                        layer.msg(data.message);
                    }
                }
            })
            return false;
        });

        form.on('submit(updateMm)',function (data) {
            $.ajax({
                url : "updateMm",
                dataType : "json",
                data:{"pwd":data.field.password1},
                type : "post",
                async : false,
                success : function(data) {
                    if(data.message){
                        layer.msg(data.message, {
                            icon: 1,//提示的样式
                            time: 1000, //2秒关闭（如果不配置，默认是3秒）//设置后不需要自己写定时关闭了，单位是毫秒
                            end:function(){
                                //涉及权限




                            }
                        });
                    }else{
                        layer.msg(data.message);
                    }
                }
            })


            return false;
        });




    form.verify({
        pass:[/(.+){6.12}$/,'密码必须6到12位']
        ,
        repass: function(value) {
//获取密码
            var pass = $("#pwd").val();
            if(!new RegExp(pass).test(value)) {
                return '两次输入的密码不一致';
            }
        }
    });

    });




});
