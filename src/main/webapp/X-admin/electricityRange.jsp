<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/08/06
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>电费管理页</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
  <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
  <link rel="stylesheet" href="./css/font.css">
  <link rel="stylesheet" href="./css/xadmin.css">
  <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
  <script src="./lib/layui/layui.js" charset="utf-8"></script>
  <script type="text/javascript" src="./js/xadmin.js"></script>
  <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->

  <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
  <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
  <style>
    #ljf{
      display: none;
    }
    #edit{
      display: none;
    }
  </style>
</head>
<body>
<div class="x-body layui-anim layui-anim-up" id="edit" >
  <form class="layui-form"  method="post" id="form1" >
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>房号:
      </label>
      <div class="layui-input-inline">
        <input type="text" id="fh" name="fh" required=""
               autocomplete="off" class="layui-input" readonly="readonly">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>企业名称:
      </label>
      <div class="layui-input-inline">
        <input type="text" id="companyName" name="companyName" required=""
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>用电量:
      </label>
      <div class="layui-input-inline">
        <input type="text" id="electricAmount" name="electricAmount" required=""
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>单价:
      </label>
      <div class="layui-input-inline">
        <input type="text" id="perPrice" name="perPrice"
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>总费用：
      </label>
      <div class="layui-input-inline">
        <input type="text" id="allPrice" name="allPrice"
               autocomplete="off" class="layui-input">
      </div>
    </div>

    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>月份：
      </label>
      <div class="layui-input-inline">
        <input type="text" id="rq" name="rq"
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <button class="layui-btn" lay-filter="add" lay-submit=""
              style="margin-left: 100px" onclick="editCompany()">
        修改
      </button>
    </div>
  </form>
  <script>
    function editCompany() {
      alert("进入到function");
      $.post(
              "../editElectricity",
              $("#form1").serialize(),
              function (result) {
                if(result==1)
                {
                  layer.alert("修改成功");
                }
                else{
                  layer.alert("修改失败");
                }
              }
      )
    }
  </script>
</div>
<div class="x-body layui-anim layui-anim-up" id="ljf" >
  <form class="layui-form"  method="post" id="aaa" >
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>房号:
      </label>
      <div class="layui-input-inline">
        <input type="text" name="fh" required=""
               autocomplete="off" class="layui-input">
      </div>
    </div>

    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>企业名称：
      </label>
      <div class="layui-input-inline">
        <input type="text" name="companyName" required=""
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>用电量：
      </label>
      <div class="layui-input-inline">
        <input type="text" name="electricAmount" required=""
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>单价:
      </label>
      <div class="layui-input-inline">
        <input type="text" name="perPrice"
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item" id="as">
      <label class="layui-form-label">
        <span class="x-red">*</span>总费用：
      </label>
      <div class="layui-input-inline">
        <input type="text" name="allPrice"
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>月份：
      </label>
      <div class="layui-input-inline">
        <input type="text" name="rq"
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <button class="layui-btn" lay-filter="add" lay-submit=""
              style="margin-left: 100px" onclick="addElectricity()">
        增加
      </button>
    </div>
  </form>
</div>
<script>
  function addElectricity() {
    $.post(
            "../addElectricity",
            $("#aaa").serialize(),
            function (result) {
              if(result==1)
              {
                layer.alert("添加成功",function () {
                        }
                )
              }
              else{
                layer.alert("该房间本月信息已存在，请更换", {icon: 6,time: 2000},function () {

                })
              }
            }
    )
  }
</script>
<div class="layui-btn-group demoTable">
  <button class="layui-btn" onclick="add()">插入用电信息</button>
</div>
<table class="layui-table" id="idTest" lay-data="{limit: 5,limits: [5, 10, 15],width: 1000, height:450, url:'../getElectricity', page:true, id:'idTest'}" lay-filter="demo">
  <thead>
  <tr>
    <th lay-data="{type:'checkbox', fixed: 'left'}"></th>
    <th lay-data="{field:'fh', width:100, sort: true, fixed: true}">房号</th>
    <th lay-data="{field:'companyName', width:150}">企业名称</th>
    <th lay-data="{field:'electricAmount', width:150}">用电量</th>
    <th lay-data="{field:'perPrice', width:100}">单价</th>
    <th lay-data="{field:'allPrice', width:150}">总费用</th>
    <th lay-data="{field:'rq', width:150}">月份</th>

    <th lay-data="{fixed: 'right', width:150, align:'center', toolbar: '#barDemo'}">操作</th>
  </tr>
  </thead>
</table>
<script>
  function add() {
    layer.open(
            {
              title:'插入用电信息',
              type: 1,
              area: ['500px', '500px'],
              fix: false,
              maxmin: true,
              shade: 0.4,
              shadeClose:true,
              content:$("#ljf")
            }
    )
  }
</script>
<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-xs" lay-event="edit">修改</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script>
  layui.use('table', function(){
    var table = layui.table;
    //监听表格复选框选择
    table.on('checkbox(demo)', function(obj){
      //alert(obj);
    });
    //监听工具条
    table.on('tool(demo)', function(obj){
      var data = obj.data;
      if(obj.event === 'detail'){
        layer.msg('用户ID：'+ data.role_id + ' 的查看操作');
      } else if(obj.event === 'del'){
        layer.confirm('真的删除行么', function(index){
          $.post(
                  "../delElectricity?fh="+data.fh,
                  function (result) {
                    if(result==1)
                    {
                      layer.alert("删除成功");
                      location.reload();
                    }
                    else{
                      layer.alert("删除失败");
                    }
                  }
          )
        });
      } else if(obj.event === 'edit'){
        document.getElementById("fh").value=data.fh;
        document.getElementById("companyName").value=data.companyName;
        document.getElementById("electricAmount").value=data.electricAmount;
        document.getElementById("perPrice").value=data.perPrice;
        document.getElementById("allPrice").value=data.allPrice;
        document.getElementById("rq").value=data.rq;
        layer.open(
                {
                  title:'修改电费信息',
                  type: 1,
                  area: ['500px', '500px'],
                  fix: false,
                  maxmin: true,
                  shade: 0.4,
                  shadeClose:true,
                  content:$("#edit")
                }
        )


      }
    });

    var $ = layui.$, active = {
      getCheckData: function(){ //获取选中数据
        var checkStatus = table.checkStatus('idTest')
                ,data = checkStatus.data;
        layer.alert(JSON.stringify(data));
      }
      ,getCheckLength: function(){ //获取选中数目
        var checkStatus = table.checkStatus('idTest')
                ,data = checkStatus.data;
        layer.msg('选中了：'+ data.length + ' 个');
      }
      ,isAll: function(){ //验证是否全选
        var checkStatus = table.checkStatus('idTest');
        layer.msg(checkStatus.isAll ? '全选': '未全选')
      },
      isdel:function () {
        if(window.confirm("确认删除吗")) {
          var delStatus = table.checkStatus('idTest')
                  ,data=delStatus.data;
          var params="";
          for(var i=0;i<data.length;i++)
          {
            params+="ids="+data[i].id+"&";
          }
          $.post("del",params,function (result) {
            if(result==0)
            {
              layer.alert("删除失败")
            }
            else{
              layer.alert("删除成功")
              location.reload();

            }
          })
        }
      }
    };

    $('.demoTable .layui-btn').on('click', function(){
      var type = $(this).data('type');
      active[type] ? active[type].call(this) : '';
    });
  });
</script>
</body>
</html>
