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
  <title>员工管理页</title>
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
        <span class="x-red">*</span>姓名:
      </label>
      <div class="layui-input-inline">
        <input type="text" id="stuffName" name="stuffName" required=""
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>员工Id:
      </label>
      <div class="layui-input-inline">
        <input type="text" id="stuffId" name="stuffId" required=""
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>出生日期:
      </label>
      <div class="layui-input-inline">
        <input type="text" id="birthday" name="birthday" required=""
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>电话号码:
      </label>
      <div class="layui-input-inline">
        <input type="text" id="telNumber" name="telNumber" required=""
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>所属部门:
      </label>
      <div class="layui-input-inline">
        <input type="text" id="deptName" name="deptName"
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>基本工资：
      </label>
      <div class="layui-input-inline">
        <input type="text" id="sal" name="sal"
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>绩效工资:
      </label>
      <div class="layui-input-inline">
        <input type="text" id="performanceSal" name="performanceSal" required=""
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>角色:
      </label>
      <div class="layui-input-inline">
        <input type="text" id="roleName" name="roleName"
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>性别:
      </label>
      <div class="layui-input-inline">
        <input type="text" id="sex" name="sex" required=""
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <button class="layui-btn" lay-filter="add" lay-submit=""
              style="margin-left: 100px" onclick="editWorker()">
        修改
      </button>
    </div>
  </form>
  <script>
    function editWorker() {
      alert("进入到function");
      $.post(
              "../editWorker",
              $("#form1").serialize(),
              function (result) {
                if(result==1)
                {
                  layer.msg("修改成功");
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
        <span class="x-red">*</span>姓名:
      </label>
      <div class="layui-input-inline">
        <input type="text" name="stuffName" required=""
               autocomplete="off" class="layui-input">
      </div>
    </div>

    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>身份证号：
      </label>
      <div class="layui-input-inline">
        <input type="text" name="stuffId" required=""
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>出生日期：
      </label>
      <div class="layui-input-inline">
        <input type="text" name="birthday" required=""
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>电话号码:
      </label>
      <div class="layui-input-inline">
        <input type="text" name="telNumber"
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item" id="as">
      <label class="layui-form-label">
        <span class="x-red">*</span>所属部门：
      </label>
      <div class="layui-input-inline">
        <input type="text" name="deptName"
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>基本工资:
      </label>
      <div class="layui-input-inline">
        <input type="text" name="sal"
               autocomplete="off" class="layui-input">
      </div>
    </div>

    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>绩效工资:
      </label>
      <div class="layui-input-inline">
        <input type="text" name="performanceSal"
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>性别:
      </label>
      <div class="layui-input-inline">
        <input type="text" name="sex"
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>密码:
      </label>
      <div class="layui-input-inline">
        <input type="text" name="password"
               autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">
        <span class="x-red">*</span>角色:
      </label>
      <div class="layui-input-inline">
        <select id="select" name="roleName">
          <option name="role">管理员</option>
          <option name="role">非管理员</option>
        </select>
      </div>
    </div>
    <div class="layui-form-item">
      <button class="layui-btn" lay-filter="add" lay-submit=""
              style="margin-left: 100px" onclick="addWorker()">
        增加
      </button>
    </div>
  </form>
</div>
<script>
  function addWorker() {
    $.post(
            "../addWorker",
            $("#aaa").serialize(),
            function (result) {
              if(result==1)
              {
                layer.alert("添加成功",function () {
                        }
                )
              }
              else{
                layer.alert("该员工已存在，请更换", {icon: 6,time: 2000},function () {

                })
              }
            }
    )
  }
</script>
<div class="layui-btn-group demoTable">
  <button class="layui-btn" onclick="add()">添加员工</button>
</div>
<table class="layui-table" id="idTest" lay-data="{limit: 5,limits: [5, 10, 15],width: 1000, height:450, url:'../getWorker', page:true, id:'idTest'}" lay-filter="demo">
  <thead>
  <tr>
    <th lay-data="{type:'checkbox', fixed: 'left'}"></th>
    <th lay-data="{field:'stuffName', width:100, sort: true, fixed: true}">姓名</th>
    <th lay-data="{field:'stuffId', width:100}">员工id</th>
    <th lay-data="{field:'birthday', width:100}">出生日期</th>
    <th lay-data="{field:'telNumber', width:100}">电话号码</th>
    <th lay-data="{field:'deptName', width:100}">所属部门</th>
    <th lay-data="{field:'sal', width:100}">基本工资</th>
    <th lay-data="{field:'performanceSal', width:100}">绩效工资</th>
    <th lay-data="{field:'roleName', width:100}">角色</th>
    <th lay-data="{field:'sex', width:100}">性别</th>

    <th lay-data="{fixed: 'right', width:150, align:'center', toolbar: '#barDemo'}">操作</th>
  </tr>
  </thead>
</table>
<script>
  function add() {
    layer.open(
            {
              title:"添加员工",
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
                  "../delWorker?idNumber="+data.idNumber,
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
        document.getElementById("stuffName").value=data.name;
        document.getElementById("stuffId").value=data.idNumber;
        document.getElementById("birthday").value=data.birthday;
        document.getElementById("telNumber").value=data.telNumber;
        document.getElementById("deptName").value=data.ssbm;
        document.getElementById("sal").value=data.sal;
        document.getElementById("performanceSal").value=data.pSal;
        document.getElementById("roleName").value=data.role;
        document.getElementById("sex").value=data.sex;
        layer.open(
                {
                  title:'修改员工信息',
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
