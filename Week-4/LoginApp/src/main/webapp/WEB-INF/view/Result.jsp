<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 1/21/2025
  Time: 5:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<%--  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">--%>
    <title>Title</title>
</head>
<body>
<h1>Hello to Student App</h1>
<br/>
<h3>username is : ${mser.username} </h3>
<br/>
<h3>password is : ${mser.password} </h3>
<br/>
<h3>Country is : ${mser.country} </h3>
<br>
<h3>programming language is : ${mser.programmingLanguage} </h3>
<br/>
<h3>OS is : ${mser.operatingSystem} </h3>
<%--    <h3>second prog lang is : ${userModelResult.operatingSystem[1]} </h3>--%>
</body>
</html>
