<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  model.User: dirim
  Date: 12/16/2015
  Time: 4:48 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${users}" var="user">
        <tr>
            <td><a href="users/${user.getID()}"><c:out value="${user.getID()}" /></a><td><br>
            <td><c:out value="${user.getName()}" /><td><br>
            <td><c:out value="${user.getUsername()}" /><td><br>
            <td><c:out value="${user.getPassword()}" /><td><br>
            <td><c:out value="${user.getAddress()}" /><td><br>
            <td><c:out value="${user.getTelephone()}" /><td><br><br>
        </tr>
    </c:forEach>
</body>
</html>
