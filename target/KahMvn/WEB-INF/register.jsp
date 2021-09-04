<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Amir
  Date: 8/25/2021
  Time: 5:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register page</title>
</head>
<body>

<form method="post" action="<c:url value="/save-student.do"/>">


    <c:choose>
        <c:when test="${mode == 'edit'}">
            This is Edit page ! <br/> <br/> <br/>
        </c:when>
        <c:otherwise>
            This is registration page! <br/> <br/> <br/>
        </c:otherwise>
    </c:choose>
    <input type="text" name="id" value="${student.id}" hidden/>
    Name : <input type="text" name="name" value="${student.name}"/> <br/> <br/> <br/>
    Family : <input type="text" name="family" value="${student.family}" /> <br/> <br/> <br/>
    College : <input type="text" name="college" value="${student.college}"/> <br/> <br/> <br/>
    <input type="submit" value="save"/>
</form>

</body>
</html>
