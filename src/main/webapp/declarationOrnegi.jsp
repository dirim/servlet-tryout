<%@ page import="java.time.LocalTime" %><%--
  Created by IntelliJ IDEA.
  model.User: dirim
  Date: 12/16/2015
  Time: 4:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%! LocalTime time1 = LocalTime.now(); %>
<% LocalTime time2 = LocalTime.now(); %>

<p><%= "Time 1: " + time1   %></p>
<p><%= "Time 2: " + time2   %></p>
</body>
</html>
