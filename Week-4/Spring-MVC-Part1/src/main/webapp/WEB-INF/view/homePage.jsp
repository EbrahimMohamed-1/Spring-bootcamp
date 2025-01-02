<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 12/26/2024
  Time: 1:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>homePage</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<form action="resultPage.jsp">
    <br><br>
    <label>
        <input type="text" placeholder="year" name="name">
        <input type="text" placeholder="month" name="month">
        <input type="text" placeholder="day" name="day">
    </label>
    <br><br>
    <input type="submit" value="calculate">

</form>

</body>
</html>
