<%--
  Created by IntelliJ IDEA.
  model.User: dirim
  Date: 12/16/2015
  Time: 3:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalTime" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Saat Kaç?</title>
</head>
<body>

<h1>JSP Örneği</h1>

Saat :<%= LocalTime.now() %>

</body>
</html>
