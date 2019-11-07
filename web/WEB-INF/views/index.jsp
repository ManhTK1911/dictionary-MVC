<%--
  Created by IntelliJ IDEA.
  User: manhtk
  Date: 07/11/2019
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary MVC</title>
  </head>
  <body>
  <form method="get" action="/dictionary">
    <fieldset>
      <legend>Dictionary</legend>
      <p><input type="text" name="word" placeholder="Enter your word..." value="${word}"><input type="submit" value="Search"></p>
      <p>Result: <input type="text" value="${result}" disabled</p>
    </fieldset>
  </form>
  </body>
</html>
