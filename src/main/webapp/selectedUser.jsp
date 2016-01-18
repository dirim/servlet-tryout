<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dirim
  Date: 1/13/2016
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="/users/">
    <input type="hidden" name="id" value="${user.getID()}"/>
    name: <input type="text" name="name" value="${user.getName()}" /><br>
    username: <input type="text" name="username" value="${user.getUsername()}" /><br>
    Password: <input type="text" name="password" value="${user.getPassword()}" /><br>
    address: <input type="text" name="address" value="${user.getAddress()}" /><br>
    telephone: <input type="text" name="telephone" value="${user.getTelephone()}" /><br>
    <input type="submit" value="Yolla"/>
</form>

</body>
</html>
