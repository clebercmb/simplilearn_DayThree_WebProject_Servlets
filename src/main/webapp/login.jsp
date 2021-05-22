<%--
  Created by IntelliJ IDEA.
  User: clebe
  Date: 5/22/2021
  Time: 12:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="LoginServlet" method="post">
        <input type="text" name="username" placeholder="Enter User Name"/>
        <input type="password" name="password" placeholder="Enter User Password"/>
        <input type="submit" value="login"/>
    </form>
</body>
</html>
