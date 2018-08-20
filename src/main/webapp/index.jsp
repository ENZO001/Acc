<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<title>首頁</title>
	<style type="text/css">
		td {
			padding: 15px;
		}
	</style>
</head>
<body ng-app="ACCOUNT">
	
	<div ng-controller="accountController" class="container">
<!-- 		<table> -->
<!-- 			<tr> -->
<!-- 				<td> -->
<!-- 					<button type="button" class="btn btn-primary" ng-click="toAccounting()">記帳</button> -->
<!-- 				</td> -->
<!-- 				<td> -->
<!-- 					<button type="button" class="btn btn-primary" ng-click="toShowConsumptionDetail()">顯示消費明細</button> -->
<!-- 				</td> -->
<!-- 				<td> -->
<!-- 					<button type="button" class="btn btn-primary" ng-click="toMaintainSystemParameter()">參數維護</button> -->
<!-- 				</td> -->
<!-- 			</tr> -->
<!-- 		</table> -->
		<table>
			<tr>
				<td>
					<a class="btn btn-default" ng-href="<%=request.getContextPath() %>/#/ACCOUNTING">記帳(ng-href)</a>
				</td>
				<td>
					<a class="btn btn-default" ng-href="<%=request.getContextPath() %>/#/SHOW_CONSUMPTION_DETAIL">顯示消費明細(ng-href)</a>
				</td>
				<td>
					<a class="btn btn-default" ng-href="<%=request.getContextPath() %>/#/MAINTAIN_SYSTEM_PARAMETER">參數維護(ng-href)</a>
				</td>
			</tr>
		</table>
	</div>
	
	<div class="container">
        <div class="container" ng-view></div>
    </div>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.5.8/angular.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.5.8/angular-route.min.js"></script>
	
	<script type="text/javascript" src="<%=request.getContextPath() %>/resources/js/module.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/resources/js/index.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/pages/MAINTAIN_SYSTEM_PARAMETER/MAINTAIN_SYSTEM_PARAMETER.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/pages/ACCOUNTING/ACCOUNTING.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/pages/SHOW_CONSUMPTION_DETAIL/SHOW_CONSUMPTION_DETAIL.js"></script>
</body>
</html>