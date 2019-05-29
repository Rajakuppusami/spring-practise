<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<form:form action="login" modelAttribute="loginmodel">
	
		User Name :-<form:input path="uname" />
		<form:errors path="uname" cssClass="error" />
		<br>
		<br>
		
		Password:- <form:password path="pwd" />
		<form:errors path="pwd" cssClass="error" />
		<br>
		<br>
		<input type="submit" value="Authenticate">

	</form:form>
</body>
</html>