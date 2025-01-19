<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 1/17/2025
  Time: 3:27 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>User Form</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
  <style>

  </style>
</head>
<body>
<div class="form-container">
  <h1>Login</h1>
  <form:form action="processForm" modelAttribute="user">
    <div class="form-group">
      <label for="username">Username</label>
      <form:input type="text" id="username" placeholder="Administrator" path="username"/>
    </div>
    <div class="form-group">
      <label for="password">Password</label>
      <form:input type="password" id="password" placeholder="********" path="password"/>
    </div>
    <div class="form-group">
      <label for="country">Country</label>
      <form:select id="country"  path="country">
        <option value="brazil">Brazil</option>
        <option value="usa">USA</option>
        <option value="uk">UK</option>
        <option value="india">India</option>
      </form:select>
    </div>
    <div class="form-group">
      <label>Preferred Programming Language</label>
      <div class="radio-group" >
        <label><form:radiobutton type="radio" name="programmingLanguage" value="java" path="programmingLanguage"/> Java</label>
        <label><form:radiobutton type="radio" name="programmingLanguage" value="csharp" path="programmingLanguage"/> C#</label>
        <label><form:radiobutton type="radio" name="programmingLanguage" value="php" path="programmingLanguage" /> PHP</label>
        <label><form:radiobutton type="radio" name="programmingLanguage" value="ruby" path="programmingLanguage" /> Ruby</label>
      </div>
    </div>
    <div class="form-group">
      <label>Preferred Operating System</label>
      <div class="checkbox-group">
        <label><form:radiobutton type="checkbox" name="os" value="linux" path="operatingSystem"/> Linux</label>
        <label><form:radiobutton type="checkbox" name="os" value="macos" path="operatingSystem" /> Mac OS</label>
        <label><form:radiobutton type="checkbox" name="os" value="windows" path="operatingSystem" /> MS Windows</label>
      </div>
    </div>
    <button type="submit">Submit</button>
  </form:form>
</div>
</body>
</html>

