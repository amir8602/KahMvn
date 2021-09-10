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
    <script src="JS/main.js" type="application/javascript"></script>
    <link rel="stylesheet" href="CSS/main.css"/>
    <title>Register page</title>
</head>
<body>

<form method="post" action="<c:url value="/save-student.do"/>" onsubmit="return validateForm()">


    <c:choose>
        <c:when test="${mode == 'edit'}">
            This is Edit page ! <br/>
        </c:when>
        <c:otherwise>
            This is registration page! <br/> <br/> <br/>
        </c:otherwise>
    </c:choose>
    <c:if test="${not empty validationMsg}">
        <p style="color: red">Why did you skip the js validation? !!!!???? )))): <br/> ${validationMsg} </p>
    </c:if>
    <input type="text" name="id" value="${student.id}" hidden/>
    <table>
        <tr>
            <td>Name : </td>
            <td><input type="text" id="name" name="name" value="${student.name}"/></td>
            <td class="required" id="validateMsgName">*This is required !!!</td>
        </tr>
        <tr>
            <td>Family : </td>
            <td><input type="text" id="family" name="family" value="${student.family}" /></td>
            <td class="required" id="validateMsgFamily">*This is required !!!</td>
        </tr>
        <tr>
            <td>College : </td>
            <td><input type="text" id="college" name="college" value="${student.college}" /></td>
            <td class="required" id="validateMsgCollege">*This is required !!!</td>
        </tr>
    </table>
    <input type="submit" value="save" />
</form>

</body>
</html>
