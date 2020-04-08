<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width,user-scalable=no, initial-scale=1">
<title>绿地物业管理</title>
<link rel="stylesheet" href="css/index.css" type="text/css">
<link rel="stylesheet" href="css/zym.css" type="text/css">

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/global.js"></script>
<script type="text/javascript" src="js/hm.js"></script>
<script type="text/javascript" src="js/script.js"></script>
	<script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
	<script src="../X-admin/lib/layui/layui.js" charset="utf-8"></script>
	<script type="text/javascript" src="../X-admin/js/xadmin.js"></script>
<script>
	layui.use('flow',function () {
		var flow=layui.flow;
		flow.load(
				{
					elem:'#div1',
					done:function (page,next) {
						var lis=[];
						$.post('/getMessageList?page='+page,function (result) {
							layui.each(result.data, function(index, item){
								lis.push('<p>'+ item+'</p> ');
							});

							//执行下一页渲染，第二参数为：满足“加载更多”的条件，即后面仍有分页
							//pages为Ajax返回的总页数，只有当前页小于总页数的情况下，才会继续出现加载更多
							next(lis.join(''), page < result.pages);
						})
					}
				}
		)
	})

</script>
	<script>
		function func() {
			layer.open(
					{
						title:'留言板',
						type: 1,
						area: ['300px', '300px'],
						fix: false,
						maxmin: true,
						shade: 0.4,
						shadeClose:true,
						content:$("#message")
					}
			)
		}
	</script>

<style>
#message{
	display: none;
}
</style>
</head>
<body>
<div class="x-body layui-anim layui-anim-up" id="message">
	<form class="layui-form"  method="post" id="aaa" >
		<input type="hidden" name="messageName" value="<%=session.getAttribute("LoginName")%>">
		<div class="layui-form-item">
			<label class="layui-form-label">
				<span class="x-red"></span>说点啥呢:
			</label>
			<div class="layui-input-inline">
				<input type="text" name="content" required=""
					   autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<button class="layui-btn" lay-filter="add" lay-submit=""
					style="margin-left: 100px" onclick="addMessage()">
				发布留言
			</button>
		</div>
	</form>
</div>
<script>
	function addMessage(){
		$.post(
				"../addMessage",
				$("#aaa").serialize(),
				function (result) {
					if(result==1)
					{
						layer.alert("发布成功",function () {
									location.reload();
								}
						)
					}
					else{

					}
				}
		)

	}
</script>
<!--头部-->
<div class="top_bg" id="top_bg">
    <div class="top_gang">
    	<div class="tou_zj">
    		<div class="hy">
    			<img src="images/tou_tb_03.png">
    			<span>欢迎来到江西绿地物业管理有限公司</span>
    		</div>
    		<div class="soucang">
    			<a href="#">设为首页&nbsp;</a>｜
    			<a href="#">&nbsp;加入收藏</a>
    		</div>
    	</div>
    </div>
    <div class="top_main">
        <div class="top_logo">
            <a href='./'><img src="images/logo1.png"></a>
        </div>
        <!--导航-->
		<div class="daohang">
			<div class="header_nav">
				<div class="main clearBoth">
					<ul class="nav right">
						<li class="narrow_wrap">
							<a class="nav_btn" href="index.jsp">
								网站首页
								<b></b>
							</a>
						</li>
						<li class="narrow_wrap">
							<a class="nav_btn" href="about.html">
								关于我们
								<b></b>
								<div></div>
							</a>
							<div class="service_nav hide_nav hide_nav_narrow none" style="opacity: 0;">
								<ul>
									<li>
										<a href="#">公司简介</a>
									</li>
									<li>
										<a href="#">公司文化</a>
									</li>
									<li>
										<a href="#">领导致辞</a>
									</li>
									<li>
										<a href="#">服务理念</a>
									</li>
									<li>
										<a href="#">企业荣誉</a>
									</li>
								</ul>
							</div>
						</li>
						<li class="narrow_wrap">
							<a class="nav_btn" href="publicAnnounce.jsp">
								公告栏
								<b></b>
								<div></div>
							</a>
						</li>
						<li class="narrow_wrap">
							<a class="nav_btn" href="javascript:;">
								留言板
								<b></b>
							</a>
						</li>
						<li class="narrow_wrap">
							<a class="nav_btn" href="../X-admin/administrator.jsp">
								进入后台
								<b></b>
							</a>
						</li>
						<li class="narrow_wrap">
							<a class="nav_btn" href="../X-admin/login.jsp">
								退出
								<b></b>
							</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
    </div>
