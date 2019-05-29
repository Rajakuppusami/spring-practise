<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="adduserdetails" modelAttribute="userbean">
	User Name :- <form:input path="name" />
		<form:errors path="name" cssClass="error" />
		<br>
		<br>
		
	Dob:- <form:input path="dob" />
		<form:errors path="dob" cssClass="error" />
		<br>
		<br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>