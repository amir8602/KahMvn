<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date" %>
<html>
<head><title>Student site</title></head>
<body>
<h1>Welcome to Student Site !!!</h1>
<a href="<c:url value="/register.do"/>">Register</a>
<br/>
<a href="<c:url value="/list.do"/>">List Of Registration</a>
</body>
</html>
