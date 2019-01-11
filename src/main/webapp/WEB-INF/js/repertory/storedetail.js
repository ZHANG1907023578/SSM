$(function () {
    layui.use(['jquery', 'layer', 'form'], function () {
        var $ = layui.jquery;
        var layer = layui.layer;
        var form = layui.form;


        form.on('submit(query)',function (data) {
            initTable(data.field);
            return false;
        });

    });
    initTable();
    initCk();
    initSp();
    });


function initTable(wher) {
    layui.use('table',function() {
        var table = layui.table;
        tables = table.render({
            elem : '#test',
            url : 'queryStoredetail',
            where : wher,
            cols : [ [{
                field : '',
                title : '编号',
                width:'10%',
                type:'numbers',
                sort: true
            },
                {
                    field : 'name',
                    title : '仓库',
                    width:'30%'
                },
                {
                    field : 'gname',
                    title : '商品',
                    width:'30%'
                }, {
                    field : 'num',
                    title : '数量',
                    width:'29.8%'
                }
            ] ]
            ,
            page : true
            ,request: {
                pageName: 'page' //页码的参数名称，默认：page
                ,limitName: 'rows' //每页数据量的参数名，默认：limit
            }
        });

    });
}

function initCk(){
    var d = "<option value='' >---请选择仓库---</option>";
    $.ajax({
        url : "CkQuery",
        dataType : "json",
        type : "post",
        async : false,
        success : function(data) {
            for (var i = 0; i < data.length; i++) {
                d += "<option value='" + data[i].stid + "' >" + data[i].name
                    + "</option>";
            }
            $("select[name=stid]").append(d);
        }
    });
}

function initSp(){
    var d="";
    $.ajax({
        url : "goodsSelect",
        dataType : "json",
        type : "post",
        async : false,
        success : function(data) {
            for (var i = 0; i < data.length; i++) {
                d += "<option value='" + data[i].gid + "' >" + data[i].gname
                    + "</option>";
            }
            $("select[name=gid]").append(d);
        }
    });
}