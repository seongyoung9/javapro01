<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jstl42forward</title>
</head>
<body>
	<h3>JSTL 변수 선언 >> jstl42forward</h3>

	<c:set var="code" value="800"  scope="request"/>
	<c:set var="name" value="sdfdsfawd" scope="request"/>

	<jsp:forward page="jstl03.jsp">
		<jsp:param name="price" value="786456" />
		<jsp:param name="browser" value="내꺼" />
	</jsp:forward>
	
</body>
</html>