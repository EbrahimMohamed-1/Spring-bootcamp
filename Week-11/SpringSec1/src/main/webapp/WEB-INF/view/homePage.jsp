<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 4/21/2025
  Time: 8:23 AM
  To change this template use File | Settings | File Templates.

--%>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap.min.css' />">
</head>
<body>
<h1>Welcome to the Home Page</h1>
<p>This is the public home page of the system.</p>
<form action="${pageContext.request.contextPath}/adminPage" method="get">
    <button type="submit">Got to admin page</button>
</form>
<form action="${pageContext.request.contextPath}/systemPage" method="get">
    <button type="submit">Got to system page</button>
</form>
<%--<form method="post" action="${pageContext.request.contextPath}/logout">--%>
<%--    <button type="submit">logout</button>--%>
<%--</form>--%>
</body>
</html>
