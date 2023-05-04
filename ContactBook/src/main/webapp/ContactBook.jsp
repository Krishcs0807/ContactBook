<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
 <c:forEach var="j" begin="1" end="10">
 <h1> how are you<c:out value="${j}"></c:out></h1>
 
 </c:forEach>
</table>
</body>
</html>