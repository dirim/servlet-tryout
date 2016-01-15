<%--
  Created by IntelliJ IDEA.
  model.User: dirim
  Date: 12/16/2015
  Time: 4:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <form method="post" action="/users">
       name: <input type="text" name="name" /><br>
       username: <input type="text" name="username" /><br>
       Password: <input type="password" name="password" /><br>
       address: <input type="text" name="address" /><br>
       telephone: <input type="text" name="telephone" /><br>
    <input type="submit" value="Yolla"/>
   </form>
</body>
</html>
