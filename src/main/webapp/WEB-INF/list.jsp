<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.KahMvn.ui.models.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Amir
  Date: 8/26/2021
  Time: 12:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<table border=" 1px solid black">
    <tr>
        <th style="color: crimson">Number</th>
<%--        <th style="color: crimson">ID</th>--%>
        <th style="color: crimson">Name</th>
        <th style="color: crimson">Family</th>
        <th style="color: crimson">College</th>
        <th style="color: crimson">Action</th>
    </tr>

    <c:forEach items="${allSts}" var="st" varStatus="i">
        <tr>
            <td style="color: crimson">${i.index+1}</td>
<%--            <td>${st.id}</td>--%>
            <td>${st.name}</td>
            <td>${st.family}</td>
            <td>${st.college}</td>
            <td><a href="/st-delete.do?id=${st.id}">del</a>  <a href="/edit.do">Edit</a></td>
        </tr>
    </c:forEach>


</table>
</body>
</html>
