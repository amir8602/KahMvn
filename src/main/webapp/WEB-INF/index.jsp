<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date" %>
<html>
<head>
    <link rel="stylesheet" href="CSS/main.css"/>
    <script src="JS/main.js" type="application/javascript" ></script>
    <title>Student site</title>
</head>
<body>
<h1>Welcome to Student Site !!!</h1>
<a class="link" href="<c:url value="/register.do"/>" onclick="f()">Register</a>
<br/>
<a href="<c:url value="/list.do"/>">List Of Registration</a>
</body>
</html>
