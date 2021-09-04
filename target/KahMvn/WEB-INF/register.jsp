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

<form method="post" action="/save-student.do">

    <input type="text" name="id" value="${student.id}" hidden/>
    Name : <input type="text" name="name" value="${student.name}"/> <br/> <br/> <br/>
    Family : <input type="text" name="family" value="${student.family}" /> <br/> <br/> <br/>
    College : <input type="text" name="college" value="${student.college}"/> <br/> <br/> <br/>
    <input type="submit" value="save"/>
</form>

</body>
</html>
