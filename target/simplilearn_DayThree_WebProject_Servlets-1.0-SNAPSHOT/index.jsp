<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1><%= "Hello World!" %>
    </h1>
    <br/>
    <!--a href="hello-servlet">Hello Servlet</a-->

    <form action="FirstServlet" method="get">
        <input type="text" name="username" placeholder="Enter Your Name..."/>
        <input type="password" name="password" placeholder="Enter Your Password..."/>
        <input type="submit" value = "Click Me GET"/>
    </form>

    <form action="FirstServlet" method="post">
        <input type="text" name="username" placeholder="Enter Your Name..."/>
        <input type="password" name="password" placeholder="Enter Your Password..."/>
        <input type="submit" value = "Click Me POST"/>
    </form>


</body>
</html>