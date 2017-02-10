<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="dept/insert.action" method="post">
		名称：<input type="text" name="deptName" /><br/>
		地址：<input type="text" name="deptAddress" /><br/>
		<input type="submit" value="增加"><br/>
	</form>
	
	
	
		<form action="supplier/insert.action" method="post">
		姓名：<input type="text" name="supName" />
		称号：<input type="text" name="supLinkman" /><br/>
		手机号：<input type="text" name="supPhone" />
		地址：<input type="text" name="supAddress" /><br/>
		备注：<input type="text" name="supRemark" /><br/>
		<input type="submit" value="增加">
	</form>
</body>
</html>