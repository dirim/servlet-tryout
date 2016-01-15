<%@ page import="model.User" %>
<%--
  Created by IntelliJ IDEA.
  User: dirim
  Date: 1/15/2016
  Time: 10:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

 name:   ${user.getName()}
    ${user.getUsername()}
    ${user.getPassword()}
    ${user.getAddress()}
    ${user.getTelephone()}

</body>
</html>
