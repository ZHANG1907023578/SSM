var form;
$(function () {
    layui.use(['jquery', 'layer', 'form','laydate'], function () {
        var $ = layui.jquery;
        var layer = layui.layer;
         form = layui.form;
        var laydate=layui.laydate;
        laydate.render({
            elem: '#test5'
            ,type: 'datetime'
            ,range: true
        });

        form.on('submit(query)',function (data) {
            initTable(data.field);
            return false;
        });


    });

    initTable();
    initBas();
    initCk();
    initEmp();
    initSp();
});


function initTable(wher) {
    layui.use('table',function() {
        var table = layui.table;
        tables = table.render({
            elem : '#test',
            url : 'queryStoreopermess',
            where : wher,
            cols : [ [{
                field : '',
                title : '编号',
                width:'10%',
                type:'numbers',
                sort: true
            },
                {
                    field : 'ename',
                    title : '员工',
                    width:'11%'
                },
                {
                    field : 'opertime',
                    title : '操作日期',
                    width:'16%',
                    templet : function(res) {
                        console.log(res);
                        return formatterDate(res.opertime);
                    }
                }, {
                    field : 'name',
                    title : '仓库',
                    width:'16%'
                }, {
                    field : 'gname',
                    title : '商品',
                    width:'16%'
                }, {
                    field : 'num',
                    title : '数量',
                    width:'15%'
                }, {
                    field : 'dictvalue',
                    title : '类型',
                    width:'15.8%'
                },
            ] ],
            page : true
            ,request: {
                pageName: 'page' //页码的参数名称，默认：page
                ,limitName: 'rows' //每页数据量的参数名，默认：limit
            }
        });

    });
}


function initCk(){
    var d = "";
    $.ajax({
        url : "CkQuery",
        dataType : "json",
        type : "post",
        async : false,
        success : function(data) {
            console.log(data);
            for (var i = 0; i < data.length; i++) {
                d += "<option value='" + data[i].stid + "' >" + data[i].name
                    + "</option>";
            }
            $("select[name=sdid]").append(d);
        }
    });
}

function initSp(){
    var d = "";
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


function initEmp(){
    var d = "";
    $.ajax({
        url : "queryEmpSelect",
        dataType : "json",
        type : "post",
        async : false,
        success : function(data) {
            for (var i = 0; i < data.length; i++) {
                d += "<option value='" + data[i].eid + "' >" + data[i].ename
                    + "</option>";
            }
            $("select[name=eid]").append(d);
        }
    });
}

function initBas(){
    var d = "";
    $.ajax({
        url : "queryBasSelect",
        dataType : "json",
        data:{"dicttype":"CKTYPE"},
        type : "post",
        async : false,
        success : function(data) {
            console.log(data);
            for (var i = 0; i < data.length; i++) {
                d += "<option value='" + data[i].dictid + "' >" + data[i].dictvalue
                    + "</option>";
            }
            $("select[name=type]").append(d);
        }
    });
}