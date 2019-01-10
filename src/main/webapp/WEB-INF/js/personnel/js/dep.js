var form;
var formSelects;
var da;
var layer;
var whe;
$(function() {
    layui.use(['jquery', 'layer', 'form'], function () {
        var $ = layui.jquery;
        layer = layui.layer;
        form = layui.form;

        form.on('submit(query)', function (data) {
            whe = {
                'depid': data.field.depid,
                'dname': data.field.dname,
                'tel': data.field.tel
            }
            initTable(whe)
            return false;
        });
        form.on('submit(add)', function (data) {
            layer.open({
                type: 2,
                area: ['1200px', '450px'],
                title: '新增部门',
                anim: 1,
                content: 'adddep.sjsp',
                scrollbar: true,
                move: false,
            });
        });
    });
    initTable()
});
function initTable(wher) {
    layui.use('table',function() {
        var table = layui.table;
        tables = table.render({
            elem : '#test',
            url : 'queryDepPager',
            where : wher,
            cols : [ [
              {
                    field : 'dname',
                    title : '部门名称',
                  width:'40%'
                }, {
                    field : 'tel',
                    title : '部门电话',
                    width:'40%'
                },{
                    field:'center',
                    title:'操作',
                    toolbar: '#barDemo',
                    width:'19.8%',
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
                        url: "delDep",
                        data: {
                            "depid": data.depid,
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
                    content: 'adddep.sjsp',
                    scrollbar: true,
                    move: false,
                    success: function (layero, index) {
                        var body = layer.getChildFrame('body', index);
                        body.find("#depid").val(obj.data.depid);  // 方式一
                        body.find("#dname").val(obj.data.dname);  // 方式一
                        body.find("#tel").val(obj.data.tel);  // 方式一
                    }
                });
            }
        });

    });
}
