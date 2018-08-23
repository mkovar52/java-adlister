<%--
  Created by IntelliJ IDEA.
  User: mkovar
  Date: 8/22/18
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logout Page</title>
</head>
<body>
    <div class="container">
        <h1>Please Confirm By Clicking Button Below:</h1>
        <form action="/logout" method="POST">
            <button>Logout</button>
            <input type="hidden" name="logout" class="btn btn-primary btn-block" value="Logout">
        </form>
    </div>
</body>
</html>