</div>
<!--子页-->
<div class="ziye_bj">
	<div class="ziye_tu">
		<img src="images/jdanli_03.jpg">
	</div>
</div>
<!--关于我们-->
<div class="zy_gywm">
	<div class="ejdh" style="height: 1050px;">
		<div class="shang_g"></div>
		<div class="women">
			<div class="btmc">
				<h1>P</h1>
				<p>留言展示<span>resentation</span></p>
			</div>
			<ul class="skb">
				<li style="background: #005bac; width: 25%;"></li>
				<li style="background: #ff8400; width: 20%;"></li>
				<li style="background: #d3d3d3; width: 55%;"></li>
			</ul>
		</div>
		<div class="zy_dh_lb">
			<ul>
				<li id="women"><img src="images/zy1_08.png"><a id="wenzidangq" href="#">关于留言</a></li>
				<li id="women" onclick="func()"><img src="images/zy1_08.png"><a id="wenzidangq" href="#">我要留言</a></li>

			</ul>
		</div>
	</div>
	<div class="touyin"></div>
	<div class="zynr_db" style="height: 1000px;">
		<div class="lujing">
			<h2>留言板</h2>
		</div>

		<ul class="skb" style="margin-bottom: 20px;">
			<li style="background: #005bac; width: 12%;"></li>
			<li style="background: #ff8400; width: 15%;"></li>
			<li style="background: #d3d3d3; width: 73%;"></li>
		</ul>

		<!--内容-->
		<div class="gsjj_nr">
			<div id="div1"></div>
<%--
				<li>
					<div class="anlz_tp_z">
						<div class="anlz_tp"><img src="images/jdanli_06.jpg"></div>
						<div class="anlz_fg">
							<a href="productslist.html" class="fg_xk">
								<p>查看详情</p>
								<img src="images/womends_06.png">
							</a>
						</div>
					</div>
					<a class="anlibt" href="productslist.html">三桥老街西城往事</a>
				</li>
--%>
</div>
<!--底部-->
	<div class="dibu_jz">
		<div class="dibu_zuo">
			<p>联系地址：江西省南昌市南路120号黔电发展楼6楼<br>
			电 话：0851-85594612   传 真：0851-85594612<br></p>
			<ul>
				<li><span>分享到：</span></li>
				<li><a href="http://connect.qq.com/widget/shareqq/index.html?url=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-sqq-1-12217-9737f6f9e09dfaf5d3fd14d775bfee85&title=%E5%A4%A9%E8%83%BD%E7%89%A9%E4%B8%9A%E7%AE%A1%E7%90%86&desc=&summary=&site=baidu" target="_black"><img src="images/dibu_06.png"></a></li>
				<li><a href="http://service.weibo.com/share/share.php" target="_black"><img src="images/dibu_08.png"></a></li>
				<li><a href="http://widget.renren.com/dialog/share?resourceUrl=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-renren-1-63647-98fde57bb3d39343db0f272b38411f3e&srcUrl=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-renren-1-63647-98fde57bb3d39343db0f272b38411f3e&title=%E5%A4%A9%E8%83%BD%E7%89%A9%E4%B8%9A%E7%AE%A1%E7%90%86&description=" target="_black"><img src="images/dibu_10.png"></a></li>
			</ul>
		</div>
		<div class="dibu_you">
			<ul>
				<li><a href="#">公司简介&nbsp;&nbsp;</a>｜</li>
				<li><a href="#">企业文化&nbsp;&nbsp;</a>｜</li>
				<li><a href="#">人才招聘&nbsp;&nbsp;</a>｜</li>
				<li><a href="#">意见反馈&nbsp;&nbsp;</a>｜</li>
				<li><a href="#">联系我们</a></li>
			</ul>
			<img class="dibu_logo" src="images/dibu_03.png">
		</div>
	</div>
</div>
<div class="dibu_1">
	<p>版权所有 江西绿地物业管理有限公司 黔ICP备10001741号<br>
技术支持：WangID 驰通网络</p>
</div>


</body>
</html>
