<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>

<!-- 新 Bootstrap 核心 CSS 文件 -->
<link
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<!-- 可选的Bootstrap主题文件（一般不使用） -->
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
			</div>
		</div>
		<div class="row">
			<div class="col-md-2">
				<h3 class="text-muted">Home</h3>
			</div>
			<div class="col-md-2"></div>
			<div class="col-md-2"></div>
			<div class="col-md-2"></div>
			<div class="col-md-2"></div>
			<div class="col-md-1">

				<button type="button" class="btn btn-info">Login</button>
			</div>
			<div class="col-md-1">

				<button type="button" class="btn btn-success">Register</button>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3">
				<div class="panel-group" id="panel-607958">
					<div class="panel panel-default">
						<div class="panel-heading">
							<a class="panel-title collapsed" data-toggle="collapse"
								data-parent="#panel-607958" href="#panel-element-870634">Collapsible
								Group Item #1</a>
						</div>
						<div id="panel-element-870634" class="panel-collapse collapse">
							<div class="panel-body">Anim pariatur cliche...</div>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<a class="panel-title collapsed" data-toggle="collapse"
								data-parent="#panel-607958" href="#panel-element-278500">Collapsible
								Group Item #2</a>
						</div>
						<div id="panel-element-278500" class="panel-collapse collapse">
							<div class="panel-body">Anim pariatur cliche...</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-9">
				<div class="tabbable" id="tabs-125171">
					<ul class="nav nav-tabs">
						<li class="active"><a href="#panel-799889" data-toggle="tab">Section
								1</a></li>
						<li><a href="#panel-312440" data-toggle="tab">Section 2</a></li>
					</ul>
					<div class="tab-content">
						<div class="tab-pane active" id="panel-799889">
							<p>I'm in Section 1.</p>
						</div>
						<div class="tab-pane" id="panel-312440">
							<p>Howdy, I'm in Section 2.</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script
		src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>