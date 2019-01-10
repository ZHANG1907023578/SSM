$(function () {
    layui.use(['jquery', 'layer', 'form'], function () {
        var $ = layui.jquery;
        var layer = layui.layer;
        var form = layui.form;

        form.on('submit(query)', function (data) {
            whe = {
                'eid': data.field.eid,
                'ename': data.field.ename,
                'gender': data.field.gender,
                'tele': data.field.tele,
                'depid': data.field.depid,
            }
            initTable(whe)
            return false;
        });

        form.on('submit(add)',function(data){
            layer.open({
                type: 2,
                area: ['800px', '400px'],
                title: '新增员工',
                anim: 1,
                content: 'addemp.sjsp',
                scrollbar: true,
                move: false,
            });
            return false;
        });


    });
    initTable();
    initBm();



    })    ;


function initTable(wher) {
    layui.use('table',function() {
        var table = layui.table;
        tables = table.render({
            elem : '#test',
            url : 'queryEmpPager',
            where : wher,
            cols : [ [{
                field : '',
                title : '编号',
                width:'7%',
                type:'numbers',
                sort: true
            },
                {
                    field : 'username',
                    title : '登录名',
                    width:'8%'
                },
                {
                    field : 'ename',
                    title : '姓名',
                    width:'8%'
                }, {
                    field : 'gender',
                    title : '性别',
                    width:'8%'
                }, {
                    field : 'tele',
                    title : '电话',
                    width:'8%'
                }, {
                    field : 'email',
                    title : 'email',
                    width:'14%'
                }, {
                    field : 'address',
                    title : '地址',
                    width:'14%'
                },{
                    field : 'birthday',
                    title : '出生年月日',
                    width:'14%',
                    templet : function(res) {
                        console.log(res);
                        return formatterDate(res.birthday);
                    }
                },{
                    field : 'dname',
                    title : '部门名称',
                    width:'8%'
                },
                {
                    field:'center',
                    title:'操作',
                    toolbar: '#barDemo',
                    width:'9.6%',
                }
            ] ],
            page : true
            ,request: {
                pageName: 'page' //页码的参数名称，默认：page
                ,limitName: 'rows' //每页数据量的参数名，默认：limit
            }
        });
        table.on('tool(test)', function(obj) {
            var data = obj.data;
            if (obj.event === 'delete') {
                layer.confirm('真的删除行么', function (index) {
                    $.ajax({
                        url: "delEmp",
                        data: {
                            "eid": data.eid,
                        },
                        dataType: "json",
                        type: "post",
                        async: false,
                        success: function (data) {
                            if (data.success) {
                                layer.msg(data.message);
                                tables.reload();
                            } else {
                                layer.msg(data.message);
                                tables.reload();
                            }
                        }
                    });

                    layer.close(index);
                });
            } else if (obj.event === 'edit') {

                layer.open({
                    type: 2,
                    area: ['1200px', '450px'],
                    title: '制订计划',
                    anim: 1,
                    content: 'addemp.sjsp',
                    scrollbar: true,
                    move: false,
                    success: function (layero, index) {
                        var body = layer.getChildFrame('body', index);
                        body.find("#eid").val(obj.data.eid);  // 方式一
                        body.find("#username").val(obj.data.username);  // 方式一
                        if(obj.data.gender=='男'){
                            console.log("man");
                            body.find("#sex").attr("checked",false);  // 方式一
                            body.find("#man").attr("checked",true);  // 方式一
                        }else{
                            console.log("sex");
                            body.find("#sex").attr("checked",true);  // 方式一
                            body.find("#man").attr("checked",false);  // 方式一

                        }
                        body.find("#ename").val(obj.data.ename);  // 方式一
                        body.find("#email").val(obj.data.email);  // 方式一
                        body.find("#tele").val(obj.data.tele);  // 方式一
                        body.find("#address").val(obj.data.address);  // 方式一
                        body.find("#birthday").val(formatterDate(obj.data.birthday));  // 方式一
                        body.find("#depid").val(obj.data.depid);  // 方式一
                        var iframeWindow = window['layui-layer-iframe'+ index]
                        iframeWindow.layui.form.render();
                    }
                });
            }
        });

    });
}








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