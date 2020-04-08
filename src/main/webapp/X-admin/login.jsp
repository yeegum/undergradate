<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>后台登录-X-admin2.0</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <link rel="shortcut icon" href="/X-admin/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="/X-admin/css/font.css">
	<link rel="stylesheet" href="/X-admin/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="/X-admin/js/xadmin.js"></script>

</head>
<body class="login-bg">
    
    <div class="login layui-anim layui-anim-up">
        <div class="message">绿地物业平台入口</div>
        <div id="darkbannerwrap"></div>
        
     <form method="post" class="layui-form" action="../login" id="login">
            <input name="name" placeholder="姓名"  type="text" lay-verify="required" class="layui-input" id="name">
        <hr class="hr15">
            <input name="password" lay-verify="required" placeholder="密码"  type="password" class="layui-input">
            <hr class="hr15">
            <input value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit" >
            <hr class="hr20" >
        </form>
    </div>

    <script>
        function turn(){
            window.location.href="../muban/index.jsp";
        }
        $(function  () {
            layui.use('form', function(){
              var form = layui.form;
              //监听提交
              form.on('submit(login)', function(data){
                  $.post("../login", $("#login").serialize() ,function (data) {
                      if(parseInt(data)==1)
                      {
                          layer.alert("登录成功,三秒后进入主页面", {icon: 6,time: 2000},function () {
                              // 获得frame索引
                              var index = parent.layer.getFrameIndex(window.name);
                              //关闭当前frame
                              parent.layer.close(index);
                          });
                          window.setTimeout("turn()",3000);
                      }
                      else{
                          layer.alert("用户名或密码错误",{icon: 6,time:1500,yes:function(index,layero){
                                  layer.close();
                              }});
                      }}
                  )
                return false;
              });
            });
        })
        
    </script>

    
    <!-- 底部结束 -->
    <script>
    //百度统计可去掉
    var _hmt = _hmt || [];
    (function() {
      var hm = document.createElement("script");
      hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
      var s = document.getElementsByTagName("script")[0]; 
      s.parentNode.insertBefore(hm, s);
    })();
    </script>
</body>
</html>