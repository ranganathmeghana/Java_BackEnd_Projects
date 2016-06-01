<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WELCOME PAGE</title>
</head>
<body>
<form action="GetPrimeNumbers" method="get"> 
<!-- <form action="Database" method="post"> -->
Number: <input type="text" name="number">
<input type="submit" value="submit">

<%-- <c:forEach items="${pList}" var="pnum">
		<p>${pnum}</p>
		</c:forEach> --%>
</form>
</body>
</html>